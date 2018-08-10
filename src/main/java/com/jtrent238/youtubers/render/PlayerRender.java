package com.jtrent238.youtubers.render;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.FileUtils;
import org.lwjgl.opengl.GL11;

import com.jtrent238.youtubers.YTConfig;
import com.jtrent238.youtubers.entity.PlayerEntity;

public class PlayerRender
  extends RenderBiped
{
  public static final ResourceLocation locationStevePng = new ResourceLocation("youtubers", "textures/entity/steve.png");
  public HashMap<String, ResourceLocation> Textures = new HashMap();
  
  public PlayerRender()
  {
    super(new ModelBiped(), 0.2F);
  }
  
  protected void func_82421_b()
  {
    this.field_82423_g = new ModelBiped(1.0F);
    this.field_82425_h = new ModelBiped(0.5F);
  }
  
  public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
  {
    super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void renderPlayer(EntityLivingBase par1EntityLivingBase, double par2, double par4, double par6, float par8, float par9)
  {
    super.doRender((EntityLiving)par1EntityLivingBase, par2, par4, par6, par8, par9);
  }
  
  public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
  {
    super.doRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
  }

  protected ResourceLocation func_110775_a(Entity entity)
  {
    boolean testing = false;
    if (testing) {
      return locationStevePng;
    }
    PlayerEntity player = (PlayerEntity)entity;
    if ((player.RenderFailed) || (YTConfig.Offline)) {
      return locationStevePng;
    }
    File file = new File("options.txt");
    try
    {
      String txt = FileUtils.readFileToString(file);
      if (!txt.contains("YoutubersSkin"))
      {
        YTConfig.Offline = true;
        return locationStevePng;
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    if (this.Textures.containsKey(player.getName())) {
      return (ResourceLocation)this.Textures.get(player.getName());
    }
    File f = new File("resourcepacks/YoutubersSkin/assets/youtubers/textures/entity/Player/" + player.getName() + ".png");
    if ((f.exists()) && (!f.isDirectory()))
    {
      System.out.println("File Found but not in list");
      
      TestFileSize("resourcepacks/YoutubersSkin/assets/youtubers/textures/entity/Player/" + player.getName() + ".png");
      
      ResourceLocation tex = new ResourceLocation("youtubers", "textures/entity/Player/" + player.getName() + ".png");
      this.Textures.put(player.getName(), tex);
      return tex;
    }
    if (!YTConfig.Offline) {
      try
      {
        System.out.println("Attempting to save File");
        
        new File("resourcepacks/YoutubersSkin/assets/youtubers/textures/entity/Player").mkdirs();
        saveImage("http://skins.minecraft.net/MinecraftSkins/" + player.getName() + ".png", "resourcepacks/YoutubersSkin/assets/youtubers/textures/entity/Player/" + player.getName() + ".png");
        
        ResourceLocation tex = new ResourceLocation("youtubers", "textures/entity/Player/" + player.getName() + ".png");
        
        this.Textures.put(player.getName(), tex);
        return tex;
      }
      catch (IOException e)
      {
        System.out.println(e.fillInStackTrace());
        System.out.println("save File Failed");
        player.RenderFailed = true;
        return locationStevePng;
      }
    }
    System.out.println("save File canceled");
    player.RenderFailed = true;
    return locationStevePng;
  }
  
  public static void saveImage(String imageUrl, String destinationFile)
    throws IOException
  {
    URL url = new URL(imageUrl);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(new File(destinationFile));
    
    byte[] b = new byte['?'];
    int length;
    while ((length = is.read(b)) != -1) {
      os.write(b, 0, length);
    }
    is.close();
    os.close();
    
    TestFileSize(destinationFile);
  }
  
  private static void TestFileSize(String destinationFile)
  {
    File img = new File(destinationFile);
    BufferedImage buffImg = new BufferedImage(64, 32, 2);
    try
    {
      buffImg = ImageIO.read(img);
    }
    catch (IOException localIOException) {}
    if (buffImg.getHeight() != 32)
    {
      BufferedImage croppedImage = buffImg.getSubimage(0, 0, 64, 32);
      try
      {
        BufferedImage bi = croppedImage;
        File outputfile = new File(destinationFile);
        ImageIO.write(bi, "png", outputfile);
      }
      catch (IOException localIOException1) {}
    }
  }
}

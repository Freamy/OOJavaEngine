package org.freamcoding.OOEngine.Game.graphics.graphicsStore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import static org.lwjgl.opengl.GL11.*;

public class Frame {
	
	private Texture texture; 
	
	public Frame(String texturePath){
		try{
			String fileName = new File(texturePath).getName();
			String[] precise = fileName.split("_");
			String[] split = fileName.split("\\.");
			boolean isPrecise = precise[0].equalsIgnoreCase("prc");
			
			FileInputStream inputStream = new FileInputStream(texturePath);
			texture = TextureLoader.getTexture(split[1], inputStream);
			
			if(isPrecise) texture.setTextureFilter(GL_NEAREST);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void bindTexture(){
		texture.bind();
	}
}
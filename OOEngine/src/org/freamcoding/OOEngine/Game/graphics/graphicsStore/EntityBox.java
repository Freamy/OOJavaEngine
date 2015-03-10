package org.freamcoding.OOEngine.Game.graphics.graphicsStore;

import java.io.File;
import java.util.ArrayList;

import org.freamcoding.OOEngine.Game.Entity.Entity;

public class EntityBox {
	
	private ArrayList<Animation> animations;
	private String key;
	
	public EntityBox(String path){
		animations = new ArrayList<Animation>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		key = folder.getName(); 
		for(File file: listOfFiles){
			animations.add(new Animation(file.getPath()));
		}
	}
	
	public boolean isKeyMatch(String inKey){
		return key.compareToIgnoreCase(inKey) == 0;
	}
	
	public void bindTexture(Entity entity){
		for(Animation animation: animations){
			if(animation.isKeyMatch(entity.getStance())){
				animation.bindFrame(entity.getFrame());
				return;
			}
		}
	}
}

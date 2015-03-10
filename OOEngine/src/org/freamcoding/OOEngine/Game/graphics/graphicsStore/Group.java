package org.freamcoding.OOEngine.Game.graphics.graphicsStore;

import java.io.File;
import java.util.ArrayList;

import org.freamcoding.OOEngine.Game.Entity.Entity;

public class Group {
	
	private ArrayList<EntityBox> entities;
	
	private String key;
	
	public Group(String path){
		entities = new ArrayList<EntityBox>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		key = folder.getName();
		for(File file: listOfFiles){
			entities.add(new EntityBox(file.getPath()));
		}
	}
	
	public boolean isKeyMatch(String inKey){
		return key.compareToIgnoreCase(inKey) == 0;
	}
	
	public void bindTexture(Entity entity){
		for(EntityBox entityTexture: entities){
			if(entityTexture.isKeyMatch(entity.getKey())){
				entityTexture.bindTexture(entity);
				return;
			}
		}
	}

}

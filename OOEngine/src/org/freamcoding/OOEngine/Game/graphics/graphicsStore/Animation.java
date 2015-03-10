package org.freamcoding.OOEngine.Game.graphics.graphicsStore;

import java.io.File;
import java.util.ArrayList;

public class Animation {
	
	private ArrayList<Frame> frames;
	private String key;
	
	private int animationLength;
	
	public Animation(String path){
		frames = new ArrayList<Frame>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		key = folder.getName();
		for(File file: listOfFiles){
			frames.add(new Frame(file.getPath()));
			animationLength = listOfFiles.length;
		}
	}
	
	public boolean isKeyMatch(String inKey){
		return key.compareToIgnoreCase(inKey) == 0;
	}
	
	public void bindFrame(int key){
		int convertedKey = (key%(animationLength+1));
		frames.get(convertedKey).bindTexture();
	}

}

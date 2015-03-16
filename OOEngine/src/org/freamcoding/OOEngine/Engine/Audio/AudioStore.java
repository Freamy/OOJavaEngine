package org.freamcoding.OOEngine.Engine.Audio;

import java.io.IOException;

import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;

public class AudioStore {
	
	public String name;
	public Audio soundFile;
	
	public AudioStore(String n, String path){
		name = n;
		try {
			soundFile = AudioLoader.getAudio("WAV", 
					ResourceLoader.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

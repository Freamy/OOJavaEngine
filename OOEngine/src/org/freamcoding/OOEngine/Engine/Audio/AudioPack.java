package org.freamcoding.OOEngine.Engine.Audio;

import java.util.ArrayList;

public class AudioPack {
	
	public ArrayList<AudioStore> audioPack;
	
	public AudioPack(){
		audioPack = new ArrayList<AudioStore>();
	}
	
	public AudioStore getAudioStore(String name){
		for(AudioStore as: audioPack){
			if(as.name.toLowerCase().equals(name.toLowerCase())) return as;
		}
		return null;
	}
}


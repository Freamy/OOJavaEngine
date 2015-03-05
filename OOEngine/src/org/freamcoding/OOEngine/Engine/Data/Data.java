package org.freamcoding.OOEngine.Engine.Data;

public class Data {
	
	/** Variables dealing with resolution **/
	private Resolution resolution;
	private boolean fullScreen;
	
	/** Variables dealing with debug commands **/
	private boolean debugMode;
	
	public Data(){
	}

	/** Get - Set pairs **/
	
	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

	public boolean isFullScreen() {
		return fullScreen;
	}

	public void setFullScreen(boolean fullScreen) {
		this.fullScreen = fullScreen;
	}

	public boolean isDebugMode() {
		return debugMode;
	}

	public void setDebugMode(boolean debugMode) {
		this.debugMode = debugMode;
	}
}

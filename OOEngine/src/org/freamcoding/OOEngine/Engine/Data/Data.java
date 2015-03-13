package org.freamcoding.OOEngine.Engine.Data;

public class Data {
	
	/** Variables dealing with resolution **/
	private Resolution resolution;
	private boolean fullScreen;
	
	private int screenWidth;
	private int screenHeight;
	
	/** Variables dealing with debug commands **/
	private boolean debugMode;
	
	public Data(){
	}
	
	public void calculateScreenParameters(int blockSize){
		screenHeight = resolution.getHeight()/blockSize;
		screenWidth = resolution.getWidth()/blockSize;
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

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}
}

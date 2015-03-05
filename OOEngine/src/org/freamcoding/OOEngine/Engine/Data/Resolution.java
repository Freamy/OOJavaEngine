package org.freamcoding.OOEngine.Engine.Data;

public class Resolution {
	
	private int width;
	private int height;
	
	public Resolution(int w, int h){
		width = w;
		height = h;
	}
	
	/** Get - Set pairs **/
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}

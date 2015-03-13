package org.freamcoding.OOEngine.Engine.Camera;

import org.freamcoding.OOEngine.Game.Entity.Entity;

public class Camera {
	
	private int blockX;
	private int blockY;
	
	private float x;
	private float y;
	
	private int offsetX;
	private int offsetY;
	
	public Camera(int inX, int inY){
		x = 0;
		y = 0;
		blockX = 0;
		blockY = 0;
		offsetX = inX;
		offsetY = inY;
	}
	
	public void setLocation(Entity e){
		x = e.getX();
		y = e.getY();
		blockX = e.getBlockX();
		blockY = e.getBlockY();
	}
	
	public void incX(){
		x++;
	}
	
	public void decX(){
		x--;
	}
	
	public void incY(){
		y++;
	}
	
	public void decY(){
		y--;
	}
	
	/** Get - Set pairs **/
	
	public float getCombinedX(){
		return x + offsetX;
	}
	
	public float getCombinedY(){
		return y + offsetY;
	}

	public int getBlockX() {
		return blockX;
	}

	public void setBlockX(int blockX) {
		this.blockX = blockX;
	}

	public int getBlockY() {
		return blockY;
	}

	public void setBlockY(int blockY) {
		this.blockY = blockY;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}

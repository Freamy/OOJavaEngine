package org.freamcoding.OOEngine.Game.Entity;

import org.freamcoding.OOEngine.Engine.Camera.Camera;

public abstract class Entity {
	
	protected String key;
	protected String stance;
	protected String typeKey;
	protected int frame;
	protected int animationSize;
	
	protected int blockX;
	protected int blockY;

	protected int x;
	protected int y;
	
	protected int size;
	
	protected float rotation;
	
	public abstract void execute();
	public abstract void update();
	
	public Entity(int bX, int bY){
		blockX = bX;
		blockY = bY;
		size = 96;
	}
	
	public void tick(){
		update();
		frame++;
	}
	
	protected String makeKey(){
		String[] keyConvert = this.getClass().getName().split("\\.");
		return keyConvert[keyConvert.length-1];
	}
	
	public float[] makeDrawCoordinates(Camera cam){
		float[] tmp = new float[2];
		tmp[0] = blockX*size+x + cam.getCombinedX();
		tmp[1] = blockY*size+y + cam.getCombinedY();
		return tmp;
	}
	
	/** Get - Set pairs **/
	
	public int getFrame() {
		return frame;
	}

	public void setFrame(int frame) {
		this.frame = frame;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getStance() {
		return stance;
	}

	public void setStance(String stance) {
		this.stance = stance;
	}
	
	public String getTypeKey() {
		return typeKey;
	}

	public void getTypeKey(String typeKey) {
		this.typeKey = typeKey;
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
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getSize(){
		return size;
	}
	
	public float getRotation() {
		return rotation;
	}
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	
}

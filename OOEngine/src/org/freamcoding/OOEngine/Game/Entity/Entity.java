package org.freamcoding.OOEngine.Game.Entity;

public abstract class Entity {
	
	protected String key;
	protected String stance;
	protected String typeKey;
	protected int frame;
	protected int animationSize;

	public abstract void execute();
	public abstract void update();
	
	public void tick(){
		update();
		frame++;
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
}

package org.freamcoding.OOEngine.Game.Entity.Actor;

public class Dummy extends Actor {
	
	public Dummy(){
		this.frame = 0;
		this.key = makeKey();
		this.stance = "standing";
	}
	
	private String makeKey(){
		String[] keyConvert = this.getClass().getName().split("\\.");
		return keyConvert[keyConvert.length-1];
	}

	@Override
	public void execute() {
		
	}

	@Override
	public void update() {
		
	}
}

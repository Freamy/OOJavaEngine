package org.freamcoding.OOEngine.Game.Entity.Actor;

public class Dummy extends Actor {
	
	public Dummy(int bX, int bY){
		super(bX, bY);
		this.key = makeKey();
		this.frame = 0;
		this.stance = "standing";
	}
	
	@Override
	public void execute() {
		
	}

	@Override
	public void update() {
		
	}
}

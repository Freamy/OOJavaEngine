package org.freamcoding.OOEngine.Game.Entity.Actor;

import org.freamcoding.OOEngine.Game.Entity.Entity;

public abstract class Actor extends Entity{
	
	//protected Stance stance;
	
	public static enum Stance{
		standing, attacking
	};

	public Actor(int bX, int bY){
		super(bX,bY);
		typeKey = "actor";
	}
	
	
}

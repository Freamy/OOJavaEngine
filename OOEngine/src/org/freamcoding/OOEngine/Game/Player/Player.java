package org.freamcoding.OOEngine.Game.Player;

import java.util.ArrayList;

import org.freamcoding.OOEngine.Game.Entity.Actor.Actor;
import org.freamcoding.OOEngine.Game.Entity.Actor.Dummy;

public class Player {
	
	private ArrayList<Actor> playerActors;
	
	public Player(){
		playerActors = new ArrayList<Actor>();
		playerActors.add(new Dummy(0,0));
		playerActors.add(new Dummy(1,0));
		playerActors.add(new Dummy(-1,0));
	}
	
	/** Get - Set pairs **/

	public ArrayList<Actor> getPlayerActors() {
		return playerActors;
	}

	public void setPlayerActors(ArrayList<Actor> playerActors) {
		this.playerActors = playerActors;
	}
	
	public Actor getActor(int id){
		if(id >= 0 && id < playerActors.size())
			return playerActors.get(id);
		else throw new IndexOutOfBoundsException();
	}
	
	public void addActor(Actor actor){
		playerActors.add(actor);
	}

}

package org.freamcoding.OOEngine.Game.Player;

import java.util.ArrayList;

import org.freamcoding.OOEngine.Game.Entity.Actor.Actor;
import org.freamcoding.OOEngine.Game.Entity.Actor.Dummy;

public class Player {
	
	private ArrayList<Actor> playerActors;
	
	public Player(){
		playerActors = new ArrayList<Actor>();
		playerActors.add(new Dummy());
	}
	
	/** Get - Set pairs **/

	public ArrayList<Actor> getPlayerActors() {
		return playerActors;
	}

	public void setPlayerActors(ArrayList<Actor> playerActors) {
		this.playerActors = playerActors;
	}
	
	public Actor getActor(int id){
		if(id < playerActors.size() && id > 0)
			return playerActors.get(id);
		else throw new IndexOutOfBoundsException();
	}
	
	public void addActor(Actor actor){
		playerActors.add(actor);
	}

}

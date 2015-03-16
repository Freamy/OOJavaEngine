package org.freamcoding.OOEngine.Game.Screen;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Entity.Actor.Actor;
import org.freamcoding.OOEngine.Game.GameData.GameData;

public class GameScreen extends Screen {

	@Override
	protected void paint(Data engineData, GameData gameData) {
		this.gameData = gameData;
		this.engineData = engineData;
		paintActors(engineData, gameData);
		float x = gameData.getCamera().getCombinedX();
		float y = gameData.getCamera().getCombinedY();
		drawQuad(x, y, 32, 32);
	}
	
	protected void paintActors(Data engineData, GameData gameData){
		for(Actor actor: gameData.getPlayer(0).getPlayerActors()){
			this.drawEntity(actor);
		}
	}

}

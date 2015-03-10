package org.freamcoding.OOEngine.Game.Screen;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Entity.Actor.Actor;
import org.freamcoding.OOEngine.Game.GameData.GameData;

public class GameScreen extends Screen {


	@Override
	protected void paint(Data engineData, GameData gameData) {
		for(Actor actor: gameData.player.getPlayerActors()){
			gameData.getGraphics().bindTexture(actor);
			this.drawQuad();
		}
	}

}

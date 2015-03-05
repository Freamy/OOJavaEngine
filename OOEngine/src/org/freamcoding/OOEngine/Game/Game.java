package org.freamcoding.OOEngine.Game;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.freamcoding.OOEngine.Game.Screen.Screen;

public class Game {
	
	private Data engineData;
	private Screen screen;
	
	private GameData gameData;
	
	public void start(Data engineData){
		this.engineData = engineData;
		initGameElements();
		gameLoop();
	}
	
	private void initGameElements(){
		screen = new Screen();
		gameData = new GameData();
	}
	
	private void gameLoop(){
		while(gameData.isRunning()){
			screen.render(engineData);
		}
	}
}

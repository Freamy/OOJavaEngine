package org.freamcoding.OOEngine.Game;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.freamcoding.OOEngine.Game.Screen.*;

public class Game {
	
	private Data engineData;
	private Screen screen;
	
	private GameData gameData;
	private InputHandler inputHandler;
	
	public void start(Data engineData){
		this.engineData = engineData;
		initGameElements();
		gameLoop();
	}
	
	private void initGameElements(){
		screen = new GameScreen();
		gameData = new GameData();
		inputHandler = new InputHandler(gameData);
	}
	
	private void gameLoop(){
		while(gameData.isRunning()){
			inputHandler.handleInput(new Entity());
			screen.render(engineData);
		}
	}
}

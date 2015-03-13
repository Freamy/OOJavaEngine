package org.freamcoding.OOEngine.Game;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.freamcoding.OOEngine.Game.Logic.GameLogic;
import org.freamcoding.OOEngine.Game.Logic.Logic;
import org.freamcoding.OOEngine.Game.Screen.*;

public class Game {
	
	private Data engineData;
	private Screen screen;
	
	private GameData gameData;
	private InputHandler inputHandler;
	private Logic logic;
	
	public void start(Data engineData){
		this.engineData = engineData;
		initGameElements();
		gameLoop();
	}
	
	private void initGameElements(){
		screen = new GameScreen();
		gameData = new GameData(engineData);
		logic = new GameLogic();
		engineData.calculateScreenParameters(gameData.getBlockSize());
		inputHandler = new InputHandler(gameData, engineData);
	}
	
	private void gameLoop(){
		while(gameData.isRunning()){
			logic.iterate(engineData, gameData, screen, inputHandler);
		}
	}
}

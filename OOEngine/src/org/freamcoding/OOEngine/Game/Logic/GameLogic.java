package org.freamcoding.OOEngine.Game.Logic;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.InputHandler;
import org.freamcoding.OOEngine.Game.Command.MoveUpCommand;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.freamcoding.OOEngine.Game.Screen.Screen;

public class GameLogic extends Logic {
	
	@Override
	public void iterate(Data engineData, GameData gameData, Screen screen, InputHandler inputHandler) {
		this.engineData = engineData;
		this.gameData = gameData;
		this.inputHandler = inputHandler;
		inputLogic();
		cameraLogic();
		new MoveUpCommand().execute(gameData.getPlayer(0).getActor(0));
		gameData.getCamera().setLocation(gameData.getPlayer(0).getActor(0));
		screen.render(engineData, gameData);
	}
	
	private void inputLogic(){
		inputHandler.handleInput(null, gameData);
	}
	
	private void cameraLogic(){
		if(inputHandler.getMouseX() < engineData.getResolution().getWidth()*0.1f) gameData.getCamera().decX();
		if(inputHandler.getMouseY() < engineData.getResolution().getHeight()*0.1f) gameData.getCamera().decY();
		if(inputHandler.getMouseX() > engineData.getResolution().getWidth()-engineData.getResolution().getWidth()*0.1f) gameData.getCamera().incX();
		if(inputHandler.getMouseY() > engineData.getResolution().getHeight()-engineData.getResolution().getHeight()*0.1f) gameData.getCamera().incY();
	}
}

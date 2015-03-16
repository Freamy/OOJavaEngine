package org.freamcoding.OOEngine.Game;

import org.freamcoding.OOEngine.Engine.Camera.Camera;
import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Command.*;
import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class InputHandler {
	private boolean canPressKeys;
	private boolean canClick;
	
	private GameData gameData;
	private Data engineData;
	
	public InputHandler(GameData gameData, Data engineData){
		this.gameData = gameData;
		this.engineData = engineData;
		canPressKeys = true;
		canClick = true;
	}
	
	public void handleInput(Entity entity, GameData gameData){
		this.gameData = gameData;
		resetFlags();
		if(canPressKeys) {
			handleKeyboardInput(entity);
		}
		if(canClick){
			handleMouseInput(entity);
		}
	}
	
	private void resetFlags(){
		if(noKeysDown()) canPressKeys = true;
		if(noMouseDown()) canClick = true;
	}
	
	private boolean noKeysDown(){
		for(int i = 0; i < Keyboard.getKeyCount(); i++)
			if(Keyboard.isKeyDown(i)) return false;
		return true;
	}
	
	private boolean noMouseDown(){
		for(int i = 0; i < Mouse.getButtonCount(); i++)
			if(Mouse.isButtonDown(i)) return false;
		return true;
	}
	
	private void handleKeyboardInput(Entity entity){
		escapeKeyHandler(entity);
	}
	
	private void escapeKeyHandler(Entity entity){
		if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
			canPressKeys = false;
			System.out.println("<3");
			new ExitCommand().execute(gameData);
		}
	}
	
	private void handleMouseInput(Entity entity){
	}
	
	public int getRelativeMouseX(Camera camera){
		return (int)(getMouseX() - camera.getX());
	}
	
	public int getRelativeMouseY(Camera camera){
		return (int)(getMouseY() - camera.getY());
	}
	
	public int getMouseX(){
		return Mouse.getX();
	}
	
	public int getMouseY(){
		return engineData.getResolution().getHeight()-Mouse.getY();
	}
}
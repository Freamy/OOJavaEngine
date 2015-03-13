package org.freamcoding.OOEngine.Game.Logic;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.InputHandler;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.freamcoding.OOEngine.Game.Screen.Screen;

public abstract class Logic {
	
	protected Data engineData;
	protected GameData gameData;
	protected InputHandler inputHandler;
	
	public abstract void iterate(Data engineData, GameData gameData, Screen screen, InputHandler inputHandler);

}

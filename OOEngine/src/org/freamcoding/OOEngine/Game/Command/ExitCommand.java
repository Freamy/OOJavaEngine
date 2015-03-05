package org.freamcoding.OOEngine.Game.Command;

import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;

public class ExitCommand extends Command{

	@Override
	public void execute(Entity entity) {
	}

	@Override
	public void execute(GameData gameData) {
		gameData.stopGame();
	}

}

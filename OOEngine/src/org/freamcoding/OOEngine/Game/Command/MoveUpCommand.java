package org.freamcoding.OOEngine.Game.Command;

import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;

public class MoveUpCommand extends Command{

	@Override
	public void execute(Entity entity) {
		entity.moveUp();
	}

	@Override
	public void execute(GameData gameData) {
		// TODO Auto-generated method stub
		
	}

}

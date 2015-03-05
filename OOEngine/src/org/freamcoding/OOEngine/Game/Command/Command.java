package org.freamcoding.OOEngine.Game.Command;

import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;

public abstract class Command {
	public abstract void execute(Entity entity);
	public abstract void execute(GameData gameData);
}

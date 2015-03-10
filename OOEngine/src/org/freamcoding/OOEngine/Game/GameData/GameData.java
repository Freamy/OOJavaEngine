package org.freamcoding.OOEngine.Game.GameData;

import org.freamcoding.OOEngine.Game.Player.Player;
import org.freamcoding.OOEngine.Game.graphics.Graphics;

public class GameData {
	private boolean running;
	private Graphics graphics;
	
	public Player player;

	public GameData(){
		running = true;
		player = new Player();
		graphics = new Graphics();
	}
	
	public void stopGame() {
		running = false;
	}
	
	/** Get - Set pairs **/
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public Graphics getGraphics() {
		return graphics;
	}
}

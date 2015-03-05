package org.freamcoding.OOEngine.Game.GameData;

public class GameData {
	private boolean running;

	public GameData(){
		running = true;
	}
	
	/** Get - Set pairs **/
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}

package org.freamcoding.OOEngine.Game.GameData;

import java.util.ArrayList;

import org.freamcoding.OOEngine.Engine.Camera.Camera;
import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Player.Player;
import org.freamcoding.OOEngine.Game.graphics.Graphics;

public class GameData {
	private boolean running;
	private Graphics graphics;
	
	private int blockSize;
	private Camera camera;
	
	private ArrayList<Player> players;

	public GameData(Data engineData){
		running = true;
		players = new ArrayList<Player>();
		players.add(new Player());
		graphics = new Graphics();
		camera = new Camera(engineData.getResolution().getWidth()/2, engineData.getResolution().getHeight()/2);
		blockSize = 96;
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

	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	public Player getPlayer(int id){
		if(id >= 0 && id < players.size()) return players.get(0);
		throw new IndexOutOfBoundsException();
	}
}

package org.freamcoding.OOEngine.Engine;

import static org.lwjgl.opengl.GL11.*;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Engine.Data.Resolution;
import org.freamcoding.OOEngine.Game.Game;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Engine {
	
	private Data engineData;
	private Game game;
	
	public Engine(){
		engineData = new Data();
		game = new Game();
	}
	
	public void start(){
		initDisplay();
		initOpenGl();
		game.start(engineData);
	}
	
	private void initDisplay(){
		try {
			DisplayMode dpm = initResolution();
			Display.setDisplayMode(dpm);
			Display.setInitialBackground(0, 0, 0);
			Display.create();
			Display.setVSyncEnabled(true);
			Display.setTitle("OOEngine - 0.00");
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Returns a DisplayMode object depending on the saved options of the game.
	 * 
	 * @return the initialized DisplayMode
	 */
	private DisplayMode initResolution() throws LWJGLException{
		engineData.setFullScreen(false); // This will be read from the options file
		boolean fullScreen = engineData.isFullScreen();
		if(!fullScreen){
			engineData.setResolution(new Resolution(800, 600)); // This will be read from the options file
			return new DisplayMode(engineData.getResolution().getWidth(), engineData.getResolution().getHeight());
		}else{
			DisplayMode dpm = Display.getDesktopDisplayMode();
			engineData.setResolution(new Resolution(dpm.getWidth(), dpm.getHeight()));
			Display.setFullscreen(true);
			return dpm;
		}
	}
	
	private void  initOpenGl(){
		int screenWidth = engineData.getResolution().getWidth();
		int screenHeight = engineData.getResolution().getHeight();
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, screenWidth, screenHeight, 0, 100, -100);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
	}
}

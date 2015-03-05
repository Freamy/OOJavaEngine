package org.freamcoding.OOEngine.Game.Screen;

import static org.lwjgl.opengl.GL11.*;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.lwjgl.opengl.Display;

public class Screen {

	public void render(Data engineData){
		glClear(GL_COLOR_BUFFER_BIT);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA);
		Display.update();
		Display.sync(60);
	}
}

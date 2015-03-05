package org.freamcoding.OOEngine.Game.Screen;

import static org.lwjgl.opengl.GL11.*;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.lwjgl.opengl.Display;

public abstract class Screen {

	public void render(Data engineData){
		glClear(GL_COLOR_BUFFER_BIT);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA);
			paint(engineData);
		Display.update();
		Display.sync(60);
	}
	
	protected abstract void paint(Data engineData);
	
	private void drawQuad(){
		float x,y,sx,sy;
		x = y = sx = sy = 0;
		glBegin(GL_QUADS);
			glTexCoord2f(0, 0); glVertex2f(x,y);
			glTexCoord2f(1, 0); glVertex2f(x+sx,y);
			glTexCoord2f(1, 1); glVertex2f(x+sx,y+sy);
			glTexCoord2f(0, 1); glVertex2f(x,y+sy);
		glEnd();
	}
}

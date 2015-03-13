package org.freamcoding.OOEngine.Game.Screen;

import static org.lwjgl.opengl.GL11.*;

import org.freamcoding.OOEngine.Engine.Data.Data;
import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.GameData.GameData;
import org.lwjgl.opengl.Display;

public abstract class Screen {
	
	protected GameData gameData;
	protected Data engineData;

	public void render(Data engineData, GameData gameData){
		glClear(GL_COLOR_BUFFER_BIT);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA);
			paint(engineData, gameData);
		Display.update();
		Display.sync(60);
	}
	
	protected abstract void paint(Data engineData, GameData gameData);
	
	protected void drawEntity(Entity e){
		float[] draw = e.makeDrawCoordinates(gameData.getCamera());
		float drawX = draw[0];
		float drawY = draw[1];
		float size = e.getSize();
		float rotation = e.getRotation();
		
		glPushMatrix();
		glTranslated(drawX,drawY,0);
		glRotated(rotation, 0, 0, 1);
		glTranslated(-drawX,-drawY,0);
		
		gameData.getGraphics().bindTexture(e);
		drawQuad(drawX, drawY, size, size);
		
		glPopMatrix();
	}
	
	protected void drawQuad(float x, float y, float sx, float sy){
		glBegin(GL_QUADS);
			glTexCoord2f(0, 0); glVertex2f(x,y);
			glTexCoord2f(1, 0); glVertex2f(x+sx,y);
			glTexCoord2f(1, 1); glVertex2f(x+sx,y+sy);
			glTexCoord2f(0, 1); glVertex2f(x,y+sy);
		glEnd();
	}
}

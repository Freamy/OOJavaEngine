package org.freamcoding.OOEngine.Game.graphics;

import java.util.ArrayList;

import org.freamcoding.OOEngine.Game.Entity.Entity;
import org.freamcoding.OOEngine.Game.graphics.graphicsStore.Group;

public class Graphics {	
	private ArrayList<Group> graphics;
	
	public Graphics(){
		graphics = new ArrayList<Group>();
		graphics.add(new Group("graphics/actor"));
	}
	
	/** Get - Set pairs **/

	public void bindTexture(Entity entity){
		for(Group group: graphics){
			if(group.isKeyMatch(entity.getTypeKey())) group.bindTexture(entity);
		}
	}
}

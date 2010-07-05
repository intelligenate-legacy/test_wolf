package testwolf;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

import repast.simphony.visualization.visualization2D.style.DefaultStyle2D;

/**
 * Style for wolf and sheep in 2D displays.  Use the circle shape and size
 * specified in DefaultStyle2D.  Here we only change the color of the shape
 * depending on if the agent is a Wolf or a Sheep.
 * 
 * @author Eric Tatara
 *
 */
public class AgentStyle2D extends DefaultStyle2D {

	@Override
	public Paint getPaint(Object o){
		
		if (o instanceof Wolf)
			return Color.DARK_GRAY;
		
		else if (o instanceof Sheep)
			return Color.WHITE;
		
		return null;
	}
	
	// Don't paint the outline of the shape.
	public Stroke getStroke(Object o){
		return null;
	}
}

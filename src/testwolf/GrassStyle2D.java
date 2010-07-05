package testwolf;

import java.awt.Color;
import java.awt.Paint;

import repast.simphony.valueLayer.ValueLayer;
import repast.simphony.visualization.visualization2D.style.ValueLayerStyle;

/**
 * Style for Grass value layer in 2D display.
 * 
 * @author Eric Tatara
 */
public class GrassStyle2D implements ValueLayerStyle {

	protected ValueLayer layer;
	private Color tan = new Color(205, 133, 63);

	public void addValueLayer(ValueLayer layer) {
		this.layer = layer;
	}

	public int getRed(double... coordinates) {
		return 0;	}
	
	public int getGreen(double... coordinates) {
		return 0;	}
	
	public int getBlue(double... coordinates) {
		return 0;
	}

	public float getCellSize() {
		return 15.0f;
	}

	/**
	 * Return the color based on the value at given coordinates.
	 */
	public Paint getPaint(double... coordinates) {
		double v = layer.get(coordinates);
		
		if (v == 1)
			return Color.GREEN;
		else 
			return tan;
	}
}

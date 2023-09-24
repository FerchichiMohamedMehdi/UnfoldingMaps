package settingMaps;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthquakeCityMapTry extends PApplet {
	UnfoldingMap map ;
	public void setup () {
		
		size(950,600);
		map = new UnfoldingMap (this, 200 , 50, 700, 500) ;
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		
	}
	
	public void draw() {
		
		background(10);
		map.draw();		
	}

}

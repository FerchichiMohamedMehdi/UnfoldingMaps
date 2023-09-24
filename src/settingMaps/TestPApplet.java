package settingMaps;

//Java utilities libraries
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

//Processing library
import processing.core.PApplet;
import processing.core.PImage;
//Unfolding libraries
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

//Parsing library
import parsing.ParseFeed;

/** EarthquakeCityMap
 * An application with an interactive map displaying earthquake data.
 * Author: UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 * Date: July 17, 2015
 * */

public class TestPApplet extends PApplet {
	
	private String URL="palmTrees.jpg";
	private PImage backgroundImg;
	
	public void setup() {
		size(200,200);
		backgroundImg=loadImage(URL, "jpg");
		
		//backgroundImg=loadImage(URL, "png");
	}
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg,0,0);
		fill(255,209,0);
		ellipse(width/4, height/5, width/5, height/5);
	}

	

}

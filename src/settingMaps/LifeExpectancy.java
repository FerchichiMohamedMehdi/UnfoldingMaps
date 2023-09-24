package settingMaps;

import java.util.HashMap;
import java.util.Map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LifeExpectancy extends PApplet {
	
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	private UnfoldingMap map;
	
	private Map<String, Float> lifeExpByCountry;
	
	public void setup() {
		size(800,600);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new MBTilesMapProvider(mbTilesString));
		MapUtils.createDefaultEventDispatcher(this, map);
	}
		
	private Map<String, Float> loadLifeExpectancyFromCSV(String fileName){
		fileName="LifeExpectancyWorldBank";
		
		Map<String, Float> lifeExpMap = new HashMap<String, Float>();
		
		String[] rows = loadStrings(fileName);
		
		for (String row: rows) {
			String [] columns = row.split(",");
			
			
			
			
		}
		
		lifeExpByCountry = loadLifeExpectancyFromCSV ("data/"+fileName+".csv");
		
		return lifeExpMap;
		
		
	}
	
	public void draw() {
		
		map.draw();
	}
}

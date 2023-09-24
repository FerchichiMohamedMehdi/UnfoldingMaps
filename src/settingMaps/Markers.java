package settingMaps;

import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class Markers extends PApplet{
	
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	private UnfoldingMap map;
	
	public void setup() {
		size(800,600);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new MBTilesMapProvider(mbTilesString));
		MapUtils.createDefaultEventDispatcher(this, map);	
		
		Location valloc = new Location(-38.14f,-73.03f);
		Feature valEq = new PointFeature(valloc);
		valEq.addProperty("title","Valdivia,Chile");
		valEq.addProperty("magniture","9.5");
		valEq.addProperty("date","MAy 22, 1960");
		valEq.addProperty("year","1960");
		
		Location alaskaloc = new Location(66.160507f,-153.369141f);
		Feature alaskaEq = new PointFeature(alaskaloc);
		alaskaEq.addProperty("title","alaska");
		alaskaEq.addProperty("magniture","9.1");
		alaskaEq.addProperty("date","janvier 22, 1985");
		alaskaEq.addProperty("year","1985");
		
		
		
		Location sumatraloc = new Location(3.597031f,98.678513f);		
		Feature sumatraEq = new PointFeature(sumatraloc);
		sumatraEq.addProperty("title","sumatra");
		sumatraEq.addProperty("magniture","7");
		sumatraEq.addProperty("date","octobre 22, 2002");
		sumatraEq.addProperty("year","2002");
		
		Location Japanloc = new Location(35.652832f,139.839478f);	
		Feature japanEq = new PointFeature(Japanloc);
		japanEq.addProperty("title","JApan");
		japanEq.addProperty("magniture","5");
		japanEq.addProperty("date","december 1, 1980");
		japanEq.addProperty("year","1980");
		
		Location kamchatkaloc = new Location(56.210949f,159.346725f);	
		Feature kamchatkaEq = new PointFeature(kamchatkaloc);
		kamchatkaEq.addProperty("title","kamchatka");
		kamchatkaEq.addProperty("magniture","4");
		kamchatkaEq.addProperty("date","jui 10, 1955");
		kamchatkaEq.addProperty("year","1955");
		
		List<PointFeature> bigEqs = new ArrayList<PointFeature>();
		
		bigEqs.add((PointFeature) valEq);
		bigEqs.add((PointFeature) alaskaEq);
		bigEqs.add((PointFeature) sumatraEq);
		bigEqs.add((PointFeature) japanEq);
		bigEqs.add((PointFeature) kamchatkaEq);
		
		
		List<Marker> markers = new ArrayList<Marker>();
		

		
		for (PointFeature eq: bigEqs) {
			//System.out.println(eq.getProperties());
			markers.add(new SimplePointMarker(eq.getLocation(), eq.getProperties()));
			
		}
		Marker valMk = new SimplePointMarker(valloc, valEq.getProperties());
		for (Marker mk: markers) {
			int yearValue = Integer.valueOf((String) mk.getProperty("year"));
			if ( yearValue > 2000 ) {
				mk.setColor(color(255,0,0));
			}
			else {
				mk.setColor(color(0,0,0));
			}
		}
		map.addMarkers(markers);	
		
	}
	
	public void draw() {
		map.draw();
	}
	

}

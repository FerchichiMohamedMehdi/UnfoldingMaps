package settingMaps;

import java.sql.Date;

import processing.core.PApplet;
import processing.core.PImage;

public class TestRefresh extends PApplet{
	//private Date date;
	private String url ="palmTrees.jpg";
	private PImage backgroundImage;
	
	public void setup () {
		size(200,200);
		backgroundImage = loadImage(url,"jpg");
		
	}
	
	public void draw () {
		
		backgroundImage.resize(0, height);
		image(backgroundImage,0,0);
		fill(255,255,0,second());
		ellipse(width/4, height/5, width/5, height/5);
		
	}
	

}

package application;

import processing.core.PApplet;

public class FadeInTextfield {
	PApplet p;
	private int x = 50;
	private int y = 50;
	private int fadeInTime = 150; //number of frames before the text fully appears
	private int frameCounter = 0;
	private int startColor;
	private int endColor;
	private float redGradient;
	private float greenGradient;
	private float blueGradient;
	
	FadeInTextfield(int positionX, int positionY, PApplet parent){
		p = parent;
		x = positionX;
		y = positionY;
		startColor = p.color(255,255,255);
		endColor = p.color(0,0,0);
		redGradient = ((p.red(endColor)-p.red(startColor))/fadeInTime);
		greenGradient = ((p.green(endColor)-p.green(startColor))/fadeInTime);
		blueGradient = ((p.blue(endColor)-p.green(startColor))/fadeInTime);
		
	}
	
	FadeInTextfield(PApplet parent){
		p = parent;
		startColor = p.color(255,255,255);
		endColor = p.color(0,0,0);
		redGradient = ((p.red(endColor)-p.red(startColor))/fadeInTime);
		greenGradient = ((p.green(endColor)-p.green(startColor))/fadeInTime);
		blueGradient = ((p.blue(endColor)-p.green(startColor))/fadeInTime);
	}
	
	public void setPostion(int positionX, int positionY){
		x = positionX;
		y = positionY;
	}
	
	public int getPositionX(){
		return x;
	}
	
	public int getPositionY(){
		return y;
	}
	
	public void display(String s){
		p.textSize(48);
		p.textAlign(p.CENTER);
		if(frameCounter<fadeInTime){
			p.fill(p.red(startColor)+redGradient*frameCounter, p.green(startColor)+greenGradient*frameCounter, p.blue(startColor)+blueGradient*frameCounter);
			frameCounter++;
		} else{
			p.fill(endColor);
		}
		p.text(s, x, y);
		
	}
	public void setStartColor(int color){
		startColor = color;
		updateGradient();
	}
	public void setEndColor(int color){
		endColor = color;
		updateGradient();
	}
	
	private void updateGradient(){
		redGradient = ((p.red(endColor)-p.red(startColor))/fadeInTime);
		greenGradient = ((p.green(endColor)-p.green(startColor))/fadeInTime);
		blueGradient = ((p.blue(endColor)-p.green(startColor))/fadeInTime);	
	}
	
}

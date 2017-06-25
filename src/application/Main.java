package application;

//GUIDE:
//step 1: import core and add to build path
//step 2: extends PApplet
//step 3
//step 4: add new class with a parameter parent (p) in the constructor

/*
 * Abilities:
 * 		Learn from natural language
 * 		Ask question if something is not in dictionary
 * 		Have an external library
 * 
 * GUI:
 * 		Say using fading in texts (FadeInTextfield)
 * 
 * L1Translator:
 * 		String simplify(String s)
 * 		void translateToJava(String s)
 * 		void learn(String s)
 * 		
 * Functions to use: a drawing pond app:
 * 		addRectangle();
 * 		addSquare();
 * 		addTriangle();
 * 		addCircle();
 * 		...
 * 
 * Memory:
 * 		add rectangle: add a rectangle, add rectangle
 * 
 */
import processing.core.*;

public class Main extends PApplet {

	// Variables

	FadeInTextfield field1;
	L1Translator l1;

	int bColor = color(255, 255, 255);
	int textColor = color(255, 0, 0);

	// GUIDE step 3
	public static void main(String[] args) {
		PApplet.main("application.Main");

	}//

	public void settings() {
		size(700, 700);

	}

	public void setup() {
		field1 = new FadeInTextfield(width / 2, height / 2, this);
		field1.setStartColor(bColor);
		field1.setEndColor(textColor);
		System.out.println("printed");
		l1 = new L1Translator();

		l1.getMemory().write("Written");
		l1.getMemory().write("More writen");
		System.out.println(l1.getMemory().readAll());
	}

	public void draw() {
		background(bColor);
		field1.display("Yayyy!!!");
	}

}

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size(400,400);
}
public void draw(){
	if (mousePressed == true) {
    if (mouseY > 200 && mouseX > 200){
    fill(255,255,0);
    rect(mouseX,mouseY, 50, 50);
    }
	if(mouseY < 200 && mouseX < 200){
    fill(255,0,0);
    ellipse(mouseX, mouseY, 50, 50);
	}
	if (mouseY < 200 && mouseX > 200) {
	fill(0,255,0);
	ellipse(mouseX, mouseY, 50, 50);
	}
	if(mouseY > 200 && mouseX < 200){
	fill(0,0,255);	
	rect(mouseX, mouseY, 50, 50);
    }
}

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

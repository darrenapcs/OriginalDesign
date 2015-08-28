void setup()
{
  size(400,400);
}
void draw(){
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

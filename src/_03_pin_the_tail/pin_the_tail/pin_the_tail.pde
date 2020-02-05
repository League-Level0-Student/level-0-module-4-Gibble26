  PImage face;
void setup(){
  size(500,500); 

  face = loadImage("killitwithfire.png");
  face.resize(100,100);
}
void draw(){

  image(face,mouseX-50,mouseY-50);
}

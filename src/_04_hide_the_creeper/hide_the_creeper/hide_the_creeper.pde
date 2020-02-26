PImage creeper;     //at the top of your program\
PImage minecraft  ;
void setup() {
  size(1000,1000);
  minecraft=loadImage("hide.jpg");
minecraft.resize(1000,1000);
creeper=loadImage("CREEPER.png");     
creeper.resize(80, 80);     //in setup method
}

void draw() {
 
  background(minecraft);
  fill(#03FF11);
  if(mouseX > 531 && mouseX < 676 && mouseY > 518 && mouseY < 684  ){
    fill(#FF0329);
      if(mousePressed){
  image(creeper, 571, 571);     //in draw method
}
  }
    ellipse(mouseX,mouseY,10,10);


}

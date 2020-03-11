
PImage creeper;     //at the top of your program
 PImage minecraft;
int creeperX = 573;
int creeperY = 605;
void setup(){
  size(1000, 1000);

  //in setup method
  creeper=loadImage("CREEPER.png"); 
  creeper.resize(100,120);//in setup method
  minecraft=loadImage("hide.jpg");
  minecraft.resize(1000,1000);

         //in setup method
      //in setup method
}
void draw(){
  noStroke();
      //in draw method\
background(minecraft);
rect(573,605,40,40);
  fill(#FF0000);
  ellipse(mouseX,mouseY,10,10);
  
  }

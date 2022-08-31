
void setup() {
 
  // set the size of your sketch
  size(500,500);
}
int colour = 0;
void draw() {
  int wide = 250;
  int legth = 250;
  int x = 250;
  int y = 250;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i < 6; i++){
  ellipse(wide,legth,x,y);
  x = x - 45;
  y = y - 45;
      if (i % 2 == 0) {
       fill(#FF0000); 
    }
    else {
        fill(#000000);
    }
  }
  //Use an if statement and remainder to alternate the color of your rings.
  

  }

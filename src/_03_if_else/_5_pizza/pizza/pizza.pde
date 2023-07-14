
void setup() {
    size(500, 500);
}
void draw() {
    fill(#DEA03C);
  ellipse(250, 250, 400, 400);
  fill(#CE2828);
  ellipse(250, 250, 365, 365);
  fill(#FAF7F2);
  ellipse(250, 250, 350, 350);
  if (mousePressed){
    PImage Olive = loadImage("olive.png");
    image (Olive, 200, 200);
}
}

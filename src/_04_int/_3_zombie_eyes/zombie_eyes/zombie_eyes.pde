
void setup() {
size(500, 500);
  PImage face = loadImage("IMG_4657.jpg");
  face.resize(500,500);
  image(face, 0, 0);

}
void draw() {
  fill(#F70A0A);
  ellipse(268, 308, 20, 20);
  ellipse(100, 200, 20, 20);
}

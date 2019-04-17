PImage pictureOfRecord;
int speed = 0;
void setup(){
size(600, 600);
pictureOfRecord= loadImage("record.jpg");
pictureOfRecord.resize(height, width);
}
void draw(){
  rotateImage(pictureOfRecord, speed);
image(pictureOfRecord,0, 0);
if(mousePressed == true){
speed+=5;
}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
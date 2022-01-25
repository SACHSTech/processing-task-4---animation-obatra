import processing.core.PApplet;

public class Sketch extends PApplet {
	  
    
    // sun
    float sunSize = 150;
    float sunSpeed = 3;
    
    // moon
    float moonSize = 135;
    float moonSpeed = 3;
    
    // size 
    public float width = 1000;
    public float height = 800;

    // width and height scales
    public float widthScale = width/350;
    public float heightScale = height/350;  

    // morning and night booleans
    public boolean morning = false;
    public boolean night = true;   

    // ellipse size
    public float circleX = 0;
    public float circleY = 600;

  public void settings() {
    // size
      size((int)width, (int)height);
    }

  
  public void draw() {
	
    if (morning) {
      background(135,206,235);
    }
    else if(night) {
      background(0,20,64);
    }

    if(morning) {
      fill(255,255,0);
    }
    else if(night){
      fill(255);
    }

    if (morning) {
      ellipse(circleX, circleY, sunSize, sunSize);
        
      }
      else if(night){
      ellipse(circleX, circleY, moonSize, moonSize);
     // setClip(ellipse);
       
     }

   
    
    circleX += sunSpeed;
    circleY = (float) ((0.005/widthScale) * (Math.pow(circleX-width/2,2)) + (75 * heightScale));

    if(circleX > width + 75) {
      circleX = 0;
      circleY = 350 * heightScale;
      if (morning) {
        morning = false;
        night = true;
      }
       
    else if(night) {
      night = false;
      morning = true;
      
   }  
  }
}
}
  

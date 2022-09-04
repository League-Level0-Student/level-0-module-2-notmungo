/*** When you are done, this program will draw an ellipse 
     that jumps to new location each time you click on it.
***/
 
 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
       int x = 90 ;
       int y  = 80;
       int sizeEllipseWidth = 90 ;
       int sizeEllipseHeight = 90 ;
    void setup() {
      // 2. Set the size of your sketch
            size(800,600);
    }
    
    void draw() {
    
      // 3. Set the background color of your sketch
      
      background(#ff0000);
      // 4. Draw an ellipse using the variables created at the top of the sketch for the location and size of your ellipse. 
      //    Make sure it fits in the window. Change the variables if it does not.
            ellipse(x, y, sizeEllipseWidth, sizeEllipseHeight);
    
    }
    
    /******** This method gets called automatically when you press the mouse ************/
    void mousePressed() {
      //5. Create an integer variable called distance
      int distance = getDistanceFromMouse(x, y); 
      //6. The getDistanceFromMouse() method below returns a number.
      
      
      //   Set the value of your distance variable to the value returned by the getDistance method
      //   You will need to pass the x and y location of your ellipse to this method.
           
          
      //7.  Use an if statement to check if your distance variable is < the radius of the ellipse
            if (distance < sizeEllipseWidth/2) {
                x = (int) random(width);
                y = (int) random(width);
            }
      //    If it is, make a new x AND y for the ellipse, for a new random location on the window
      //    Hint: Use code like this      x = (int) random(width);
            
      
    }
    
    /********  This method gives you the number of pixels between the mouse and the x,y point ***********/
    int getDistanceFromMouse(int x, int y) {
      return (int)Math.sqrt(Math.pow((mouseX-x),2) + Math.pow((mouseY-y),2));
    }

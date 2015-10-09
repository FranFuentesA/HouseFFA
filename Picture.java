/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle floor;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        floor = new Circle();
        floor.changeSize(1000);
        floor.changeColor("green");
        floor.moveHorizontal(-460);
        floor.moveVertical(140);
        floor.makeVisible();

                      
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-100);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        
       
    }
    /**
     * Constructor for objects of class Picture
     */
    public void moveSun()
    {
      
         
          sun.slowMoveVertical(160);
       sun.changeColor("black");
          floor.changeColor("black");
          roof.changeColor("black");
          wall.changeColor("black");
           window.changeColor("white");
          
          
        // nothing to do... instance variables are automatically set to null
    }
/**
     * Constructor for objects of class Picture
     */
    public void moveperson()
    {
                     
       person1 = new Person();
       person1.makeVisible();
       person1.moveVertical(17);
       person1.moveHorizontal(-170); 
       person1.slowMoveHorizontal(50);
        // nothing to do... instance variables are automatically set to null
    }
    /**
     * Constructor for objects of class Picture
     */
    public void personas()
    {
         
                       
       person2 = new Person();
       person2.makeVisible();
       person2.moveVertical(17);
       person2.moveHorizontal(170); 
       
       person3 = new Person();
       person3.makeVisible();
       person3.moveVertical(17);
       person3.moveHorizontal(190);
       
       person4 = new Person();
       person4.makeVisible();
       person4.moveVertical(17);
       person4.moveHorizontal(200);
        // nothing to do... instance variables are automatically set to null
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }
/**
     * Constructor for objects of class Picture
     */
    public void moverpersonas()
    {
      
        person2.slowMoveHorizontal(-50);
        person3.slowMoveHorizontal(-50); 
        person4.slowMoveHorizontal(-50); 
        // nothing to do... instance variables are automatically set to null
    }
    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}

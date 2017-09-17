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
    private Triangle roof2;
    private Circle sun;
    private Person guy;
    private Person chew;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("black");
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
        roof.changeColor("white");
        roof.changeSize(45, 180);
        roof.moveHorizontal(-11);
        roof.moveVertical(-95);
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("white");
        roof2.changeSize(-45, 180);
        roof2.moveHorizontal(-9);
        roof2.moveVertical(25);
        roof2.makeVisible();
        
        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(-60);
        sun.moveVertical(-60);
        sun.changeSize(150);
        sun.makeVisible();
        
        guy = new Person();
        guy.changeColor("white");
        guy.moveHorizontal(80);
        guy.moveVertical(28);
        
        chew = new Person();
        chew.changeColor("yellow");
        chew.moveHorizontal(40);
        chew.moveVertical(28);
        
        
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

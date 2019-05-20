
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    
    private Square wall1;
    private Square wall2;
    private Square wall3;
    
    private Square door1;
    private Square door2;
    
    private Square ltower1;
    private Square ltower2;
    private Square ltower3;
    private Square ltower4;
    private Square ltower5;
    
    private Square rtower1;
    private Square rtower2;
    private Square rtower3;
    private Square rtower4;
    private Square rtower5;
    
    
    private Square lpillar1;
    private Square lpillar2;
    private Square lpillar3;
    
    private Square rpillar1;
    private Square rpillar2;
    private Square rpillar3;
    
    private Triangle lflame1;
    private Triangle lflame2;
    
    private Triangle rflame1;
    private Triangle rflame2;
    
    private Square lcren1;
    private Square lcren2;
    private Square lcren3;
    private Square lcren4;
    private Square lcren5;
    private Square lcren6;
    
    private Square rcren1;
    private Square rcren2;
    private Square rcren3;
    private Square rcren4;
    private Square rcren5;
    private Square rcren6;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
        this.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeSize(1000);
        grass.changeColor("green");
        grass.moveVertical(140);
        grass.moveHorizontal(-100);
        grass.makeVisible();
        
        this.drawWall();
        
        this.drawDoor();

        this.drawLeftTower();
        
        this.drawRightTower();
        
        this.drawLeftPillar();
        
        this.drawRightPillar();
        
        this.drawLeftFlame();
        
        this.drawRightFlame();
        
        this.drawLeftCrenellations();
        
        this.drawRightCrenellations();
        
        
    }

    public void drawWall()
    {
        wall1 = new Square();
        wall2 = new Square();
        wall3 = new Square();
        
        wall1.changeColor("blue");
        wall2.changeColor("blue");
        wall3.changeColor("blue");
        
        wall1.changeSize(60);
        wall2.changeSize(60);
        wall3.changeSize(60);
        
        wall1.moveVertical(100);
        wall2.moveVertical(100);
        wall3.moveVertical(100);
        
        wall1.moveHorizontal(10);
        wall2.moveHorizontal(60);
        wall3.moveHorizontal(110);
        
        wall1.makeVisible();
        wall2.makeVisible();
        wall3.makeVisible();
        
        return;
    }
    
    public void drawDoor()
    {
        door1 = new Square();
        door2 = new Square();
        
        door1.changeSize(20);
        door2.changeSize(20);
        
        door1.moveVertical(138);
        door2.moveVertical(120);
        
        door1.moveHorizontal(80);
        door2.moveHorizontal(80);
        
        door1.changeColor("white");
        door2.changeColor("white");
        
        door1.makeVisible();
        door2.makeVisible();
        
        return;
    }
    
    
    public void drawLeftTower()
    {
        ltower1 = new Square();
        ltower2 = new Square();
        ltower3 = new Square();
        ltower4 = new Square();
        ltower5 = new Square();
        
        ltower1.changeColor("blue");
        ltower2.changeColor("blue");
        ltower3.changeColor("blue");
        ltower4.changeColor("blue");
        ltower5.changeColor("blue");
        
        ltower1.changeSize(40);
        ltower2.changeSize(40);
        ltower3.changeSize(40);
        ltower4.changeSize(30);
        ltower5.changeSize(30);
        
        ltower1.moveVertical(120);
        ltower2.moveVertical(80);
        ltower3.moveVertical(60);
        ltower4.moveVertical(60);
        ltower5.moveVertical(60);
        
        ltower1.moveHorizontal(-10);
        ltower2.moveHorizontal(-10);
        ltower3.moveHorizontal(-10);
        ltower4.moveHorizontal(-15);
        ltower5.moveHorizontal(5);
        
        ltower1.makeVisible();
        ltower2.makeVisible();
        ltower3.makeVisible();
        ltower4.makeVisible();
        ltower5.makeVisible();
        
        return;
    }
    
    public void drawRightTower()
    {
        rtower1 = new Square();
        rtower2 = new Square();
        rtower3 = new Square();
        rtower4 = new Square();
        rtower5 = new Square();
        
        rtower1.changeColor("blue");
        rtower2.changeColor("blue");
        rtower3.changeColor("blue");
        rtower4.changeColor("blue");
        rtower5.changeColor("blue");
        
        rtower1.changeSize(40);
        rtower2.changeSize(40);
        rtower3.changeSize(40);
        rtower4.changeSize(30);
        rtower5.changeSize(30);
        
        rtower1.moveVertical(120);
        rtower2.moveVertical(80);
        rtower3.moveVertical(60);
        rtower4.moveVertical(60);
        rtower5.moveVertical(60);
        
        rtower1.moveHorizontal(150);
        rtower2.moveHorizontal(150);
        rtower3.moveHorizontal(150);
        rtower4.moveHorizontal(145);
        rtower5.moveHorizontal(165);
        
        rtower1.makeVisible();
        rtower2.makeVisible();
        rtower3.makeVisible();
        rtower4.makeVisible();
        rtower5.makeVisible();
        
        return;
    }
    
    public void drawLeftPillar()
    {
        lpillar1 = new Square();
        lpillar2 = new Square();
        lpillar3 = new Square();
        
        lpillar1.changeColor("black");
        lpillar2.changeColor("black");
        lpillar3.changeColor("black");
        
        lpillar1.changeSize(10);
        lpillar2.changeSize(10);
        lpillar3.changeSize(10);
        
        lpillar1.moveVertical(150);
        lpillar2.moveVertical(140);
        lpillar3.moveVertical(130);
        
        lpillar1.moveHorizontal(55);
        lpillar2.moveHorizontal(55);
        lpillar3.moveHorizontal(55);
        
        lpillar1.makeVisible();
        lpillar2.makeVisible();
        lpillar3.makeVisible();
        
        return;
    }
    
    public void drawRightPillar()
    {
        rpillar1 = new Square();
        rpillar2 = new Square();
        rpillar3 = new Square();
        
        rpillar1.changeColor("black");
        rpillar2.changeColor("black");
        rpillar3.changeColor("black");
        
        rpillar1.changeSize(10);
        rpillar2.changeSize(10);
        rpillar3.changeSize(10);
        
        rpillar1.moveVertical(150);
        rpillar2.moveVertical(140);
        rpillar3.moveVertical(130);
        
        rpillar1.moveHorizontal(115);
        rpillar2.moveHorizontal(115);
        rpillar3.moveHorizontal(115);
        
        rpillar1.makeVisible();
        rpillar2.makeVisible();
        rpillar3.makeVisible();
        
        return;
    }
    
    public void drawLeftFlame()
    {
        lflame1 = new Triangle();
        lflame2 = new Triangle();
        
        lflame1.changeSize(20,10);
        lflame2.changeSize(10,5);
        
        lflame1.changeColor("red");
        lflame2.changeColor("yellow");
        
        lflame1.moveVertical(145);
        lflame2.moveVertical(155);
        
        lflame1.moveHorizontal(70);
        lflame2.moveHorizontal(70);
        
        lflame1.makeVisible();
        lflame2.makeVisible();
        
        return;
    }
    
    public void drawRightFlame()
    {
        rflame1 = new Triangle();
        rflame2 = new Triangle();
        
        rflame1.changeSize(20,10);
        rflame2.changeSize(10,5);
        
        rflame1.changeColor("red");
        rflame2.changeColor("yellow");
        
        rflame1.moveVertical(145);
        rflame2.moveVertical(155);
        
        rflame1.moveHorizontal(130);
        rflame2.moveHorizontal(130);
        
        rflame1.makeVisible();
        rflame2.makeVisible();
        
        return;
    }
    
    public void drawLeftCrenellations()
    {
        lcren1 = new Square();
        lcren2 = new Square();
        lcren3 = new Square();
        lcren4 = new Square();
        lcren5 = new Square();
        lcren6 = new Square();
        
        lcren1.changeSize(5);
        lcren2.changeSize(5);
        lcren3.changeSize(5);
        lcren4.changeSize(5);
        lcren5.changeSize(5);
        lcren6.changeSize(5);
        
        lcren1.changeColor("blue");
        lcren2.changeColor("blue");
        lcren3.changeColor("blue");
        lcren4.changeColor("blue");
        lcren5.changeColor("blue");
        lcren6.changeColor("blue");
        
        lcren1.moveVertical(55);
        lcren2.moveVertical(55);
        lcren3.moveVertical(55);
        lcren4.moveVertical(55);
        lcren5.moveVertical(55);
        lcren6.moveVertical(55);
        
        lcren1.moveHorizontal(-15);
        lcren2.moveHorizontal(-6);
        lcren3.moveHorizontal(3);
        lcren4.moveHorizontal(12);
        lcren5.moveHorizontal(21);
        lcren6.moveHorizontal(30);
        
        lcren1.makeVisible();
        lcren2.makeVisible();
        lcren3.makeVisible();
        lcren4.makeVisible();
        lcren5.makeVisible();
        lcren6.makeVisible();
        
        return;
    }
    
    public void drawRightCrenellations()
    {
        rcren1 = new Square();
        rcren2 = new Square();
        rcren3 = new Square();
        rcren4 = new Square();
        rcren5 = new Square();
        rcren6 = new Square();
        
        rcren1.changeSize(5);
        rcren2.changeSize(5);
        rcren3.changeSize(5);
        rcren4.changeSize(5);
        rcren5.changeSize(5);
        rcren6.changeSize(5);
        
        rcren1.changeColor("blue");
        rcren2.changeColor("blue");
        rcren3.changeColor("blue");
        rcren4.changeColor("blue");
        rcren5.changeColor("blue");
        rcren6.changeColor("blue");
        
        rcren1.moveVertical(55);
        rcren2.moveVertical(55);
        rcren3.moveVertical(55);
        rcren4.moveVertical(55);
        rcren5.moveVertical(55);
        rcren6.moveVertical(55);
        
        rcren1.moveHorizontal(145);
        rcren2.moveHorizontal(154);
        rcren3.moveHorizontal(163);
        rcren4.moveHorizontal(172);
        rcren5.moveHorizontal(181);
        rcren6.moveHorizontal(190);
        
        rcren1.makeVisible();
        rcren2.makeVisible();
        rcren3.makeVisible();
        rcren4.makeVisible();
        rcren5.makeVisible();
        rcren6.makeVisible();
        
        return;
    }
}

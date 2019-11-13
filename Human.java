package human_figure;
import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;


// the name of the class Human should be in a file Human.java

public class Human extends Applet implements Runnable
{
	Thread t,t1;
	Label l1,l2;
	TextField t3;
	int day, month, year;
	public void init()
	  {
	   t3=new TextField(10);
	   l2=new Label("Today's Date");	   
	   add(l2);
	   add(t3); 
	  }
	  public void start()
	  {
	   t = new Thread(this);
	   t.start();
	  }
	  public void run()
	  {
	   t1 = Thread.currentThread();
	   while(t1 == t){
	   repaint();
	   try
	   {
	    t1.sleep(1000); 
	   }
	   catch(InterruptedException e)
	   {
	   }
	   }
	 }
    public void paint (Graphics page)
    {
    	setSize(500, 600);
    	final int BASEX = 120;
    	final int BASEY = 60;
    	//page.setColor(Color.LIGHT_GRAY);
    	Color skin = new Color (255,220,180);
    	page.setColor(skin);
    	setBackground(Color.white);
    	page.fillOval(BASEX, BASEY, 80, 80); // head
    	page.fillOval(BASEX-5, BASEY+20, 90, 40); // ears
    	page.setColor(Color.black);
    	page.drawOval(BASEX+20, BASEY+30, 15, 7); // eyes
    	page.drawOval(BASEX+45, BASEY+30, 15, 7);
    	page.fillOval(BASEX+25, BASEY+31, 5, 5); // pupils
    	page.fillOval(BASEX+50, BASEY+31, 5, 5);
    	page.drawArc(BASEX+20, BASEY+25, 15, 7, 0, 180); // eyebrows
    	page.drawArc(BASEX+45, BASEY+25, 15, 7, 0, 180);
    	page.drawArc(BASEX+35, BASEY+40, 15, 10, 180, 180); // nose
    	page.drawArc(BASEX+20, BASEY+50, 40, 15, 180, 180); // mouth
    	page.drawLine(BASEX+27, BASEY+77, BASEX+27, BASEY+100); // Throat_left
    	page.drawLine(BASEX+53, BASEY+77, BASEX+53, BASEY+100); // Throat_right
    	page.setColor(skin);
    	page.fillRect(BASEX+27, BASEY+77, 27, 26);
    	page.setColor(Color.BLACK);
    	page.drawLine(BASEX+27, BASEY+100, BASEX+40, BASEY+120); // collar_left
    	page.drawLine(BASEX+53, BASEY+100, BASEX+40, BASEY+120); // collar_right
    	page.drawLine(BASEX-13, BASEY+120, BASEX+27, BASEY+100); // neck_left
    	page.drawLine(BASEX+53, BASEY+100, BASEX+93, BASEY+120); // neck_right
    	page.drawLine(BASEX-27, BASEY+200, BASEX-13, BASEY+120); // hand_left_left
    	page.drawLine(BASEX+5, BASEY+150, BASEX-7, BASEY+200); // hand_left_right
    	page.drawLine(BASEX+93, BASEY+120, BASEX+117, BASEY+200); // hand_right_right
    	page.drawLine(BASEX+81, BASEY+150, BASEX+100, BASEY+200); // hand_right_left
    	page.drawLine(BASEX-27, BASEY+200, BASEX-15, BASEY+250); // hand_left_right_inner
    	page.drawLine(BASEX-7, BASEY+200, BASEX, BASEY+250); // hand_left_right_outer
    	page.drawLine(BASEX+117, BASEY+200, BASEX+100, BASEY+250); // hand_right_right_outer
    	page.drawLine(BASEX+100, BASEY+200, BASEX+85, BASEY+250); // hand_right_left_inner
    	page.drawLine(BASEX-15, BASEY+250, BASEX, BASEY+250);
    	page.drawLine(BASEX+83, BASEY+250, BASEX+100, BASEY+250);
    	
    	
    	page.setColor(skin);
    	page.fillRect(BASEX-12, BASEY+251, 12, 12);			// left_culf
    	page.fillRect(BASEX+88, BASEY+251, 12, 12);			// right_culf
    	page.fillOval(BASEX-11, BASEY+261, 3, 9);			// pinky_finger_right
    	page.fillOval(BASEX-8, BASEY+261, 4, 9);			// ring_finger_right
    	page.fillOval(BASEX-5, BASEY+262, 5, 10);			// middle_finger_right
    	page.fillOval(BASEX-2, BASEY+262, 4,9);				// index_finger_right
    	page.fillOval(BASEX-1, BASEY+260, 5, 7);			// thumb_right
    	page.fillOval(BASEX+86, BASEY+261, 5, 7);			// thumb_left
    	page.fillOval(BASEX+89, BASEY+262, 4, 9);			// index_finger_left
    	page.fillOval(BASEX+91, BASEY+262, 5, 10);			// middle_finger_left
    	page.fillOval(BASEX+93, BASEY+262, 4, 8);			// ring_finger_left
    	page.fillOval(BASEX+95, BASEY+262, 4, 7);			// pinky_finger_left
    	
    	page.setColor(Color.LIGHT_GRAY);
    	page.fillRect(BASEX+5, BASEY+115, 80, 165);		// body 
    	page.setColor(Color.BLACK);
    	int x1[]={BASEX+35,BASEX+5,BASEX+5};		
    	int y1[]={BASEY+115,BASEY+115,BASEY+135};
    	int x2[]={BASEX+55,BASEX+85,BASEX+85};
    	int y2[]={BASEY+115,BASEY+115,BASEY+135};
    	page.setColor(Color.WHITE);
    	page.fillPolygon(x1,y1,3);					// left_triangle
    	page.fillPolygon(x2,y2,3);					// right_triangle
    	page.setColor(Color.BLACK);
    	page.drawRect(BASEX+45, BASEY+140, 25, 30);		// pocket
    	page.fillRect(BASEX+15, BASEY+280, 20, 165);	// left_leg		
    	page.fillRect(BASEX+55, BASEY+280, 20, 165);	// right_leg
    	page.setColor(Color.gray);
    	page.fillRect(BASEX+20,BASEY+445, 10, 10);		// left_leg_ankle
    	page.fillRect(BASEX+60,BASEY+445, 10, 10); 		// right_leg_ankle
    	page.setColor(Color.BLACK);
    	
    	page.fillRoundRect(BASEX+60, BASEY+453, 20, 15, 3, 8);	// right_shoe_full
    	page.fillRoundRect(BASEX+78, BASEY+458, 7, 10, 3, 4);	//right_shoe_tip
    	page.fillRoundRect(BASEX+20, BASEY+453, 20, 15, 3, 8);	// left_shoe_full
    	page.fillRoundRect(BASEX+38, BASEY+458, 7, 10, 3, 4);	// left_shoe_tip
    	
    	
        
    	page.setColor(Color.BLACK);
    	page.drawString("My rendition of a person!",
    	BASEX+245, BASEY-50);							// Text
    	page.drawString("Courtesy : Abhijit Chakraborty.", BASEX+200, BASEY+505);
    	page.drawLine(BASEX+15, BASEY+2, BASEX+65, BASEY+2); // brim of hat
    	page.fillRect(BASEX+18, BASEY-23, 43, 25); // top of hat
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        String msg1="" + day + "/" + (month +1) + "/" + year;	//date
        t3.setText(msg1); 
    	 
    }// end paint
    
}// end
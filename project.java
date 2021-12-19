import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.*;
/*<applet code="project.class" height="500" width="500">
</applet>*/
public class project extends Applet implements ActionListener,MouseListener,MouseMotionListener 
{
	Button b1=new Button("Line");
	Button b2=new Button("Rectangle");
	Button b3=new Button("RoundRect");
	Button b4=new Button("Oval");
	boolean f1=false,f2=false,f3=false,f4=false;
	int x1,y1,x2,y2;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		}
		public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			f1=true;
			f2=false;
			f3=false;
			f4=false;

		}
		if(a.getSource()==b2)
		{
			f1=false;
			f2=true;
			f3=false;
			f4=false;
		}
		if(a.getSource()==b3)
		{
			f1=false;
			f2=false;
			f3=true;
			f4=false;
		}
		if(a.getSource()==b4)
		{
			f1=false;
			f2=false;
			f3=false;
			f4=true;
		}			
	}
	public void mouseMoved(MouseEvent a)
	{
			}
	public void mouseDragged(MouseEvent a)
	{
			}
	public void mouseClicked(MouseEvent a)
	{
					}
	public void mousePressed(MouseEvent a)
	{
			x1=a.getX();
			y1=a.getY();
	}
	public void mouseEntered(MouseEvent a)
	{
		}
	public void mouseExited(MouseEvent a)
	{
		}
	public void mouseReleased(MouseEvent a)
	{
			x2=a.getX();
			y2=a.getY();
			repaint();
	}
	public void paint(Graphics g)
	{
		setForeground(Color.RED);
		if(f1==true)
		{
		g.drawLine(x1,y1,x2,y2);
		g.drawString("("+x1+","+y1+")",x1,y1);
		g.drawString("("+x2+","+y2+")",x2,y2);
	}
	if(f2==true)
		{
			if(x1<x2||y1<y2)
		{
		int h=Math.abs(x2-x1);
			int b=Math.abs(y2-y1);
			g.fillRect(x1,y1,h,b);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
		else
			{
		int h=Math.abs(x1-x2);
			int b=Math.abs(y1-y2);
			g.fillRect(x2,y2,h,b);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
			
	}
	if(f3==true)
		{
			if(x1<x2||y1<y2)
		{
		int h=Math.abs(x2-x1);
			int b=Math.abs(y2-y1);
			g.fillRoundRect(x1,y1,h,b,20,20);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
		else
			{
		int h=Math.abs(x1-x2);
			int b=Math.abs(y1-y2);
			g.fillRoundRect(x2,y2,h,b,20,20);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
			}
	if(f4==true)
		{
			if(x1<x2||y1<y2)
		{
		int h=Math.abs(x2-x1);
			int b=Math.abs(y2-y1);
			g.fillOval(x1,y1,h,b);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
		else
			{
		int h=Math.abs(x1-x2);
			int b=Math.abs(y1-y2);
			g.fillOval(x2,y2,h,b);
			g.drawString("("+x1+","+y1+")",x1-10,y1-10);
		g.drawString("("+x2+","+y2+")",x2,y2);
		}
	}
			}

}

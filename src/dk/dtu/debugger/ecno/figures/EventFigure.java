package dk.dtu.debugger.ecno.figures;

import java.awt.GraphicsEnvironment;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class EventFigure extends EFigure{

	private String text;
	private int width, height;
	private int expandWidth = 20;
	private int expandHeight = 10;
	protected Dimension corner = new Dimension(15, 15);
	
	public EventFigure(String text){
//		this.text = text;
//		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//		Font font = new Font(null, new FontData(fonts[0], 15, java.awt.Font.BOLD));
//				Dimension dim = FigureUtilities.getTextExtents(text, font);
//		width = dim.width;
//		height = dim.height;
//		this.setSize(dim.expand(expandWidth, expandHeight));
//		font.dispose();
		
super();
		
		this.text = text;
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		Font font = new Font(null, new FontData(fonts[0], 15, java.awt.Font.BOLD));
				//			int width = FigureUtilities.getTextWidth(text, font);
				Dimension dim = FigureUtilities.getTextExtents(text, font);
		Dimension size = dim.expand(expandWidth, expandHeight);
		this.setSize(size);
		this.setBounds(new Rectangle(0, 0, size.width, size.height));
		
		font.dispose();
	}

//	@Override
//	protected void fillShape(Graphics graphics) {
//		
//		//graphics.setBackgroundColor(getBackgroundColor());
//		graphics.setBackgroundColor(new Color(null, 33,200,100)); //rus: set the eventTypeselement background color green  
//		graphics.translate(getLocation());
//		
//		
//		
//		//
//		int width = this.width + expandWidth;//(rect.width > rect.height ? rect.height : rect.width) -2;
//		int height = this.height + expandHeight;
//		int s = 15;
//		int z = 2;
//		// fill the arrow
//		int[] points = new int[16];
//		
//		points[0] = z; 				//x1 = x8
//		points[1] = s; 			//y1 = y4
//		
//		points[2] = s; 			//x2 = x7
//		points[3] = z; 				//y2 = y3
//		
//		points[4] = width-s;		//x3 = x6
//		points[5] = z; 				//y3 = y2
//		
//		points[6] = width-z;		//x4 = x5
//		points[7] = s;			//y4 = y1
//		
//		points[8] = width-z;		//x5 = x4
//		points[9] = height-s;		//y5 = 
//		
//		points[10] = width-s;		//x6
//		points[11] = height-z;		//y6
//		
//		points[12] = s;			//x7
//		points[13] = height-z;		//y7
//		
//		points[14] = z;				//x8
//		points[15] = height-s;	//y8
//		
//		graphics.setAntialias(1);
//		graphics.fillPolygon(points);
//		
//		//graphics.fillRoundRectangle(150, 150, 100, 80, 25, 25);
//		//graphics.fillRoundRectangle(getBounds(), corner.width, corner.height); //rus : 
//		graphics.drawString(this.text, expandWidth/2, height/8);
//		
//	} // old version
	
//	//***********************rus***********************
	
	

	/**
	 * @see Shape#fillShape(Graphics)
	 */
	protected void fillShape(Graphics graphics) {
		//	System.out.println("fill shape");

		//graphics.setBackgroundColor(getBackgroundColor());
		graphics.setBackgroundColor(new Color(null, 33,200,100)); //rus: set the eventTypeselement background color green 
		graphics.fillRoundRectangle(getBounds(), corner.width, corner.height);
		Point p = getBounds().getLocation();
		int height = getBounds().height-expandHeight;
		graphics.setForegroundColor(getForegroundColor());
		graphics.drawString(text, p.x+ expandWidth/2, p.y+height/8);
		
//		width/2-this.width/2, height/8);
	}
	
	/**
	 * @see Shape#outlineShape(Graphics)
	 */
	protected void outlineShape(Graphics graphics) {
		Rectangle f = Rectangle.SINGLETON;
		Rectangle r = getBounds();

		f.x = r.x + getLineWidth() / 2;
		f.y = r.y + getLineWidth() / 2;
		f.width = r.width - getLineWidth();
		f.height = r.height - getLineWidth();
		//	getLineWidth()
		//	System.out.println(f.x + "," + f.y + ";" + f.width + "," + f.height + ";" + corner.width + "," + corner.height);
		graphics.drawRoundRectangle(f, corner.width, corner.height);
	}

//	//**********************************rus

	
	@Override
	public void setSize(int w, int h) {
		super.setSize(w, h);
	}

//	@Override
//	protected void outlineShape(Graphics graphics) {
//
//		graphics.setForegroundColor(getForegroundColor());
//
//
//		int width = this.width + expandWidth;//(rect.width > rect.height ? rect.height : rect.width) -2;
//		int height = this.height + expandHeight;
//		int s = 15;
//		int z = 2;
//		// fill the arrow
//		int[] points = new int[16];
//
//		points[0] = z; 				//x1 = x8
//		points[1] = s; 			//y1 = y4
//		
//		points[2] = s; 			//x2 = x7
//		points[3] = z; 				//y2 = y3
//		
//		points[4] = width-s;		//x3 = x6
//		points[5] = z; 				//y3 = y2
//		
//		points[6] = width-z;		//x4 = x5
//		points[7] = s;			//y4 = y1
//		
//		points[8] = width-z;		//x5 = x4
//		points[9] = height-s;		//y5 = 
//		
//		points[10] = width-s;		//x6
//		points[11] = height-z;		//y6
//		
//		points[12] = s;			//x7
//		points[13] = height-z;		//y7
//		
//		points[14] = z;				//x8
//		points[15] = height-s;	//y8
//		graphics.setLineWidth(1);
//		//graphics.drawPolygon(points);
//		graphics.drawRoundRectangle(getBounds(), corner.width, corner.height);  // rus
//		
//		
//	} // old version

	
}

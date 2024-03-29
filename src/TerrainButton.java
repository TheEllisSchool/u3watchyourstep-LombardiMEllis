import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class TerrainButton extends JButton {
	private static final int SIZE = 50; //50 pixels
	
	//attributes - position (row, col), clicked?, bomb?,
	// next to bomb?, flagged?
	private int row;
	private int col;
	private boolean isBomb = false;
	private boolean isClicked = false;
	private int nextToBombs = 0; //make sure you recalculate this value once everything created
	private boolean isFlagged = false;
	
	//methods - getters/setters
	public TerrainButton(int r, int c) {
		row = r;
		col = c;
		
		Dimension size = new Dimension(SIZE, SIZE);
		setPreferredSize(size);
	}
	
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public boolean hasBomb() {
		return isBomb;
	}
	public void setBomb() {
		isBomb = true;
	}
	public boolean beenClicked() {
		return isClicked;
	}
	public void click() { //probably will add to this once we know what happens when it is clicked
		isClicked = true;
		//System.out.println(row + " and " + col + " has been clicked!");
		if (isBomb) {
			setBackground(Color.RED);
		} else {
			setBackground(Color.BLACK);
		}
	}

}

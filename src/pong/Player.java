package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player{
	public boolean right,left;
	public int x,y; //Eixo cartesiano
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void tick() {
		if(right) {
			x++;
		}
		else if (left) {
			x--;
		}
	}
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(100, 120-10, 40, 10);
	}
}
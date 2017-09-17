package com.firstgame.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends GameObject{

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		
		velX = 5;
		velY =5;
	}

	public void tick() {
		x+= velX;
		y+=velY;
		
		if(y<=0 || y>= Game.HEIGHT -32){
			velY *=-1;
		}
		if(x<=0 || x>= Game.WIDTH -16){
			velX *=-1;
		}
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

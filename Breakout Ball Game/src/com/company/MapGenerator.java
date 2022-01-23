package com.company;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    // Constructor for MapGenerator
    public MapGenerator (int row, int col) {
        map = new int[row][col];

        // Marking untouched bricks by the ball
        for(int idRow = 0; idRow<map.length; idRow++) {
            for(int idCol =0; idCol<map[0].length; idCol++) {
                //here 1 will detect that brick is not intersected with the ball
                map[idRow][idCol] = 1;
            }
        }
        // Initializing bricks width and height based on how many rows and columns user want to start with
        brickWidth = 540/col;
        brickHeight = 150/row;
    }

    public void draw(Graphics2D g) {
        for(int idRow = 0; idRow<map.length; idRow++) {
            for(int idCol =0; idCol<map[0].length; idCol++) {
                if(map[idRow][idCol] > 0)
                {
                    g.setColor(Color.white);
                    g.fillRect(idCol * brickWidth + 80, idRow * brickHeight + 50, brickWidth, brickHeight);

                    // this is just to show separate brick, game can still run without it
                    g.setStroke(new BasicStroke(2));
                    g.setColor(Color.black);
                    g.drawRect(idCol * brickWidth + 80, idRow * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    //to change value of brick to 0 when ball intersects
    public void setBrickValue(int value, int row, int col)
    {
        map[row][col] = value;
    }
}

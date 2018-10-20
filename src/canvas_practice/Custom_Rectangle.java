/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas_practice;

import static canvas_practice.Canvas_Practice.width_of_character;
import java.awt.Graphics;

/**
 *
 * @author champion
 */
public class Custom_Rectangle extends Glyph{
    
    
      void drawCustomRectangle(Graphics g,int index){
       int x1=index*Canvas_Practice.width_of_character;
       int y1=0;
       g.drawRect(x1, y1, Canvas_Practice.width_of_character, Canvas_Practice.height_of_character);
    }

    @Override
    void draw(Graphics g, int index) {
         
        int x1=index*Canvas_Practice.width_of_character;
        int y1=0;
       g.drawRect(x1, y1, Canvas_Practice.width_of_character, Canvas_Practice.height_of_character);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas_practice;

import static canvas_practice.Canvas_Practice.width_of_character;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author champion
 */
public class Custom_Character extends Glyph {
    
    char ch;

    public Custom_Character(char ch) {
        this.ch = ch;
    }
    
     char getChar(){
    return ch;
     }

    @Override
    void draw(Graphics g, int index) {
        //TO DO: Line breaking algorithm
        
    
         String c=String.valueOf(ch);
            g.setFont(Canvas_Practice.monoFont);
            
            //w specifies the X coordinate for the Character
            int w=index*(Canvas_Practice.width_of_character);
        
             g.drawString(c, w, Canvas_Practice.height_of_character);
    }
}

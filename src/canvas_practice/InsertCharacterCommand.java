/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas_practice;

/**
 *
 * @author champion
 */
public class InsertCharacterCommand extends Command {

    Glyph glyph;
    Custom_Character ch;

    public InsertCharacterCommand(Glyph glyph, Custom_Character ch) {
        this.glyph = glyph;
        this.ch = ch;
    }
    
    
    
    @Override
    void execute(String params) {
        //make memento
        glyph.addComponent(ch);
    }

    @Override
    void unexecute() {
        
    }
    
}

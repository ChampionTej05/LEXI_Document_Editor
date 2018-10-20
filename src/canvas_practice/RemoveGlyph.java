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
public class RemoveGlyph extends Command  {

    Glyph glyph;

    public RemoveGlyph(Glyph glyph) {
        this.glyph = glyph;
    }
    
    
    
    @Override
    void execute(String params) {
        
        if(glyph.getSize()==0){
            //do nothing
        }
        else{
            memento=glyph.createMemento();
            glyph.removeComponent();
        }
    }

    @Override
    void unexecute() {
        glyph.setMemento(memento);
        System.out.println("Redo Called");
    }
    
}

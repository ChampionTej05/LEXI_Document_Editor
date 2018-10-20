/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas_practice;

import java.util.ArrayList;

/**
 *
 * @author champion
 */
public interface CustomIterator {
    
    boolean hasNext();
    Glyph next();
}

class CharacterIterator implements CustomIterator{

    int index=0;
    ArrayList<Glyph>compoList;

    public CharacterIterator(ArrayList<Glyph>compoList) {
        this.compoList=compoList;
    }
    
    
    @Override
    public boolean hasNext() {
        System.out.println("Size = "+index);
        return index<compoList.size();
    }

    @Override
    public Glyph next() {
        if(hasNext()){
            Glyph item=(Glyph)compoList.get(index);
            index+=1;
            return item;
        }
        return null;
    }
    
}

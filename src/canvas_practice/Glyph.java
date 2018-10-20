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
 

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Glyph {
     ArrayList<Glyph>char_list;

    
    
    void addComponent(Glyph glyph){
       //to do: override
    }
    
    void removeComponent(){
        //to do:override
    }
    
    Glyph getComponent(int index){
        return (Glyph) char_list.get(index);
    }
    
    ArrayList<Glyph> getComponentList(){
        return char_list;
    }
    
    abstract  void draw(Graphics g,int index);
  
    int getSize(){
        return 0;
    }
     public CustomIterator getIterator(){
           return null;
            
        }
    Memento createMemento(){
        return null;
    }
    
    void setMemento(Memento memento){
        //do nothing
    }
}

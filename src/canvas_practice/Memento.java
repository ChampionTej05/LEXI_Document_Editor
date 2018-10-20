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
public class Memento {
    
    
    ArrayList<Glyph>componentArray=new ArrayList<>();
    
    ArrayList<Glyph> getState(){
        return componentArray;
    }
    
    //use deep copy to copy the state, shallow copy doesnt work here
    void setState(ArrayList<Glyph> c){
        for(int i=0;i<c.size();i++){
            componentArray.add(c.get(i));
        }
    }
}

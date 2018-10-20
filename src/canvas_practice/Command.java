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

//implements Command Pattern
abstract class  Command {
    
    Memento memento;
    abstract void execute(String params);
    
   abstract void unexecute();
    
   Memento saveMemento(){
       //
       return null;
   }
}

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

//uses Flyweight Pattern to make the Custom Character Objects
 //uses Singleton Pattern to make the Instance of this factory.

public class CustomCharacterFlyweightFactory {
    //the instance which holds the flyweight
    private static CustomCharacterFlyweightFactory instance;

    public static CustomCharacterFlyweightFactory getInstance()
    {
        if(instance == null) instance = new CustomCharacterFlyweightFactory();
        return instance;
    }

    private CustomCharacterFlyweightFactory()
    {
        for(int i = 0; i < characters.length; i++)
        {
            customCharacterPool[i] = new Custom_Character(characters[i]);
        }
    }

    /**
     * Available characters
     */
    private char[] characters =
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                    'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                    'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                    'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '\n', '.', '+',
                    '(', ')', '=', '%', '/', '\\', '$', '@', '*', '!', '#', ':', ';', '&', '_', '-',
                    '\'', '\"', '.', ',', '?', ' '};
    
   
    private Custom_Character[] customCharacterPool = new Custom_Character[characters.length];



    public Custom_Character getCustomCharacter(char c)
    {
      
        for(int i = 0; i < customCharacterPool.length; i++)
        {
            if(c == customCharacterPool[i].getChar()) return customCharacterPool[i];
        }
        return null;
    }

}


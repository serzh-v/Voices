package com.mycompany.animals;

/**
 *
 */
public class Main {
    
    public static void main(String [] args){
        Voice voices[] = new Voice[5];
        voices[0] = new Cat();
        voices[1] = new Cow();
        voices[2] = new Cat();
        voices[3] = new Dog();
        voices[4] = new Dog();
        
        for (Voice d: voices){
            d.voice();
        }
    }
    
}

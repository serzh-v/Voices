package com.mycompany.animals;

/**
 *
 */
public class Main {
    
    public static void main(String [] args){
        Voice animals[] = new Voice[5];
        animals[0] = new Cat();
        animals[1] = new Cow();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Dog();
        
        for (Voice d: animals){
            d.voice();
        }
    }
    
}

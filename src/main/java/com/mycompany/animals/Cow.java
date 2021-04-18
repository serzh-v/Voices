package com.mycompany.animals;

/**
 * класс Корова реализует метод Голос
 */
public class Cow implements Voice {
    
    //переопределение метода Голос
    @Override
    public void voice(){
        System.out.println("МУУ");
    }
}

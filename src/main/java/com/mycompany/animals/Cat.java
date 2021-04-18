package com.mycompany.animals;

/**
 * класс Кошка реализует интерфейс Голос 
 */
public class Cat implements Voice {
    
    //переопределение метода Голос
    @Override
    public void voice(){
        System.out.println("МЯУ");
    }
}

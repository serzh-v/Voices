package com.mycompany.animals;

/**
 * класс Собака реализует интерфейс Голос
 */
public class Dog implements Voice {
 
    //переопределение метода Голос
    @Override
    public void voice(){
        System.out.println("ГАВ");
    }
    
}

package com.company;

public interface Car {
    default void Scream(String senstence){
        System.out.println(senstence);
    }
    void Sound();
}

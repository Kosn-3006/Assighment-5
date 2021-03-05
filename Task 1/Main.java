package com.company;

public class Main {

    public static void main(String[] args) {
     Car camry= new Car(){
         @Override
         public void Sound(){
         System.out.println(" ");}
     };
camry.Scream("Camry 35");
    }
}

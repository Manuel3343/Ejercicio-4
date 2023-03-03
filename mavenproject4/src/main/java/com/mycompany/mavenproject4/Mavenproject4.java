package com.mycompany.mavenproject4;
 import java.util.Scanner;

public class Mavenproject4{

    public static void main(String[] args) {
        
        //se crean los atributos o variables
        double mamajuan; 
        double juan;
        double alberto;
        double ana;
      
        
        Scanner leersal = new Scanner (System.in); 
        
        System.out.println("Ingrese edad Juan"); 
        juan = leersal.nextDouble();
        alberto = (juan * 2)/3;
        ana = (juan * 4)/3;
        mamajuan = juan + alberto + ana;
    
        System.out.println("La edad de Juan es " + juan);
        System.out.println("La edad de Alberto es " + alberto);
        System.out.println("La edad de Ana es " + ana);
        System.out.println("La edad de la mamá de Juan es " + mamajuan);
    }
         
}

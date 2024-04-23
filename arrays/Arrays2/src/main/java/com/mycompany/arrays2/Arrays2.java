/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays2;

/**
 *
 * @author juane
 */
public class Arrays2 {

    public static void main(String[] args) {
        String [] paises=new String[8];
        
        paises[0]="España";
        paises[1]="México";
        paises[2]="Colombia";
        paises[3]="Perú";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";
        
        /*for(int i=0;i<paises.length;i++){//Metodo tradicional
            System.out.println(paises[i]);
        }*/ 
        
        for(String i:paises){
            System.out.println(i);
        }
        
    }
}

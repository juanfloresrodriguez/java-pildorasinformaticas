/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays1;

/**
 *
 * @author juane
 */
public class Arrays1 {

    public static void main(String[] args) {
        //int [] mi_matriz={5, 38, -15, 92, 71};//Otra forma de declarar la matriz si sabemos los valores
        
        int [] mi_matriz=new int[5];
        
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;
        
        System.out.println(mi_matriz[0]);//Si queremos inprimir una posición en concreto
        
        for(int i=0;i<mi_matriz.length;i++){//Para imprimir la matriz al completo
            System.out.println(mi_matriz[i]);
        }
    }
}

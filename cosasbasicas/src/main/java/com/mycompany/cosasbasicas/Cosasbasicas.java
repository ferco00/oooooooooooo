/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cosasbasicas;

//import java.util.Scanner;

import java.util.Scanner;

//import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fernando
 */
public class Cosasbasicas {
//scanner
    //import java.util.Scanner;
    //Scanner entrada = new Scanner(System.in);
    //System.out.println("como se llama tu materia 1");
    //mat1= entrada.nextLine();  cuando es string
    //c1 = entrada.nextInt();    cuandp es numeros
    //

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"hola mundo");
        //String nombre=JOptionPane.showInputDialog(null, "dame tu nombre");
        //JOptionPane.showMessageDialog(null,"usted se llama "+nombre);
        //JOptionPane.showConfirmDialog(null, "sos gei?");
        //Double num= Double.parseDouble(JOptionPane.showInputDialog(null, "Cual es tu calificacion"));
        //dEFINIR String,double,int,float
        Scanner entrada = new Scanner (System.in);
        int num1;
        int num2;
        
                
                System.out.println("Dame un numero");
                num1=entrada.nextInt(); 
                System.out.println("Dame un numero");
                num2=entrada.nextInt();
                if (num1<num2 ){
                    System.out.println("el num1 es menor");
                }
                else {
                    System.out.println("el num2 es menor");
                }
    }
}

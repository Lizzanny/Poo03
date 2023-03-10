/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Operacion {
    private Scanner sc = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese número 1:");
        this.setNumero1(sc.nextInt());
        
        System.out.println("Ingrese número 2:");
        this.setNumero2(sc.nextInt());
    }
    
    public int sumar(){
        return this.numero1 + getNumero2();
    }
    
    public int restar(){
        return this.numero1 - getNumero2();
    }
    
    public int multiplicar(){
        if(this.numero1==0||this.numero2==0){
            System.out.println("¡ERROR!:Alguno de los números ingresados es cero");
            return 0;
        }else{
            return this.numero1 * getNumero2();
        }
    }
    
    public double dividir(){
        if(this.numero1==0||this.numero2==0){
            System.out.println("¡ERROR!:Alguno de los números ingresados es cero");
            return 0;
        }else{
            return (double)this.numero1 / (double)getNumero2();
        }
    }
}

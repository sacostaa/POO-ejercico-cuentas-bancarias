/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        cuentabancaria c1 = new cuentabancaria(1012,"Magdalena Sanchez",1234,0);
        
        System.out.println("c1:");
        System.out.println(c1.consignar(100000));
        System.out.println(c1.getSaldo());
        
        
        cuentabancaria c2 = new cuentabancaria (1013, "Joselito Perez",9876,500000);
        
        System.out.println("c2:");
        System.out.println(c2.cambiarclave(1111));
        System.out.println(c2.consultar());
        System.out.println(c2.getClave());
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saragonzalez;

import java.util.Scanner;

/**
 *
 * @author SARA
 */
public class SaraGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce los grados Celsius: ");
        double celsius=teclado.nextDouble();
        double kelvin=celsius+273.15;
        System.out.println("La conversión son: "+kelvin+"K");
    }
    
}

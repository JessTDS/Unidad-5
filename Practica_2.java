
package practica_2;

import java.util.Scanner;


public class Practica_2 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        double num1;
        double num2;
        
        System.out.println("Escribe dos numeros y se haran operaciones:");

        System.out.print("Escribe el primer numero: ");       
        num1 = scanner.nextDouble();
        
        System.out.print("Escribe el segundo nuumero: ");
        num2= scanner.nextDouble();
        
        System.out.println("*************************************");
        
        System.out.println("La suma es: "+Sumar(num1, num2));
        System.out.println("La resta es: "+Restar(num1, num2));       
        System.out.println("La division es: "+Dividir(num1, num2));
        System.out.println("La multiplicacion es: "+Multiplicar(num1, num2));
        System.out.println();
    }
    
    public static double Sumar (double num1, double num2){
        double suma = num1+num2;
        return suma;
    }
   
    public static double Restar (double num1, double num2){
        double resta = num1-num2;
        return resta;
    }
    
    public static double Dividir (double num1, double num2){
        double division = num1/num2;
        return division;
    }
    
    public static double Multiplicar(double num1, double num2){
        double multiplicacion= num1*num2;
        return multiplicacion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_Exceptions_SuiteFibonacci;

/**
 *
 * @author hamza
 */
import ex2_Exceptions_SuiteFibonacci.FibonacciException;
import ex2_Exceptions_SuiteFibonacci.Fibonacci;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Entrez un entier strictement positif : ");
                if (!scanner.hasNextInt()) {
                    throw new Exception("Entrée invalide! \n");
                }
                n = scanner.nextInt();
                System.out.println("Le " + n + "ème nombre de la suite de Fibonacci est : " + Fibonacci.fibonacci(n));
                validInput = true;
            } catch (FibonacciException e) {
                System.err.println("Erreur : " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Erreur : Veuillez entrer un entier valide! \n");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

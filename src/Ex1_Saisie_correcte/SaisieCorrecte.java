/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1_Saisie_correcte;

/**
 *
 * @author hamza
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieCorrecte {

    public static int saisieCorrecte() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier supérieur à 10 : ");
                n = scanner.nextInt();
                if (n <= 10) {
                    throw new IncorrectValueException("Erreur : L'entier doit être strictement supérieur à 10 ! \n");
                }
                saisieValide = true;
            } catch (InputMismatchException e) {
                System.err.println("Erreur : Vous devez saisir un nombre entier ! \n");
                scanner.next();
            } catch (IncorrectValueException e) {
                System.out.println(e.getMessage());
            }
        }
        return n;
    }
}
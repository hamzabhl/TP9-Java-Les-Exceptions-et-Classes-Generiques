/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_ClassesGeneriques.ma.projet.listePersonnes;

import ex5_ClassesGeneriques.ma.projet.Personne;
import java.util.List;

/**
 *
 * @author hamza
 */
public class listePersonnes {

    public static void afficherPersonnes(List<? extends Personne> liste) {
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "ID", "Last Name", "First Name", "Salary", "Specialty/Service");

        for (Personne p : liste) {
            System.out.println(p.afficher());
        }
    }
}

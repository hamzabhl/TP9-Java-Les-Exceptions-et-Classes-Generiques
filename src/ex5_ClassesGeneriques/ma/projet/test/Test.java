/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_ClassesGeneriques.ma.projet.test;

import ex5_ClassesGeneriques.ma.projet.bean.Developpeur;
import ex5_ClassesGeneriques.ma.projet.bean.Manager;
import ex5_ClassesGeneriques.ma.projet.listePersonnes.listePersonnes;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author hamza
 */
public class Test {

    public static void main(String[] args) {
        List<Developpeur> devs = Arrays.asList(
                new Developpeur(1, "El Amrani", "Omar", 15000, "Java"),
                new Developpeur(2, "Benali", "Youssef", 14000, "Python"),
                new Developpeur(3, "Tazi", "Hassan", 16000, "JavaScript"),
                new Developpeur(4, "Bouhaddou", "Sara", 15500, "PHP"),
                new Developpeur(5, "Chakir", "Mehdi", 14500, "C++"),
                new Developpeur(6, "Raji", "Soufiane", 16500, "React"),
                new Developpeur(7, "El Idrissi", "Lina", 17000, "Kotlin")
        );

        List<Manager> mgrs = Arrays.asList(
                new Manager(8, "El Fassi", "Khalid", 20000, "IT"),
                new Manager(9, "Benkirane", "Fatima", 22000, "RH"),
                new Manager(10, "Ouazzani", "Hassan", 21000, "Finance")
        );

        System.out.println("List of Devloppers : \n");
        listePersonnes.afficherPersonnes(devs);

        System.out.println("\n\nList of Managers : \n");
        listePersonnes.afficherPersonnes(mgrs);
        System.out.println("");
    }
}

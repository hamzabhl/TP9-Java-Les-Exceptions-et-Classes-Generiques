/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_ClassesGeneriques.ma.projet.bean;

import ex5_ClassesGeneriques.ma.projet.Personne;

/**
 *
 * @author hamza
 */
public class Developpeur extends Personne {

    private String specialite;

    public Developpeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.1;
    }

    @Override
    public String afficher() {
        // Retourne la chaîne formatée avec les informations du développeur
        return String.format("%-10d %-15s %-15s %-15.2f %-15s",
                getId(), getNom(), getPrenom(), getSalaire(), specialite);
    }

}

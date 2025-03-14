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
public class Manager extends Personne {

    private String service;

    public Manager(int id, String nom, String prenom, double salaire, String service) {
        super(id, service, service, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.3;
    }

    @Override
    public String afficher() {
        // Retourne la chaîne formatée avec les informations du développeur
        return String.format("%-10d %-15s %-15s %-15.2f %-15s",
                getId(), getNom(), getPrenom(), getSalaire(), service);
    }

}

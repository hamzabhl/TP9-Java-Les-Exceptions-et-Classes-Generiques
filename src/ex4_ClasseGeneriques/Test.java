/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_ClasseGeneriques;

/**
 *
 * @author hamza
 */
public class Test {

    public static void main(String[] args) {
        Triplet<Integer, String, Double> triplet1 = new Triplet<>(1, "Karim", 3.14);
        triplet1.affiche();

        Triplet<String, Boolean, Float> triplet2 = new Triplet<>("Red1", true, 5.6f);
        triplet2.affiche();

        Triplet<Character, Long, String> triplet3 = new Triplet<>('C', 100000L, "ZX10R");
        triplet3.affiche();
    }
}

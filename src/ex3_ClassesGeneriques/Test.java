/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_ClassesGeneriques;

/**
 *
 * @author hamza
 */
public class Test {

    public static void main(String[] args) {
        Triplet<Integer> tripletInt = new Triplet<>(1, 2, 3);
        tripletInt.affiche();

        Triplet<String> tripletStr = new Triplet<>("Alice", "Bob", "Charlie");
        tripletStr.affiche();

        Triplet<Double> tripletDouble = new Triplet<>(1.1, 2.2, 3.3);
        tripletDouble.affiche();
    }
}

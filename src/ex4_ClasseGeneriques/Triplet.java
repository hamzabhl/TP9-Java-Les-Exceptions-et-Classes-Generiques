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
public class Triplet<T1, T2, T3> {

    private T1 premier;
    private T2 second;
    private T3 troisieme;

    public Triplet(T1 fst, T2 scd, T3 trd) {
        this.premier = fst;
        this.second = scd;
        this.troisieme = trd;
    }

    public T1 getPremier() {
        return premier;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getTroisieme() {
        return troisieme;
    }

    public void affiche() {
        System.out.println("( " + premier + " , " + second + " , " + troisieme + " ]");
    }
}

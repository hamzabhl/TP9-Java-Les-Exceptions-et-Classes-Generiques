/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_Exceptions_SaisieCorrecte;

/**
 *
 * @author hamza
 */
public class IncorrectValueException extends Exception {

    public IncorrectValueException(String msg) {
        super(msg);
    }
}

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
public class FibonacciException extends Exception {
    public FibonacciException(String msg) {
        super(msg);
    }
}
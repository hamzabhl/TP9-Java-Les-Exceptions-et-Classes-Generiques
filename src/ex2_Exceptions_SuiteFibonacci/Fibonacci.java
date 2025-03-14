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
public class Fibonacci {

    public static int fibonacci(int n) throws FibonacciException {
        if (n <= 0) {
            throw new FibonacciException("L'entier doit être supérieur à 0! \n");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

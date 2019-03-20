/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author 20161014040004
 */
public class Fibo {
    static long fibo(int n) {
        int F = 0;     // atual
        int ant = 0;   // anterior
  
        for (int i = 1; i <= n; i++) {
  
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
  
        }
  
        return F;
    }
    
}

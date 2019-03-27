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
public abstract class Fibo {
    static long fibo(int n) {
        int F = 1;     // atual
        int ant = 1;   // anterior
        
        for (int i = 1; i <= n; i++) {  
            if (i > 2) {
                int aux = F;
                F += ant;
                ant = aux;
            }
            if(i < n)
                System.out.println(F);  
        }
  
        return F;
    }
    
}

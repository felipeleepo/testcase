/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author 20161014040004
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    private int a,b,c;
    public Triangulo(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public boolean ÉTriangulo(){
        
        int x = a;
        int y = b;
        int z = c;
        if((Math.pow((double)(y - z), 1.0) < x && x < y + z) &&(Math.pow((double)(x - z), 1.0) < y && x < x + z) &&(Math.pow((double)(x - y), 1.0) < z && x < x + y)){
            if(x == y && y == z){
                System.out.println("Equilátero");
                return true;
            }
            else if(x == y || x == z || y == z){
                System.out.println("Isósceles");
                return true;
            }
            else{
                System.out.println("Escaleno");
                return true;
            }
        }
        else
            System.out.println("Dados inseridos não são de um triângulo");
        return false;
    }
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
          System.out.println(Fibo.fibo(2));
//        while(true){
//            System.out.print("LADOS DO TRIÂNGULO: ");
//            int x,y,z;
//            
//            x = (int)(Math.random()*10)% 5;
//            y = (int)(Math.random()*10)% 5;
//            z = (int)(Math.random()*10)% 5;
//            System.out.println(x + ", " + y + ", " + z);
//            Triangulo t = new Triangulo(x, y, z);
//            System.out.println("É triângulo? " + t.ÉTriangulo());
//            Thread.sleep(1000);
//        }
        
    }
    
}

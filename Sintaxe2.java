/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.Scanner;
public class Sintaxe2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float r; 
        float s; 
        float t;
        r = teclado.nextFloat();
        s = teclado.nextFloat();
        t = teclado.nextFloat();
        if (r > s && r > t)
            System.out.print(r);
        if (s > r && s > t)
            System.out.print(s);
        if (t > s && t > r)
            System.out.print(t);
                     
    }
    
}

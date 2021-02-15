/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Sintaxe6 {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int soma;
        while (a < 101){
            System.out.print(a + " ");
            soma = a + b;
            a = b;
            b = soma;
        }
        
    }
}

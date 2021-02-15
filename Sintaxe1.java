/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class Sintaxe1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        int i;
        int valoresNegativos = 0;
        n = teclado.nextInt();
        for (i = 0; i < n; i++){
            int valor;
            valor = teclado.nextInt();
            if (valor < 0){
                valoresNegativos += 1; 
            }  
        }
        System.out.println(valoresNegativos);
    }
    
}

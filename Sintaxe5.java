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
public class Sintaxe5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        if (n > 0){
            int i;
            int fatorial = 1;
            for (i = 1; i < n+1; i++){
                fatorial = fatorial * i;
            }
            System.out.print(fatorial);
        }
        else{
            System.out.print("Não foi possível calcular o fatorial.\n-1");
            
        }
            
        
    }
    
}

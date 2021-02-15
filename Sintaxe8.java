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
public class Sintaxe8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        int [][] matriz = new int [n][n];
        int i;
        int j;
        int errado = 0;
        int somaDiagonal = 0;          
        int somaDiagonalSecundaria = 0;
        
        for (i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                matriz[i][j] = teclado.nextInt();               
            } 
        }
        
        for (i = 0; i < n; i++){ 
            somaDiagonal = somaDiagonal + matriz[i][i];     
                       
        }
        for (i = 0; i < n; i++){
            int somaLinha = 0;
            for(j = 0; j < n; j++){
                somaLinha = somaLinha + matriz[i][j];
            }
            if(somaLinha != somaDiagonal){
                errado++;
            }
        }
        
        for (i = 0; i < n; i++){
            int somaColuna = 0;
            for(j = 0; j < n; j++){
                somaColuna = somaColuna + matriz[j][i];       
            }
            if(somaColuna != somaDiagonal){
                errado++;
            }
        }     
        
        for (i = 0; i < n; i ++){
            somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][(n-1)-i];   
        } 
        if(somaDiagonalSecundaria != somaDiagonal){
                errado++;
        }
        
        if (errado == 0){
            System.out.println("A matriz é um quadrado mágico.");
        }
        
        else{
            System.out.println("A matriz nao é um quadrado mágico.");
        }
            
    }
}

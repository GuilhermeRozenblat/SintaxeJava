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
public class Sintaxe7 {
    public static void main(String[] args){
        Scanner teclado  = new Scanner(System.in);
        int numero = teclado.nextInt();
        int pessima = 0;
        int ruim = 0;
        int boa = 0;
        int otima = 0;
        while ((numero >= 0) && (numero <= 100)){
            if ((numero >= 0) && (numero <= 25)){
                pessima++; 
            }
            if ((numero > 25) && (numero <= 50)){
                ruim++;
            }
            if ((numero > 50) && (numero <= 75)){
                boa++;
            }
            if ((numero > 75) && (numero <= 100)){
                otima++;
            }
            numero = teclado.nextInt();
            
        }
        int total = pessima + ruim + boa + otima;
        int porcentagemPessima = (pessima*100)/total;
        int porcentagemRuim = (ruim*100)/total;
        int porcentagemBoa = (boa*100)/total;
        int porcentagemOtima = (otima*100)/total;
        
        System.out.println("Péssimas " + porcentagemPessima +"%");
        System.out.println("Ruins: " + porcentagemRuim +"%");
        System.out.println("Boas: " + porcentagemBoa +"%");
        System.out.println("Ótimas: " + porcentagemOtima +"%");
    }
    
}

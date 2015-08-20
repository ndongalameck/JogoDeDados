/**
*	decricao  : o bjetivo do jogo é verificar se o palpite do usuario é igual ao valor que cai no dado com a ajuda da funcao Random 
*	que escolhe um valor inteiro aleatoriamente e apresenta ao user. 
*	se o palpite for igual ao que caiu no dado, entao informar que acertou, se nao, entao errou. 
*	
*	@author : meck
*/

import java.util.Scanner;
import java.util.Random;

    public class JogoDeDados 
    {
        public static void main(String[] meck)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Qual é o seu palpite para com dado?");
            int palpite = s.nextInt();
            
            Random r = new Random();
            int dado = r.nextInt(6)+1;  // 0-5 : que corresponde aos valores de um dado
            
            System.out.println("seu palpite = " + palpite);
            System.out.println("seu dado = " + dado);
            
            if (palpite  == dado) {
                System.out.println("Acertou no dado");
            } else {
                System.out.println("Errou no dado");        
            }
        }
    }

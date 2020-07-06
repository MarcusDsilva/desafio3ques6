/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double n1, n2, n3, mp;
      int codigo;
      String r;

    Scanner ler = new Scanner(System.in);

    System.out.println("informe o codigo" + "do alunio");
    codigo = ler.nextInt();
    System.out.println("Informe a primeira nota");
    n1 = ler.nextDouble();
    System.out.println("Informe a segunda nota");
    n2 = ler.nextDouble();
    System.out.println("Informe a terceira nota");
    n3 = ler.nextDouble();

    mp = (n1 * 4 + n2 * 3 + n3 * 3)/10;

    if (mp >= 5) {
     r = "aprovado";
    }else{
    r = "reprovado";
    }
    System.out.println("O codigo do aluno" +codigo +"\nNota 1:" +n1+ 
    "\nNota 2:" +n2+ "\nNota 3:" +n3+ "\nMedia poderada:" +mp+"\nSituação:" +r); 
    }
}
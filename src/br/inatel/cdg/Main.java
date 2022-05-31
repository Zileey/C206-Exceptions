package br.inatel.cdg;

import br.inatel.cdg.ListaMapa;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String nome;
        double valor;

        Scanner sc = new Scanner(System.in);
        ListaMapa novalista = new ListaMapa();
        System.out.println("Digite o nome do projeto");
        nome = sc.next();
        novalista.setNomeProjeto(nome);
        System.out.println("Digite a nota do projeto");
        valor = sc.nextDouble();
        novalista.setNota(valor);

        try{


        }catch(Exception e){
            System.out.println("Nota insuficiente para aprovação!");
        }



          sc.close();
    }
}

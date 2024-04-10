package org.br.application;

import java.util.Scanner;

import org.br.DTO.Aluno;
import org.br.domain.Avalia;

public class Main {
    public static void main(String[] args) {
    	
    	Avalia avalia = new Avalia();
    	
    	Aluno aluno = new Aluno();
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Escreva seu nome...");
    	String nome = scan.nextLine();
    	
    	System.out.println("Digite sua matricula...");
    	String matricula = scan.nextLine();
    	
    	
    	System.out.println("Digite a primeira nota do aluno...");
    	Double notaUm = scan.nextDouble();

    	System.out.println("Digite a segunda nota do aluno...");
    	Double notaDois = scan.nextDouble();
    	
    	aluno.setNome(nome);
    	aluno.setMatricula(matricula);
    	
    	aluno.setNota1(notaUm);
    	aluno.setNota2(notaDois);
    	
    	System.out.println("\n"+avalia.exibeInformacoes(aluno));
    	System.out.println("\n"+avalia.avaliaAluno(aluno));
    	
    
    }
}
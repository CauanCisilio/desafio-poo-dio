package org.br.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.br.DTO.Aluno;
import org.br.DTO.Curso;

public class Avalia{
	
	public String avaliaAluno(Aluno aluno) {
		Double notaFinal = aluno.getNota1()+aluno.getNota2();
		if(notaFinal>=6) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	public String exibeInformacoes(Aluno aluno){
		StringBuilder build = new StringBuilder();
		build.append("nome do aluno: "+aluno.getNome());
		build.append("\nMatricula do aluno:"+aluno.getMatricula());
		
		String info = build.toString();		
		
		return info;
	}
	public List<Curso> cursoMatriculado(Curso curso, LocalDate data, Double duracao, String nome){
		List<Curso> info = new ArrayList<>();
		curso.setNome(nome);
		curso.setData(data);
		curso.setDuracao(duracao);
		info.add(curso);
		return info;
	}
}

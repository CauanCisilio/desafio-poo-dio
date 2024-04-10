package org.br.DTO;

public class Aluno extends Pessoa {
	
    private String matricula;
    private Double nota1;
    private Double nota2;
    
    private char turma;
    private int semestre;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public char getTurma() {
		return turma;
	}
	public void setTurma(char turma) {
		this.turma = turma;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
    

}

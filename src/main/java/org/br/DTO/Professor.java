package org.br.DTO;

import java.util.List;
public class Professor extends Pessoa {

	private List<Curso> curso;
	
	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

}

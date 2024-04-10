package org.br.DTO;

import java.time.LocalDate;

public class Curso {
   
	String nome;
    LocalDate data;
    Double duracao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getDuracao() {
        return duracao;
    }
}

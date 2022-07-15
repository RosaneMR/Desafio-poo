package br.com.dio.desafio.domínio;

import java.time.LocalDate;

public abstract class Mentoria extends Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate date;

    public Mentoria() {
        this.titulo = titulo;
        this.descricao = descricao;
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", date=" + date +
                '}';
    }
}

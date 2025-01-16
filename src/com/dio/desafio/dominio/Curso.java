package com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp(){
        return 10;
    }

    public String toString(){
        return  getTitulo() + " " + getDescricao() + " " + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}

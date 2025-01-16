package com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> contudosConcluidos = new LinkedHashSet<>();


    public Dev(String nome, Set<Conteudo> conteudosInscritos, Set<Conteudo> contudosConcluidos) {
        this.nome = nome;
        this.conteudosInscritos = conteudosInscritos;
        this.contudosConcluidos = contudosConcluidos;
    }

    public void increverBootcamp(Bootcamp bootcamp){
        
    }

    public void progredir(){

    }

    public void calcularXpTotal(){

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((contudosConcluidos == null) ? 0 : contudosConcluidos.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (contudosConcluidos == null) {
            if (other.contudosConcluidos != null)
                return false;
        } else if (!contudosConcluidos.equals(other.contudosConcluidos))
            return false;
        return true;
    }



    
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;

        if (getNome() != null ? !getNome().equals(bootcamp.getNome()) : bootcamp.getNome() != null) return false;
        if (getDescricao() != null ? !getDescricao().equals(bootcamp.getDescricao()) : bootcamp.getDescricao() != null)
            return false;
        if (!getDataInicial().equals(bootcamp.getDataInicial())) return false;
        if (!getDataFinal().equals(bootcamp.getDataFinal())) return false;
        if (getDevsInscritos() != null ? !getDevsInscritos().equals(bootcamp.getDevsInscritos()) : bootcamp.getDevsInscritos() != null)
            return false;
        return getConteudos() != null ? getConteudos().equals(bootcamp.getConteudos()) : bootcamp.getConteudos() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getDescricao() != null ? getDescricao().hashCode() : 0);
        result = 31 * result + getDataInicial().hashCode();
        result = 31 * result + getDataFinal().hashCode();
        result = 31 * result + (getDevsInscritos() != null ? getDevsInscritos().hashCode() : 0);
        result = 31 * result + (getConteudos() != null ? getConteudos().hashCode() : 0);
        return result;
    }
}

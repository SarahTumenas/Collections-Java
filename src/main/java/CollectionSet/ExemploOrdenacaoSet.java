package CollectionSet;
/*
Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene o conjunto exibindo:
(nome - gênero -tempo de episódio):
Série 1 : Nome = Mandalorian, genêro = fantasia, tempoEpisódio = 25;
Série 2 : Nome = Arquivo X, genêro = scifi, tempoEpisódio = 60;
Série 1 : Nome = This is us, genêro = drama, tempoEpisódio = 60;
 */

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("--\t Ordem aleatória: \t-- ");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Mandalorian", "fantasia", 25));
            add(new Serie("Arquivo X", "scifi", 60));
            add(new Serie("This is us", "drama", 60));

        }};
        for (Serie serie : minhasSeries)
            System.out.println(
                    serie.getNome() + " - "
                            + serie.getGenero() + " - "
                            + serie.getTempoEpisodio() + " - ");

        System.out.println("--\t Ordem inserção: \t--");

        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Mandalorian", "fantasia", 25));
            add(new Serie("Arquivo X", "scifi", 60));
            add(new Serie("This is us", "drama", 60));

        }};

        for (Serie serie : minhasSeries1)
            System.out.println(
                    serie.getNome() + " - "
                            + serie.getGenero() + " - "
                            + serie.getTempoEpisodio() + " - ");


        System.out.println("--\t Ordem natural(Tempo de Episódio): \t--");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries2)
            System.out.println(
                    serie.getNome() + " - "
                            + serie.getGenero() + " - "
                            + serie.getTempoEpisodio() + " - ");



        System.out.println("--\t Ordem Nome/Gênero/Tempo de Episódio: \t--");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3)
            System.out.println(
                    serie.getNome() + " - "
                            + serie.getGenero() + " - "
                            + serie.getTempoEpisodio() + " - ");

    }
}

class Serie implements Comparable <Serie>{
   private String nome;
   private String genero;
   private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio !=0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());


    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator <Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {

        int nome =  s1.getNome().compareTo(s2.getNome());
        if (nome !=0) return nome;

        int genero =  s1.getGenero().compareTo(s2.getGenero());
        if (genero !=0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}

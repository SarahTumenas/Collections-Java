package CollectionMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Livros {
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros that = (Livros) o;
        return nome.equals(that.nome) && paginas.equals(that.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator <Map.Entry<String, Livros>>{


    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator <Map.Entry<String, Livros>>{


    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
         return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}

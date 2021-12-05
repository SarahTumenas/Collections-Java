package CollectionMap;

import java.util.*;

/*
Dados as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e o ordene:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo, páginas : 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas : 408
Autor = Harari, Yuval Naah - Livro = nome: Lições para o Século 21, páginas : 432

 */
public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\t Ordem Aleatória\t -- ");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo",256 ));
            put("Duhigg, Charles", new Livros("O Poder do Hábito",408 ));
            put("Harari, Yuval Naah", new Livros("Lições para o Século 21",432 ));

        }};
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());



        System.out.println("--\t Ordem de Inserção\t -- ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(meusLivros);
        for(Map.Entry<String, Livros> livro1 : meusLivros1.entrySet())
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());


        System.out.println("--\t Ordem Alfabética Autores\t -- ");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livros> livros : meusLivros2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());



        System.out.println("--\t Ordem Alfabética Nome dos Livros\t -- ");

        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livros : meusLivros3)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());



        System.out.println("--\t Ordem número de páginas\t -- "); //pra você fazer sozinha
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livros : meusLivros4)
            System.out.println(livros.getKey() + " - " + livros.getValue().getPaginas());

    }
}

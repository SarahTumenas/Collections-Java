package CollectionSet;


import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    //Dada uma lista com 7 notas de um aluno {7,8.5,9.3,5,7,0,3.6} faça:

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<Double>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
        System.out.println(notas.toString());
 /*System.out.println("Exiba a posição da nota 5.0: ");
 no set,posições são aleatórias, então não dá pra pesquisar posição
 nem adicionar, retirar, exibir posições de ordem de adição  ou substituir em posições específicas
  */
        System.out.println("Confira se a nota 5 está no conjunto : " + notas.contains(5.0));

        System.out.println("Exiba a menor nota : " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " +  (soma / notas.size()));

        System.out.println("Remova a nota 0");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)  iterator1.remove() ;
        }

        System.out.println(notas);


        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("exiba todas as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas2.clear();
        System.out.println(notas2);

        System.out.println("Confira se o conjunto1 está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto3 está vazio: " + notas3.isEmpty());










    }
}

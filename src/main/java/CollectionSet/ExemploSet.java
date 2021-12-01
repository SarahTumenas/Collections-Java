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




    }
}

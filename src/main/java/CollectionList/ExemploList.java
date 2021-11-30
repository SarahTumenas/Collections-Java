package CollectionList;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //Dada uma lista com 7 notas de um aluno {7,8.5,9.3,5,7,0,3.6}, faça:

        System.out.println("Crie uma lista e adicone sete notas: ");

        List <Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(3,6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista ");
        System.out.println(notas.contains(5.0));

        System.out.println("Exiba todos as notas em ordem em que foram informados");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adiconada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator <Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("A soma dos valores é : " +  soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0:");
        notas.remove(0);
        System.out.println(notas);


        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator <Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
           Double next = iterator1.next();
           if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verifique se a lista está vazia: " + notas.isEmpty());










    }
}

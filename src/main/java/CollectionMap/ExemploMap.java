package CollectionMap;

/*
Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4 Km/L
modelo = uno - consumo = 15,6 Km/L
modelo = mobi - consumo = 16,1 Km/L
modelo = hb20 - consumo = 14,5 Km/L
modelo = kwid - consumo = 15,6 Km/L
 */

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/L: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);


        System.out.println("Confira se o modelo tucson está adicionado: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

 // System.out.println("Exiba o terceiro modelo adicionado: " );assim como em set, não é possível ver a ordem de adição

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());


        System.out.println("Exiba o modelo mais econômico e seu consumo: " );

        Double consumoModeloMaisEconomico =  Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {

            if (entry.getValue().equals(consumoModeloMaisEconomico)) modeloMaisEficiente = entry.getKey();

            System.out.println("Modelo mais eficiente : " + modeloMaisEficiente
                    + " seu consumo: " + consumoModeloMaisEconomico + " Km/L");

        }



        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double consumoModeloMenosEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String,Double> entry1: entries1) {

            if (entry1.getValue().equals(consumoModeloMenosEconomico)) modeloMenosEficiente = entry1.getKey();

            System.out.println("Modelo menos eficiente: " + modeloMenosEficiente
                    + " e seu cosumo: " + consumoModeloMenosEconomico + " Km/L" );

        }



        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma= 0d;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é de: " + soma);


        System.out.println("Exiba a média dos consumos deste dicionário de carros: "
                + (soma/carrosPopulares.size()));


        System.out.println("Remova os modelos com o consumo igual a 15,6 Km/L: ");

        System.out.println("Dicionário antes da remoção: " + carrosPopulares);

        Iterator <Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Dicionário de carros após remoção: " + carrosPopulares);


        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Verifique se o dicionário de carros está vazio: " + carrosPopulares.isEmpty());




    }
}

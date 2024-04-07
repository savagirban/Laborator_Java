package org.example.problema1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var carti = Carte.mapFromJson("src/main/resources/carti.json");
        Carte.showMap(carti);

        // Stergere carte
        System.out.println("Stergere Carte:");
        carti.remove(3);
        Carte.showMap(carti);
        System.out.println("\nAdaugare Carte:");
        carti.putIfAbsent(3,new Carte("Cel mai iubit dintre pamanteni","Marin Preda",1980));
        Carte.showMap(carti);
        Carte.mapToJson("src/main/resources/carti.json",carti);
        Set<Carte> multimeCarti = carti.values()
                .stream()
                .filter(carte -> "Yuval Noah Harari".equals(carte.autorul()))
                .collect(Collectors.toSet());
        System.out.println("Multime Carti:\n");
        multimeCarti.forEach(System.out::println);
        System.out.println("\nOrdinare multimi:\n");
        var sortat = multimeCarti.stream().sorted((carte,other)->carte.titlul().compareTo(other.titlul())).toList();

        sortat.forEach(System.out::println);
        var oldest  = multimeCarti.stream()
                .min((carte,other)->carte.anul()
                -other.anul())
                .stream().findAny()
                ;
        oldest.ifPresentOrElse(System.out::println,()-> System.out.println("Nu exista cea mai veche carte"));



    }
}

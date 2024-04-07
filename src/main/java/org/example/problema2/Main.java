package org.example.problema2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int i = 12;
        //Set<InstrumentMuzical> instrumente = HashSet.newHashSet(i);
        //instrumente.add(new Chitara("producator",12,TipChitara.CLASICA,3));
        //instrumente.add(new Chitara("prod2",13,TipChitara.ELECTRICA,5));
        //InstrumentMuzical.setToJson("src/main/resources/instrumente.json",instrumente);
        var instrumente = InstrumentMuzical.setFromJson("src/main/resources/instrumente.json");
        System.out.println(instrumente);
    }
}

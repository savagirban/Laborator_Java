package org.example.problema2;

enum TipChitara{ELECTRICA,ACUSTICA,CLASICA}
public class Chitara extends InstrumentMuzical{
    TipChitara tipChitara;
    int nrCorzi;

    public Chitara(String producator, double pret) {
        super(producator, pret);
    }

    public Chitara(String producator, double pret, TipChitara tipChitara, int nrCorzi) {
        super(producator, pret);
        this.tipChitara = tipChitara;
        this.nrCorzi = nrCorzi;
    }
}

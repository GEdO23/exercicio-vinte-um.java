package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for (int j = 1; j <= 14; j++) {
            int qtdPontos = j;
            Carta cartaHearts = new Carta(qtdPontos, Naipe.Hearts);
            Carta cartaSpades = new Carta(qtdPontos, Naipe.Spades);
            Carta cartaDiamonds = new Carta(qtdPontos, Naipe.Diamonds);
            Carta cartaClubs = new Carta(qtdPontos, Naipe.Clubs);
            cartas.add(cartaHearts);
            cartas.add(cartaSpades);
            cartas.add(cartaDiamonds);
            cartas.add(cartaClubs);
        }
    }

    public void embaralhar() { Collections.shuffle(cartas); }

    public Carta virar() { return cartas.remove(0); }
}

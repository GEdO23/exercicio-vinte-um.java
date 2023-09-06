package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        this.pontos += carta.getNumero();
    }

    public void parar() { parou = true; }

    public int getPontos() { return pontos; }

    public List<Carta> getCartas() { return cartas; }

    public boolean parou() { return parou; }
    
}
package com.example;

public class Jogo {
    Monte monte = new Monte();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {
        return (jogador.parou() ? null : monte.virar());
    }

    public boolean acabou() {
        return (jogador.parou() || computador.parou()) || (jogador.getPontos() >= 21 || computador.getPontos() >= 21);
    }

    public String resultado() {
        if(jogador.getPontos() >= 21) { return "Você ganhou";} else 
        if(computador.getPontos() >= 21) { return "Você perdeu"; }
        return "Empate";
    }

    public Jogador getJogador() {
        return jogador;
    }
    
    public Computador getComputador() {
        return computador;
    }


}

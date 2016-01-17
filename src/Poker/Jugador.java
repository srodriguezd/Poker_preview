/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author sara
 */
public class Jugador {
    private String jugador;
    private Mano carta;
    private int puntuación;

    public Jugador(String jugador, Mano carta, int puntuación) {
        this.jugador = jugador;
        this.carta = carta;
        this.puntuación = puntuación;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public Mano getCarta() {
        return carta;
    }

    public void setCarta(Mano carta) {
        this.carta = carta;
    }

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }
    
        
    
    
}

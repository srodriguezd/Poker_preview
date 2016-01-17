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
public class main {
    public static void main(String[] args) {
        //imprime de baraja:barajar
//        Baraja damelalista = new Baraja();
//        Mano damelamano = new Mano();
//        damelalista.Barajar();
//        
//        damelamano = damelalista.Repartir(damelamano);
//        
//        System.out.println(damelalista);
//        System.out.println(damelamano);
//        
//        damelamano.Descartar();
//       
//        damelamano = damelalista.Repartir(damelamano);
//       
//        System.out.println(damelalista);
//        System.out.println(damelamano);
        
        Poker poker = new Poker(new Baraja(), new Jugador("Pedro", new Mano(), 0));
        poker.jugar();
        
        
        
        
    }
     
}

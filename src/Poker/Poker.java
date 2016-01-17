/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author sara
 */
public class Poker {
    private Baraja Baraja;
    private Jugador Jugador;

    public Poker(Baraja Baraja, Jugador Jugador) {
        this.Baraja = Baraja;
        this.Jugador = Jugador;
    }

    public Baraja getBaraja() {
        return Baraja;
    }

    public void setBaraja(Baraja Baraja) {
        this.Baraja = Baraja;
    }

    public Jugador getJugador() {
        return Jugador;
    }

    public void setJugador(Jugador Jugador) {
        this.Jugador = Jugador;
    }
    
    
    public void jugar(){
        this.Baraja.Barajar();
        
        this.Jugador.setCarta(this.Baraja.Repartir(new Mano()));
        
        System.out.println(this.Jugador.getCarta());
        
        this.Jugador.getCarta().Descartar();
        
        this.Jugador.setCarta(this.Baraja.Repartir(this.Jugador.getCarta()));
          
        System.out.println(this.Jugador.getCarta());
        
        this.calcularJugada();
        
        System.out.println(this.Jugador.getCarta());
        
        
        
        //
        System.out.println(this.calcularJugada());
      
    }
    
    
    public String calcularJugada(){

        Collections.sort(this.Jugador.getCarta().getMano(), new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return new Integer(((Carta)o1).getNumero()).compareTo(new Integer(((Carta)o2).getNumero()));
            }
        });
        
        String resultado;
        boolean escalera = false;
        boolean color = false;
        int cartasIguales = 1;
        int parejas = 0;
        Mano mano = this.Jugador.getCarta();
        
        if (mano.getMano().get(0).getNumero() + 1 == mano.getMano().get(1).getNumero() && mano.getMano().get(1).getNumero() + 1 == mano.getMano().get(2).getNumero() && mano.getMano().get(2).getNumero() + 1 == mano.getMano().get(3).getNumero() && mano.getMano().get(3).getNumero() + 1 == mano.getMano().get(4).getNumero()){
            escalera = true;
        }
        
        if (mano.getMano().get(0).getPalo() == mano.getMano().get(1).getPalo() && mano.getMano().get(1).getPalo() == mano.getMano().get(2).getPalo() && mano.getMano().get(2).getPalo() == mano.getMano().get(3).getPalo() && mano.getMano().get(3).getPalo() == mano.getMano().get(4).getPalo()){
            color = true;
        }
        
        int indice1 = 0;
        int indice2 = 1;
        int auxCartas = 1;
        
        while (indice2 < 5){
            if (mano.getMano().get(indice1).getNumero() == mano.getMano().get(indice2).getNumero()){
                auxCartas++;
                indice2++;
            }
            else {
                
                if (auxCartas > 1){
                    parejas++;
                }
                if (auxCartas > cartasIguales){
                    cartasIguales = auxCartas;
                    auxCartas = 1;
                }
                
                indice1 = indice2;
                indice2++;
                
            }
        }
        
        if (escalera && color){
            resultado = "Escalera de color";
        }
        else if(parejas == 1 && cartasIguales == 4) {
            resultado = "Poker";
        }
        else if(parejas ==2 && cartasIguales ==3 ){
            resultado = "Full";
        }
        else if(color){
            resultado = "Color";
        }
        else if(escalera){
            resultado = "Escalera";
        }
        else if(parejas == 1 && cartasIguales== 3){
            resultado = "Trío";
        }
        else if(parejas == 2 && cartasIguales == 2){
            resultado = "Doble Pareja";
        }
        else if(parejas==1 && cartasIguales ==2){
            resultado = "Pareja";
        }
        else{
            resultado = "Carta Alta";
        }
        
        return resultado;
    }
        
        
        
        
}
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


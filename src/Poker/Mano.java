/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;
import java.util.*;
import java.util.Collections;

/**
 *
 * @author sara
 */
public class Mano {
    private ArrayList<Carta> mano;

    public Mano() {
       this.mano = new ArrayList<Carta>();
        
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Mano{" + "mano=" + mano + '}';
    }
    
     
    public void cogerCarta(Carta carta){
        
        this.mano.add(carta);
        
    } 
    
    public int returnlength(){
    
           return this.mano.size();
    
    }
    
    public void Descartar(){
        double aleatorio = Math.floor(Math.random()*6);
        
        for (double y = 0; y< aleatorio; y++){
            this.mano.remove(0);
            
        }
         
//         this.mano.remove(Math.random()*5); //hay que quitar una aleatoriamente. 
//                                            Esto esta mal, porque tmb hay que quitar aleatoriamente x cartas antes de esto
        
    }
    
    public Carta getCarta(int unaCarta){
        
        return this.mano.get(unaCarta);
    }
  
    
    
}

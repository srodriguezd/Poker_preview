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
public class Baraja {
      
    private ArrayList<Carta> carta;
    
    public Baraja() {
        this.carta = new ArrayList<Carta>();
        for (int p=1; p <= 4; p++ ){ //p de palo
            for (int n=1; n <= 13; n++){ //n de numero
                this.carta.add(new Carta(p,n));
                
            } 
        } 
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + '}';
    }
   
    public void Barajar(){
        Collections.shuffle(this.carta);
    }
    
//    public void Repartir(Mano mano){
//        for (int c=0; c<=5; c++){
//            carta.add(this.carta.get(0)); 
//            
//            carta = new ArrayList<Carta>();
//            carta = mano.getMano();
//            
//            this.carta.remove(0);
//            
//            
//        }
//    }
    
    public Mano Repartir(Mano mano){
        //Mano mano = new Mano();
        
       // if(mano.){ //hay que hacer que solo te llene la mano hasta que tengas 5 cartas
            while (mano.returnlength() <5){


                mano.cogerCarta(this.carta.get(0));

                this.carta.remove(0);

            }
       
        
        return mano;
    }
    
    
}
    
    
    
 

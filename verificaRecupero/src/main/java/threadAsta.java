/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadAsta extends Thread{
    datiCondivisi dc;
    private String asta = ".,-,-,-,-,-,-,.,.,.,4AM,2AM,2AM,3EE,3EE,.,4AM,2AM,.,2AM,4AM,4AM,.,.,.,3EE,3EE,2AM,4AM,.,.,4AM,3EE,3EE,.,2AM,18";
    
    public threadAsta(datiCondivisi dc){
        this.dc=dc;
        this.asta=asta;
    }
    
     public void run(){
        String[] vett = asta.split(",");
        dc.waitSem(4);
        dc.composizioneGiorni(vett,"asta");
        dc.signalSem(5);
    }
}

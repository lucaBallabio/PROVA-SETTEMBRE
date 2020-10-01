/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadAli extends Thread{
     private String ali = ".,3AL,4BS,.,4AL,5AS,.,5AL,5BL,.,4BL,3AS,.,-,-,-,-,-,-,4BS,3BS,3AL,4BL,.,.,.,.,4AL,3BS,4AS,.,3AS,5BL,5AL,5AS,4AS,20";
     datiCondivisi dc;
     
     public threadAli(datiCondivisi dc){
         this.ali=ali;
         this.dc=dc;
     }
     
      public void run(){
        String[] vett = ali.split(",");
        dc.waitSem(1);
        dc.composizioneGiorni(vett,"ali");
        dc.signalSem(2);
    }
}

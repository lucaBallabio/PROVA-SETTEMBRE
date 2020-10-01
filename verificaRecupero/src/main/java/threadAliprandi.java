/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadAliprandi extends Thread{
    private String aliprandi = ".,4AM LI5,4AM LI5,4BE,.,3EE,.,.,.,5AM LSM,5AM LSM,3EE LSM,3EE LSM,-,-,-,-,-,-,.,.,.,4BE LSM,4BE LSM,4AM,4AM,5AM LSM,.,4BE,5BM LSM,.,.,.,5BM LSM,5BM LSM,3EE,18";
    datiCondivisi dc;
    
    public threadAliprandi(datiCondivisi dc){
        this.aliprandi=aliprandi;
        this.dc=dc;
    }
    
     public void run(){
        String[] vett = aliprandi.split(",");
        dc.waitSem(2);
        dc.composizioneGiorni(vett,"aliprandi");
        dc.signalSem(3);
    }
}

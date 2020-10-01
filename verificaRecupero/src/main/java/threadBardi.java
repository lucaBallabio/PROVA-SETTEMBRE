/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadBardi extends Thread{
    datiCondivisi dc;
    private String bardi = ".,5D,2B,1D,.,5AI,.,.,.,2B,5AI,2C,5D,.,.,1D,5D,2C,.,,,,,,,.,5AI,1D,2C,2B,.,-,-,-,-,-,15";
    
    threadBardi(datiCondivisi dc){
        this.dc=dc;
        this.bardi = bardi;
    }
    
     public void run(){
        String[] vett = bardi.split(",");
        dc.waitSem(6);
        dc.composizioneGiorni(vett,"bardi");
    }
}

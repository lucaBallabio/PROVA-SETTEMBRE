/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadAndreacchi extends Thread{
    datiCondivisi dc;
     private String andreacchi = ".,5AI LI6,1CI LI4,4BI LI7,5BI LI7,.,.,3BI LI7,3BI LI7,5BI LI7,4CI LI7,4CI LI7,.,5AI LI6,5AI LI6,.,4BI LI7,4BI LI7,.,.,5BI LI7,5BI LI7,.,.,.,.,.,1CI LI4,3BI LI7,4CI LI7,.,-,-,-,-,-,18";
    
    public threadAndreacchi(datiCondivisi dc){
        this.dc=dc;
        this.andreacchi = andreacchi;
    }
    
     public void run(){
        String[] vett = andreacchi.split(",");
        dc.waitSem(3);
        dc.composizioneGiorni(vett,"andreacchi");
        dc.signalSem(4);
    }
}

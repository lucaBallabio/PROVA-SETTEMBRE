/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadBallabio extends Thread{
    datiCondivisi dc;
    private String ballabio = ".,.,.,1BM LI4,5AI LI6,1CM LI4,.,-,-,-,-,-,-,1AM LI4,.,1CM LI4,.,.,.,5AI LI6,5AI LI6,1BM LI4,.,1AM LI4,.,1AC LI2,1AC LI2,1BC LI2,1BC LI2,.,.,5AI LI6,5AI LI6,4AI LI6,4AI LI6,3AI LI6,18";
    
    public threadBallabio(datiCondivisi dc){
        this.dc=dc;
        this.ballabio=ballabio;
    }
    
     public void run(){
        String[] vett = ballabio.split(",");
        dc.waitSem(5);
        dc.composizioneGiorni(vett,"ballabio");
        dc.signalSem(6);
    }
}

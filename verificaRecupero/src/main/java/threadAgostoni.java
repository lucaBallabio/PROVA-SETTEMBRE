/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class threadAgostoni extends Thread{
    private String agostoni = ".,2BI,2CI LFS,1AI LFS,.,.,.,2CI,1AI,1BI LFS,2AI,.,.,-,-,-,-,-,-,1BI,2BI LFS,1CI LFS,.,2AI,.,1CI,2CI,1AI,.,2AI LFS,.,1CI,1BI,2BI,.,.,18";
    datiCondivisi dc;
    
    public threadAgostoni(datiCondivisi dc){
        this.agostoni = agostoni;
        this.dc=dc;
    }
    
    public void run(){
        String[] vett = agostoni.split(",");
        dc.composizioneGiorni(vett, "agostoni");
        dc.signalSem(1);
    }
}

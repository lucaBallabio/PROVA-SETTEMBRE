
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ballabio_luca
 */
public class main {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("inserire la classe");
        String c = "";
        c = s.nextLine();
        datiCondivisi dc = new datiCondivisi();
        dc.setClasse(c);
        
        threadAgostoni thAgostoni = new threadAgostoni(dc);
        threadAsta thAsta = new threadAsta(dc);
        threadBallabio thBallabio = new threadBallabio(dc);
        threadBardi thBardi = new threadBardi(dc);
        threadAndreacchi thAndreacchi = new threadAndreacchi(dc);
        threadAli thAli = new threadAli(dc);
        threadAliprandi thAliprandi = new threadAliprandi(dc);
        
        thAgostoni.start();
        thAsta.start();
        thBallabio.start();
        thBardi.start();
        thAndreacchi.start();
        thAli.start();
        thAliprandi.start();
        
        thAgostoni.join();
        thAsta.join();
        thBallabio.join();
        thBardi.join();
        thAndreacchi.join();
        thAli.join();
        thAliprandi.join();
        
        System.out.println(dc.visulizzaOrario());
    }
}

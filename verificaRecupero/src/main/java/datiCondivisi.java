/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ballabio_luca
 */
public class datiCondivisi {
    private String orario="";
    private String[] l,ma,me,g,v,s;
    private Semaphore sem1, sem2,sem3,sem4,sem5,sem6;
    private String classe;

    public datiCondivisi() {
        this.orario=orario;
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
        this.sem3 = new Semaphore(0);
        this.sem4 = new Semaphore(0);
        this.sem5 = new Semaphore(0);
        this.sem6 = new Semaphore(0);
    }
    
    public void composizioneGiorni(String[] vett, String nome){
        for(int i=0;i<35;i++){
            while(i<6){
                if(vett[i] != "-" && vett[i] != ".")
                    if(vett[i] == classe)
                    l[i]=nome;
            }
            while(i>6 && i< 12){
                if(vett[i] != "-" && vett[i] != ".")
                    if(vett[i] == classe)
                    ma[i]=nome;
            }
            while(i>12 && i< 18){
                if(vett[i] != "-" && vett[i] != ".")
                   if(vett[i] == classe)
                    me[i]=nome;
            }
            while(i>18 && i< 24){
                if(vett[i] != "-" && vett[i] != ".")
                    if(vett[i] == classe)
                    g[i]=nome;
            }
            while(i>24 && i< 30){
                if(vett[i] != "-" && vett[i] != ".")
                   if(vett[i] == classe)
                    v[i]=nome;
            }
            while(i>30 && i< 35){
                if(vett[i] != "-" && vett[i] != ".")
                    if(vett[i] == classe)
                    s[i]=nome;
            }
        }
    }
    
    public String visulizzaOrario(){
        orario += "lunedì ";
        for(int i=0;i< 6 ; i++){
            if(l[i] != null)
                orario += l[i];
            else
                orario += "-";
        }
        
        orario += "martedì ";
        for(int i=0;i< 6 ; i++){
            if(ma[i] != null)
                orario += ma[i];
            else
                orario += "-";
        }
        
        orario += "mercoledì ";
        for(int i=0;i< 6 ; i++){
            if(me[i] != null)
                orario += me[i];
            else
                orario += "-";
        }
        
        orario += "giovedì ";
        for(int i=0;i< 6 ; i++){
            if(g[i] != null)
                orario += g[i];
            else
                orario += "-";
        }
        
        orario += "venerdì ";
        for(int i=0;i< 6 ; i++){
            if(v[i] != null)
                orario += v[i];
            else
                orario += "-";
        }
        
        orario += "sabato ";
        for(int i=0;i< 5 ; i++){
            if(s[i] != null)
                orario += s[i];
            else
                orario += "-";
        }
        return orario;
    }
    
    public void waitSem(int n){
        if(n==1)
            sem1.Wait();
        else if(n==2)
            sem2.Wait();
        else if(n==3)
            sem3.Wait();
        else if(n==4)
            sem4.Wait();
        else if(n==5)
            sem5.Wait();
        else if(n==6)
            sem6.Wait();
    }
    
    public void signalSem(int n){
        if(n==1)
            sem1.Signal();
        else if(n==2)
            sem2.Signal();
        else if(n==3)
            sem3.Signal();
        else if(n==4)
            sem4.Signal();
        else if(n==5)
            sem5.Signal();
        else if(n==6)
            sem6.Signal();
    }
    
    public void setClasse(String s){
        this.classe=s;
    }
}

import java.util.Date;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Servitoros extends ergazomenos {
    
    public Servitoros(String email , String name, String password ,String startDate) {
        super(email,name,password,startDate);
    }
    boolean bool;
    String answer;
     int posoTrapeziou;
     
    public void PliromhTrapeziou(){
      System.out.println("EIsigage pio trapezi apetei pliromh");
   
      Scanner myOb2 = new Scanner(System.in);
        int idtrapeziou = myOb2.nextInt();
        Trapezia sk = new Trapezia();
        sk.changeTrapezia(idtrapeziou);
         posoTrapeziou = ThreadLocalRandom.current().nextInt(50,200+1);
         System.out.println(" To trapezi " + idtrapeziou + " ofeilei " + posoTrapeziou + " euros ");
         
        
    }
    
    public boolean getPaid() {
          
          System.out.println(" Thelete na plirwsete me karta?  Y/N" );
          
          Scanner myOb2 = new Scanner(System.in);
          String answer = myOb2.nextLine();
          
          if (answer.equals("Y")) {
              
              System.out.println("Epileksate na plirwsete me karta");
              bool = true;
                                         
          
        }
        
          else if (answer.equals("N")) {
              
              System.out.println("Epileksate na plirwsete me metrita");
              
            }
            
          
            return bool;
}
     public void afford() {
         StoixeiaKartas s1 = new StoixeiaKartas();
        if (bool==true) {
            int j = s1.getYpol();
            
            if (j >= posoTrapeziou) {
                System.out.println("H sunallagh oloklhrwthike ");
                System.out.println("To neo sas upoloipo anerxetai se " + (j-posoTrapeziou) + "euro");;
            }
            else {
                System.out.println("Aneparkes upoloipo");
            }
        }
    
    
    
}}
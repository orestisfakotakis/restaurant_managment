import java.util.Date;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
 
public class onlineParaggelia
{
    
    protected int k;
    protected int r;
    List<Integer> par = new ArrayList<>();
    protected int cost;
    protected int ID;
    protected String  answer="";
    protected boolean bool = false;
   
    public void order(manager m) {
       
       System.out.println("Posa piata thelete na parageilete ");
       Scanner myOb = new Scanner(System.in);
            k = myOb.nextInt();
       
            
       
       for (int i = 0 ; i < k; i++) {
           System.out.println("Dwse ID tou piatou ");
           Scanner myOb1 = new Scanner(System.in);
           ID = myOb1.nextInt();
           par.add(ID);
            System.out.print("Epileksate : " );
            System.out.println(m.list[par.get(i)-1]);
            cost = cost + m.price[par.get(i)-1];
            
            
        }
        
         System.out.println("To sunoliko kostos ths paraggelias anerxetai se : " + cost + " euro");
    
        }
    
       
        
      public boolean getPaid() {
          
          System.out.println(" Thelete na plirwsete me karta?  Y/N" );
          
          Scanner myOb2 = new Scanner(System.in);
          answer = myOb2.nextLine();
          
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
            
            if (j >= cost) {
                System.out.println("H sunallagh oloklhrwthike ");
                System.out.println("To neo sas upoloipo anerxetai se " + (j-cost) + "euro");;
            }
            else {
                System.out.println("Aneparkes upoloipo");
            }
        }
    } 
}


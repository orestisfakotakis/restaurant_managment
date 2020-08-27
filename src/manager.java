import java.util.Date;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class manager extends ergazomenos
{
    public String[] list = new String[5];
    public int[] price = new int[5];
    
    
    public manager(String email,String name, String password,String startDate)
    {
        super( email, name,  password,startDate);
    }

    
    
    

    public void setMenu()
    {
        System.out.println("SYMPLIRWSE TH LISTA ME PIATA");
        for( int i=0; i<list.length; i++){
   
            Scanner myOb = new Scanner(System.in);
            list[i] = myOb.nextLine();
            System.out.println("DWSE TIMH GIA TO SUGKEKRIMENO PIATO");
            
            Scanner myOb1 = new Scanner(System.in);
            price[i] = myOb1.nextInt();
            
            if (i<list.length) {
            System.out.println("KATAXWRHSH EPOMENO PIATOU ");
        }
        
        }
    }
    public void getMenu()
    {
    System.out.println("To teliko Menu mazi me tis times einai: ");
            for (int i=0; i<list.length; i++)
            
                System.out.println(list[i] + "---" + price[i]);
            }
    
            Trapezia t = new Trapezia();
            
            
   public void setKrathsh()
   {
       t.setTrapezia();
       System.out.println("Gia Poio trapezi thelete na kanete kratisi? ");
       Scanner myOb10 = new Scanner(System.in);
       int trap = myOb10.nextInt();
       System.out.println("Gia poia hmeromhnia thelete na kanete thn krathsh?");
       Scanner myOb11 = new Scanner(System.in);
       String date = myOb11.nextLine();
       t.trapezia[trap] = date;
       System.out.println("Kanate kratisi gia to trapezi " + trap + " gia thn hmeromhnia " + date);  
       
    }
    
    public void getKrathsh() {
        for (int i = 0; i < 29;  i++) {
        System.out.println(i + t.trapezia[i]);
    }

}
}


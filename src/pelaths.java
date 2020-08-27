import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class pelaths extends xrhsths 
{
   

    
    List<Integer> par = new ArrayList<>();
   onlineParaggelia onl = new onlineParaggelia();
    
    
    protected int customer_ID;
    protected String adress;
    public pelaths(String email, String name , String password,String startDate)
     {
         
         super(email,name,password,startDate);
        }
    xrhsths x = new xrhsths("asdj@gmail.com","admin","admin1234","asdsf");
    piata p = new piata();
    int count=0;
   
   public void verifyLogin(String nm,String pass){
     
     x.isLoggedIn(nm, pass);
   }
   
   
      
    public void axiologisi(){
       System.out.println("Dwse ba8mologia gia thn paragelia ");
               
       
       Scanner myOb1 = new Scanner(System.in);
       int rating = myOb1.nextInt();
       boolean valid = true;
       while(valid) {
       if ((rating>0) && (rating <6) ) {
           System.out.println ("H vathmologia sas einai: " + rating );
           System.out.println ("Eisagete keimeno aksiologisis");
           String keimeno;
           Scanner myOb3 = new Scanner(System.in);
           keimeno = myOb3.nextLine();
           valid = false;
        }
           else {
           System.out.println("Mh apodekth aksiologisi");
           System.out.println("Dwste nea vathmologia ");
           Scanner myOb2 = new Scanner(System.in);
           rating = myOb2.nextInt();
           
                   
            }      
          }   
      
        }
}
        
   
    
    
     
    
    
    
    
    

    
    
        
    
    
    
    


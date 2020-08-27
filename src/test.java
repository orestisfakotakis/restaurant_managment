import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class test
{
    public static void main(String args[])
    {
        //LOGIN
        
        System.out.println("username:");
        Scanner myOb = new Scanner(System.in);
        String user= myOb.nextLine();
        System.out.println("password:");
        Scanner myOb1 = new Scanner(System.in);
        String pass = myOb1.nextLine();
        
        pelaths pe=new pelaths("xzx",user,pass,"xzxzxzx");
        pe.verifyLogin("admin","admin1234");
        
        Chef kak =new Chef("xzx","xzxzxz","xzxzxzxzx","xzxzxzx");
        manager m1=new manager("xzx","xzxzxz","xzxzxzxzx","xzxzxzx");
        programma ka = new programma();
        Servitoros ser = new  Servitoros("xzx","xzxzxz","xzxzxzxzx","xzxzxzx");
        System.out.println("Epilexte enan arithmo analoga me thn litourgia pou thelete na ilopihsete");
        System.out.println("-----------------------------------------");
        System.out.println("1.kratisi trapeziou");
        System.out.println("2.Arxikopihsh menou kai online paragelia");
        System.out.println("3.axiologisi paragelias");
        System.out.println("4.symplirosh hmerologiou");
        System.out.println("5.diathesimotita proiontwn");
        System.out.println("6.Diadikasia Plirwmhs Servitorou");
        Scanner myOb2 = new Scanner(System.in);
        int epiloges = myOb2.nextInt();
        
        if(epiloges==1){
         m1.setKrathsh();
         m1.getKrathsh();}
         
         else if (epiloges==2){
        m1.setMenu();
        m1.getMenu();
        onlineParaggelia onl1 = new onlineParaggelia();
        onl1.order(m1);
        onl1.getPaid();
        onl1.afford();
    }
    else if (epiloges==3){
        pe.axiologisi();
    }
    else if(epiloges==4){
        ka.synthesh();
        ka.showImerologio();
        
    }
    else if(epiloges==5){
       kak.setProionta();
       kak.diathProiontwn();
       
    }
    else if(epiloges==6){
        
       ser.PliromhTrapeziou();
       ser.getPaid();
       ser.afford();
    
    
    }
}}
       
       
  
       
       
       
       
       
     
        
        
           
       
       
      
    

        
        
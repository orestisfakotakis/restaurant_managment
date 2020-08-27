import java.util.Date;
import java.lang.*;
import java.util.Scanner;


public class Chef extends ergazomenos
{
    public int posotita;
    public String[] list1 = new String[3];
    public int[] list2 = new int[3];
    proionta pr = new proionta();
    public Chef(String email , String name, String password ,String startDate)
    {
        
       super(email,name,password,startDate);
    }

    public void showInfo(){
        System.out.println("o ergazomenos CHEF " + name + " me ID :" + ID + " ergazetai sto estiatorio " + exp + " xronia ");
}

public void setProionta()
    {
        for( int i=0; i<list1.length; i++){
            System.out.println( " onoma proiontos  ");
            
            Scanner myObj = new Scanner( System.in);
             list1[i] = myObj.nextLine();
             
             System.out.println( " posothta ");
             Scanner myOb = new Scanner(System.in);
             list2[i] = myOb.nextInt();
                                               
        }
    }

public void diathProiontwn(){
    
    
    for(int i=0; i<list2.length; i++){
        if(list2[i]< 5){
          System.out.println(" elipsh sto proion:  " + list1[i] );
          System.out.println("Dwse ton arithmo proiontwn gia paraggeleia:  ");
          
          Scanner myObj3 = new Scanner (System.in);
          int pos = myObj3.nextInt();
          list2[i] = list2[i] + pos ;
                 
    }

        
    
        else  
        System.out.println(" Den xreiazetai paraggelia kapoiou proiontos" );
    }       
}
}


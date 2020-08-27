import java.lang.*;
import java.util.Date;


 class ergazomenos extends xrhsths
{
    
    public int exp;
    
    public int ID;
    String[] strings = {"orestis", "ilias", "nikos", "stelios", "george"};

    
    public ergazomenos(String email,String name, String password,String startDate )
    {
        
        super(email,name,password,startDate);
        
    }
    
    public void showInfo(){
        System.out.println("o ergazomenos " + name + " me ID : " + ID +  " ergazetai sto estiatorio " + exp + " xronia ");
    }
    

    
    
}

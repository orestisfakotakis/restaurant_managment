
import java.util.Date;
import java.lang.*;
public class programma
{
   //private Date DateOfUpdate;
   
   String[][] imerologio = new String[12][30];
  // manager man = new manager( "email", "name",  "password","startDate", 2 , 1);

    int counter=0;
    public void synthesh()
    {
        System.out.println("PROSTHESE ERGAZOMENOYS TON PRWTO MHNA ");
        for(int i=0; i<12; i++){
            for(int j=0; j<30; j++){             
                if (j<5)
                imerologio[i][j]="giannis kostas mitsos";
                else if ((j<10)&&(j>=5))
                imerologio[i][j]="oresths hlias stratis";
                else if ((j<15)&&(j>=10))
                imerologio[i][j]="giwrgos iasonas eleni";
                else if ((j<20)&&(j>=15))
                imerologio[i][j]="stelios panos swtiris";
                else if ((j<25)&&(j>=20))
                imerologio[i][j]="fenia xrysa maria";
                else if ((j<30)&&(j>=25))
                imerologio[i][j]="spuros alkistis mixalis";   
            } 
            
        }
    }
        
        public void showImerologio()
        {
             for( int i=0; i<12; i++){
               for(int  j=0; j<30; j++){
                   System.out.println(imerologio[i][j]);
                                      

                }
           }
              
        }
    }
    
        
        
    

    


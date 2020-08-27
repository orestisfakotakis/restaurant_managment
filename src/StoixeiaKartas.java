import java.util.Date;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StoixeiaKartas {

public int getYpol() {

int upolKartas = ThreadLocalRandom.current().nextInt(50,499+1);

System.out.println("To upoloipo sas anerxetai se " + upolKartas + "euro" );
return upolKartas;
}
}



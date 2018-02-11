
package programa06;
import java.util.Scanner;

public class Programa06 {


  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu hora de entrada? (se te requerira hora, minuto y segundo)");
        int resta;
        int resta2;
        int resta3;
        System.out.println("Hora de entrada:  ");
        int horaen;
        horaen = entrada.nextInt();
        System.out.println("Minuto de entrada:  ");
        int minutoen;
        minutoen= entrada.nextInt();
        System.out.println("Segundo de entrada: ");
        int segundoen;
        segundoen= entrada.nextInt();
        System.out.println("Hora de salida:  ");
        int horasal;
        horasal = entrada.nextInt();
        System.out.println("Minuto de salida:  ");
        int minutosal;
        minutosal = entrada.nextInt();
        System.out.println("Segundo de salida:  ");
        int segundosal;
        segundosal = entrada.nextInt();
        System.out.println("Tu estancia en el cibercafe fue de:  ");
        if (segundoen > segundosal){
            int seg;
            seg = segundosal+60;
            
            resta= seg-segundoen; 
            
            minutosal=minutosal-1;
            }
        else{   
            resta = segundosal-segundoen;
            }
        if (minutoen > minutosal){
            int min;
            min = minutosal+60;
            
            resta2 = min-minutoen;
            
            horasal=horasal-1;
            }
        else{
            resta2= minutosal-minutoen;
           }
        if (horaen > horasal){
            
            resta3 = horasal+24;
           
        }
        else{
            resta3= horasal-horaen;
            
        }
        System.out.println(resta+" "+"Hora(s)"+" "+resta2+" "+"Minuto(s)"+" "+resta3+" "+"segundos");
   
        
        
        
        
        

    }
    
}

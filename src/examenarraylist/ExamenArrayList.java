package examenarraylist;
import java.util.*;
/**
 *
 * Luis Alejandro Gutierrez Pimienta
 */
public class ExamenArrayList {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList <String> nombre = new ArrayList();
        ArrayList <Double> tiempo = new ArrayList();
        ArrayList <Double> velocidad = new ArrayList();
        int n;
        double distancia=100,suma=0;
        System.out.println("Ingrese la cantidad de estudiantes que va a ingresar: ");
        n=leer.nextInt();
        
        for(int x=0; x<n ;x++){
            System.out.println("");
            System.out.println("Ingrese el nombre del estudiante "+ (x+1));
            nombre.add(leer.next());
            
            System.out.println("");
            
            System.out.println("Ingrese la velocidad (m/s) del estudiante "+ (x+1));
            velocidad.add(leer.nextDouble());
            
        }
        
        for(int x=0; x<n ; x++){
            tiempo.add((distancia/velocidad.get(x)));
           
        }
        for(int x=0; x<n ; x++){
            System.out.println("");
            System.out.println("----Datos del estudiante "+ (x+1)+" ----");
            System.out.println("");
            System.out.println("Nombre: "+ nombre.get(x));
            System.out.println("Velocidad: "+ velocidad.get(x));
            System.out.println("Tiempo: "+tiempo.get(x));
            System.out.println("-----------------------------------------");
            
            suma=suma + tiempo.get(x);
           
        }
        System.out.println("");
        System.out.println("El promedio de los tiempos: "+ (suma/tiempo.size()));
                
        
        
        
        
        
        
    }
    
}

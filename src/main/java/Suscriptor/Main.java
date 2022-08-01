
package Suscriptor;

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner consola=new java.util.Scanner(System.in);
        consola.useDelimiter("\n");
        ///Defubcuib de Variables
        int N,estrato;
        long codigo;
        String nombre;
        double consumo,valor_Pagar=0,total_Pagar=0;
        //Proceso
        System.out.println("Cantidad De Suscriptores: ");
        N=consola.nextInt();
        for(int i=0;i<N;i++){
            System.out.println("Codigo Suscriptor: ");
            codigo=consola.nextLong();
            System.out.println("Nombre");
            nombre=consola.next();
            consola.nextLine();
            System.out.println("Estrato (1,2,3,4,5): ");
            estrato=consola.nextInt();
            System.out.println("Consumo: ");
            consumo=consola.nextDouble();
            ///uTILIZAR la clase - Creacion del objeto (Instancia de una Clase)
            ClaseSuscriptor suscriptor = new ClaseSuscriptor(codigo,nombre,estrato,consumo);
            valor_Pagar=suscriptor.valorServicio();
            total_Pagar+=valor_Pagar;
            System.out.println("Nombre Suscriptor: "+suscriptor.getNombre());
            System.out.println("Valor Servicio: "+valor_Pagar);
            
        }
        System.out.println("Total Valor Servicio: "+total_Pagar);
                
    }
    
}

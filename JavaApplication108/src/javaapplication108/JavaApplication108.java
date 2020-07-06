
package javaapplication108;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication108 {

    public static void main(String[] args) {
     
             String[] Verduras = new String[3];
             float[]  Precios = new float[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                  Verduras[i] = JOptionPane.showInputDialog("Ingrese el nombre de la Verdura:");
                  Precios [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su precio: "));
           
             }
             
             int contador = 0;
             for(String verdura: Verduras){
         
             System.out.println(verdura + Precios[contador]);
             contador++;
             
             
             
             
         }
        
        
        
        
    }
    
}

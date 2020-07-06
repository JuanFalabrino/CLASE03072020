package ticketsupermercado;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ticketsupermercado {

   
    public static void main(String[] args) {
        
        String[] productos = new String[5];
        float[]  precios   = new float[5];
        int total = 0;
        ImageIcon Icon = new  ImageIcon("src/imagenes/super.png");
        ImageIcon Icon2 = new  ImageIcon("src/imagenes/instructivo.png");
                  
        JOptionPane.showMessageDialog(null,"Bienvenido a Supermercado los hermanos", "Facturación",JOptionPane.INFORMATION_MESSAGE,Icon);
        JOptionPane.showMessageDialog(null,"A continuación  de este paso  debera ingresar el nombre del producto y luego su precio \n"+ "Por favor no saltee los pasos\n" + "No olvide ningun producto, será controlado a la salida el tickt con los productos", "Pasos a Seguir",JOptionPane.INFORMATION_MESSAGE,Icon2);
         
         
         
         
        for (int i=0; i < 5 ; i++){
            productos[i] = JOptionPane.showInputDialog("Ingrese el nombre del prodcuto");
            
            precios[i] = Integer.parseInt(JOptionPane.showInputDialog ("Por favor ingrese el valor de   " + productos[i]));
            //incorporar validador de importe
        }
        int contador = 0;
        for (String prod:productos){
            
         System.out.println(prod + precios[contador]);
           contador ++;
           total =  total + precios[contador];
           
        }
        
        
        
        
        
        
        
        
    }
    
}

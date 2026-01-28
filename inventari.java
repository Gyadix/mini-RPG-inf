import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        String inventario_fante[] = new String [6];
        
        inventario_fante[0] = "Lancia";
        inventario_fante[1] = "Pozione di cura piccola (5)";
        inventario_fante[2] = "Pozione di cura grade (10)";
        inventario_fante[3] = "Erbe curative (2)";
        inventario_fante[4] = "Equipaggiamento cavallo";
        inventario_fante[5] = "Oro (50)";
        
        System.out.println("Inventario:");
        for(int i=0;i<inventario_fante.length; i++)
        System.out.println(inventario_fante[i]);
    }
}

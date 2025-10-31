/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_denislopez;
import java.util.Scanner;

/**
 *
 * @author djlop
 */
public class Lab3P1_DenisLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Figuras y mas figuras");
        System.out.println("2. Te dije que te llevaras lo que quisieras, no que te llevaras todo");
        System.out.println("3. Sumatoria");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion= leer.nextInt();
        while (opcion!=4){
            
            switch(opcion){
                
                case 1:{
                    System.out.println("Figuras y mas figuras");
                    System.out.println("Ingrese un numero par mayor o igual a 6");
                    int par = leer.nextInt();
                    if (par%2==0 && par>=6){
                        for (int i=1; i<=par; i++){
                            for(int j=1; j<=par; j++){
                                    System.out.print("- ");
                                    if ((i==1 && i==par)&& (j==1 && j))
                            }
                            
                            System.out.println(" ");
                        }//
                        System.out.println();
                    }
                    System.out.println("Tamano invalido intente denuevo:");
                    par = leer.nextInt();
                    
                }//fin opcion 1
                break;
                case 2:{
                    System.out.println("Te dije que te llevaras lo que quisieras, no que te llevaras todo");
                    
                    
                }
                
            }// fin del switch
            
        }// fin del while
        
    }
    
}

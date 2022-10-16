/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula;

import java.util.Scanner;

/**
 *
 * @author en1un
 */
public class Sintomas {
    Scanner in = new Scanner(System.in);
    public void tos(){
        System.out.println("1.Tos seca o no productiva");
        System.out.println("2.Tos productiva");
        System.out.println("3.Tos productiva"); 
        System.out.println("Ingresa que tipo de tos tienes");
        int num = in.nextInt();
        
        switch(num){
            case 1: 
                System.out.print("Para los adultos, las pastillas para la tos o los caramelos duros pueden ayudar a calmar el dolor de garganta y reducir la necesidad de toser. Para la tos seca, la humedad extra de un humidificador puede ayudar a facilitar la respiración.");
                break; 
            case 2: 
                System.out.print("Chupar pastillas para la garganta que hidraten y calmen el tejido irritado.\n Tomar supresores de la tos de venta libre (OTC), como dextrometorfano para suprimir el reflejo de toser.");
                break; 
            case 3: 
                System.out.print("Bebe líquidos. Los líquidos ayudan a diluir la mucosidad en la garganta\n Humedece el aire.\nEvita el humo de tabaco.");
                break; 
            default:
                System.out.println("Has seleccionado una opción inexistente");    
    }   
    }
  
    
    
}

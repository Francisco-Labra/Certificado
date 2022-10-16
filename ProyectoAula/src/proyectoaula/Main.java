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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sintomas objeto = new Sintomas();
        boolean rep = true; 
        
        while(rep == true){
            try{
                Scanner in = new Scanner(System.in); 
        System.out.println("Selecciona el síntoma");
        System.out.println("1.Fiebre");
        System.out.println("2.Tos");
        System.out.println("3.Cansancio");
        System.out.println("4.Perdida del gusto o del olfato");
        System.out.println("5.Dolor de cabeza o garganta");
        System.out.println("6.Erupciones cutaneas");
        System.out.println("7.Ojos irritados");
        System.out.println("8.Dolores musuculares o corporales");
        System.out.println("9.Dificultad para respiraro disnea(sensación de falta de aire)");
        System.out.println("10.Dolor de pecho"); 
        
        System.out.println("Ingresa la opción deseada");
        int opc = in.nextInt();
        
        switch(opc)
        {
            case 1:System.out.println("Tomar algún tipo de analgésico como paracetamol o ibuprofeno en 48 horas, si tras dos días de analgesia, no mejora, acudir al médico."); 
            break;
            case 2:
                objeto.tos();
            break;
            case 3:
                System.out.println("El ejercicio, el yoga, la terapia de masaje, la consejería y el asesoramiento dietético o nutricional se utilizan para ayudar a tratar el cansancio y la debilidad."); 
            break;
            case 4:
                System.out.println("Consultar al médico, evitar el contacto con las demás personas y usar cubrebocas"); 
            break;
            case 5:
                System.out.println("Toma agua, Reduce el consumo de alcohol, duerme lo suficiente, prueba tomar vitamina B o toma algún analgésico."); 
            break;
            case 6:
                System.out.println("Use limpiadores suaves y gentiles en lugar de jabones perfumados, use agua tibia en lugar de agua caliente para lavar su piel y cabello, Seque la erupción en lugar de frotarla, deje que la erupción respire."); 
            break;
            case 7:
                System.out.println("Aplicación de lágrimas artificiales sin necesidad de receta, aplicación de gotas antihistamínicas sin necesidad de receta, especialmente si tiendes a sufrir de alergia estacional, aplicación de compresas frías o paños limpios sobre los ojos cerrados un par de veces al día."); 
            break;
            case 8:
                System.out.println("Cuando se presenta dolor muscular por sobrecarga o lesión, descanse la parte afectada del cuerpo y tome paracetamol o ibuprofeno. Aplique hielo dentro de las primeras 24 a 72 horas posteriores a la lesión para reducir la inflamación y el dolor."); 
            break;
            case 9:
                System.out.println("Sigue los siguiente pasos\n1.Recostarse y poner sus manos sobre el abdomen.\n2.Respirar profundamente por la nariz, expandir el abdomen y dejar que los pulmones se llenen de aire");
                System.out.println("3.Sostener la respiración por un par de segundos\n4.Exhalar lentamente a través de la boca, vaciando los pulmones.\n5.Repetir estos pasos durante 5 a 10 minutos."); 
            break;
            case 10:
                System.out.println("Mastica una aspirina o toma nitroglicerina si tienes una prescripción del médico. Si es muy fuerte y constante llama al 911 o solicita ayuda médica de emergencia."); 
            break;
            
            default:
                System.out.println("Error, ingresa una opción entre el 1 y el 10");
            
        }
        
        System.out.println("Recuerda visitar a tu médico\n\n");
            }catch(Exception e){
                System.out.println("¡Error! Recuerda que este programa no acepta cacracteres \n\n");
            }
        }   
        
    }
    
}

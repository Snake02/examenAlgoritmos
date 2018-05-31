package Examen;

import java.util.Scanner;

public class ImprimirPorBooleana {

    static String letra;
    public static void main(String args[]){
        int j=0;
        System.out.println ("Por favor ingresa un valor V=Verdadero ó F=Falso:");
        Scanner dato = new Scanner (System.in);
        letra=dato.nextLine();


        if(letra.equals("V")){
            for(int i=0;i<10;i++){
                j=0;
                while(j<=i){
                    System.out.print("%");
                    j++;
                }
                System.out.println();
            }
        }
        else{
            if(letra.equals("F")){
                for(int i=9;i>=0;i--){
                    j=0;
                    while (j<=i){
                        System.out.print("%");
                        j++;
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Ingresó una letra no válida");
            }

        }

    }
}

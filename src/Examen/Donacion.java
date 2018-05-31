package Examen;

import java.util.Scanner;

public class Donacion {

static double montoDonado=0;
static double centroSalud=0;
static double comedorNiños=0;
static double bolsaValores=0;


    public static void main(String args[]){

        System.out.println ("Por favor ingresa el monto de la Donación:");
        Scanner dato = new Scanner (System.in);
        montoDonado=dato.nextDouble();

        if(montoDonado<10000){
            centroSalud=(montoDonado*35)/100;
            comedorNiños=(montoDonado*65)/100;
        }
        else{
            centroSalud=(montoDonado*30)/100;
            comedorNiños=(montoDonado*60)/100;
            bolsaValores=(montoDonado*10)/100;
        }

        System.out.println("La donaciòn se repartio de la siguiente manera:");
        System.out.println("Centro de salud recibió: "+centroSalud);
        System.out.println("Comedor de Niños recibió: "+comedorNiños);
        System.out.println("Bolsa de Valores recibió: "+bolsaValores);
    }

}

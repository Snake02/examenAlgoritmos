package Examen;


import java.util.Scanner;

public class PropinaMensual {

     static int cursosAprobados=0;
     static int montoPropina=0;

    public static void main(String args[]){

        System.out.println ("Por favor ingresa la cantidad de cursos aprobados:");
        Scanner dato = new Scanner (System.in);
        cursosAprobados=dato.nextInt();
        if(cursosAprobados>0 && cursosAprobados<4) {
            montoPropina = 20+5*cursosAprobados;
            System.out.println("La propina mensual es :" + montoPropina);
        }
        else System.out.println("El nùmero de cursos no es vàlido");


    }
}

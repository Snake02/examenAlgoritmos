package Examen;

public class NumeroCapicua {

    static int numero=0;
    static int aux=0;
    static int numeroInverso=0;
    static int d1=0,d2=0,d3=0,d4=0;
    static int cantidadCapicuas=0;

    public static void main(String args[]){

        int c=1;
        for(int i=0;i<200;i++){
            numero=(int)(Math.random()*(9999-1000+1)+1000);
            aux=numero;
            d4=aux%10;
            aux=aux/10;
            d3=aux%10;
            aux=aux/10;
            d2=aux%10;
            aux=aux/10;
            d1=aux%10;
            numeroInverso=d1+d2*10+d3*100+d4*1000;

            if(numero==numeroInverso){
                cantidadCapicuas++;
                System.out.println(numero+"--->"+c);
                c++;
            }
            else{
                System.out.println(numero);
            }


        }

        System.out.println("En la lista hay "+cantidadCapicuas+" Num capicúas");
    }
}

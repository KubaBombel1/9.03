package sample;

public class Trójkąt implements Figura

{

          private int a = 4;


                   private int b = 3;


                    private int c = 4;



             private int h = 5;


           private int Wynik_Pole ;


             private int Wynik_Obwód;



          public void Pole()


    {

                 double pole = ( a * h )  / 2;


        System.out.println("Pole " +  Wynik_Pole );



    }

    public void Obwod()


    {

              int Wynik_Obwód = a + b + c;


        System.out.println("Obwod " + Wynik_Obwód);


    }
}

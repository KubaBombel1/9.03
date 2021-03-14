package sample;

public class Prostokąt implements Figura

{
       private int a = 9;



           private int b = 4;



          private int Wynik_Pole ;


                   private int Wynik_Obwód;


    public void Pole()

    {

              double Wynik_Pole  = a * b;


                    System.out.println("Pole "+ Wynik_Pole );


    }

    public void Obwod()

    {

                      double Wynik_Obwód = a + a + b + b;


        System.out.println("Obwod  "+ Wynik_Obwód);
    }
}
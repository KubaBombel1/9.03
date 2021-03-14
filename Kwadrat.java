package sample;

public class Kwadrat implements Figura{

    private double a = 10;


            private int Wynik_Pole;


    private int Wynik_Obwód;

       public void Pole ()

    {


        double Wynik_Pole = a * a;


                System.out.println("Pole "+ Wynik_Pole );


    }

              public void Obwod()

              {

                          double Wynik_Obwód = a + a + a + a;



        System.out.println("Obwod "+ Wynik_Obwód);
    }
}
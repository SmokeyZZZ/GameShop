package com.company;

import java.util.Scanner;

public class Program
{
    Negozio negozio;
    Videogame gta,minecraft,fifa;
    User user;
    Scanner scan;
    public Program()
    {
         negozio = new Negozio();
         gta =  new Videogame("GTA","OPENWORLD",20.0);
         minecraft=  new Videogame("Minecraft","Sandbox",25.00);
         fifa = new Videogame("Fifa21","sport",69.99);
         user = new User("David",1000);
         negozio.addGame(gta,minecraft,fifa);
         scan = new Scanner(System.in);
    }
    public void play()
    {
        System.out.println("Salve cliente, benvenuto nel nostro negozio di videogame ");
        char input = ' ';
        do
        {
            System.out.println("Seleziona un gioco  per inserirlo nel carrello, premere c per il conto,premere s per mostrare il tuo saldo, premere b per comprare o premere e per uscire");
            negozio.ShowCatalogue();
            input =scan.next().charAt(0);
            switch(input)
            {
                case '0':
                    user.GetCart().addGame(gta);
                    break;
                case '1':
                    user.GetCart().addGame(minecraft);
                    break;
                case '2':
                    user.GetCart().addGame(fifa);
                    break;
                case 'c':
                    System.out.println(user.GetCart().GetAmount());
                    break;
                case 'b':
                    negozio.Buy(user);
                    break;
                case 'e':
                    break;
                case 's':
                    System.out.println(user.getCredit());
                    break;
                default:
                    System.out.println("opzione non valida");
            }

        }while(input!='e');



    }
}

package com.company;
import java.util.Scanner;
import java.util.Random;

class game{
    private int user;
    private final int random;
    private int guess=1;

    public game(){
        Random r=new Random();
        random=r.nextInt(50);
    }

    public void takeInput(){
        Scanner se=new Scanner(System.in);
        user=se.nextInt();
    }

    public void isThat(){
        if (user==random)
        {
            System.out.println("congratulations !! you have got it...");
        }

        if (user>random){
                System.out.println("guess a low");
                setGuess();
                takeInput();
                isThat();
        }
        if (user<random){
                    System.out.println("choose a bit higher");
                    setGuess();
                    takeInput();
                    isThat();
                }
    }
    public void no_ofGuess(){

        System.out.printf("you have taken %d number of attempts",guess);
    }
    public void setGuess(){

        ++guess;
    }
}
public class Exercise3 {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t !!!\tWelcome to my new game\t!!!");
        System.out.println("\t\tGuess the number of your choice between--1 to 50");
        game g=new game();
        System.out.print("enter the number:-");
        g.takeInput();
        g.isThat();
        g.no_ofGuess();
    }
}

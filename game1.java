package com.company;

import java.util.Random;
import java.util.Scanner;

class game1 {
        private int user;
        private final int random;
        private int guess = 1;

        public game1() {
            Random r = new Random();
            this.random = r.nextInt(50);
        }

        public void takeInput() {
            Scanner se = new Scanner(System.in);
            this.user = se.nextInt();
        }

        public void isThat() {
            if (this.user == this.random) {
                System.out.println("congratulations !! you have won...");
            }

            if (this.user > this.random) {
                System.out.println("guess a low");
                this.setGuess();
                this.takeInput();
                this.isThat();
            }

            if (this.user < this.random) {
                System.out.println("choose a bit higher");
                this.setGuess();
                this.takeInput();
                this.isThat();
            }

        }

        public void no_ofGuess() {
            System.out.printf("you have taken %d number of attempts",guess);
        }

        public void setGuess() {
            ++guess;
        }
    }



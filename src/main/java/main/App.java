// Name: Tuomo Verho
// Student number: 001743638

package main;

import java.util.Scanner;


public class App {
    public static void main( String[] args ) {

        Car newCar = new Car();

        Scanner sc = new Scanner(System.in);
            System.out.println("  Anna auton merkki: ");
            String brand = sc.nextLine();
            newCar.setBrand(brand);
            System.out.println("\nAnna auton malli: ");
            String model = sc.nextLine();
            newCar.setModel(model);

        boolean exit = false;
        while(!exit) {
            System.out.println("\n1) Näytä auton tila\n2) Muokkaa auton merkkiä ja mallia\n3) Kiihdytä autoa\n4) Hidasta autoa\n0) Lopeta ohjelma");
// If statement is from the given example source code
            if(sc.hasNext()) {
                    int i = 0;
                    String stringinput = sc.nextLine();
                    i = Integer.parseInt(stringinput);
                    switch(i) {
                        case 1:
                            newCar.status();
                            break;
                        case 2: 
                            System.out.println("Anna uusi auton merkki:");
                            brand = sc.nextLine();
                            newCar.setBrand(brand);
                            System.out.println("Anna uusi auton malli:");
                            model = sc.nextLine();
                            newCar.setModel(model);
                            break;
                        case 3:
                            System.out.println("  Kuinka monta km/h haluat kiihdyttää? ");
                            int acceleration = Integer.parseInt(sc.nextLine());
                            if (acceleration < 0) {
                                System.out.println(" Nopeuden täytyy olla positiivinen luku. ");
                                break;
                            }
                            newCar.accelerate(acceleration);
                            break;
                        case 4:
                            System.out.println("  Kuinka monta km/h haluat hidastaa?? ");
                            int deceleration = Integer.parseInt(sc.nextLine());
                            if (deceleration < 0) {
                                System.out.println(" Nopeuden täytyy olla positiivinen luku. ");
                                break;
                            }
                            newCar.decelerate(deceleration);
                            break;
                        case 0:
                            System.out.println("Kiitos ohjelman käytöstä.");
                            exit = true;
                            break;
                        default:
                            System.out.println("Syöte oli väärä");
                            break;


                    }
                }
        }

    }

    

}

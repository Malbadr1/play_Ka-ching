import java.util.Scanner;

class Ka_Ching {


    public static void enterNumber() {
        int condition1 = 1;
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number for play or enter 0 for menu ");


            try {


                int x = input.nextInt();
                if (x >= 1) {
                    for (int i = 1; i <= x; i++) {
                        if (i % 15 == 0) {
                            System.out.println("ka-ching!");
                        } else if (i % 3 == 0 && i != 6) {
                            System.out.println("ka");

                        } else if (i % 5 == 0) {
                            System.out.println("ching!");
                        } else {
                            System.out.println(i);
                        }

                    }
                } else {
                    condition1 = 0;
                    System.out.println("chose from menu ");
                }
            } catch (Exception e) {
                System.err.println("please enter Number not else");
            }
        } while (condition1 == 1);

    }

    public static void play() {
        int condition = 1;


        do {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("please chose NO:1 to play ");
                System.out.println("please chose No:0 to Exit ");


                int choice = input.nextInt();
                if (choice == 1 || choice == 0) {
                    switch (choice) {
                        case 1 -> {

                            enterNumber();
                        }
                        case 0 -> {
                            System.out.println("thanks bye");
                            condition = 0;
                            break;
                        }
                    }

                } else {
                    System.err.println("please chose  NO:1 Or No:0");
                }
            } catch (Exception e) {
                System.err.println("please enter NO:1 Or No:0");

            }
        }
        while (condition == 1);


    }


    public static void main(String[] args) {


        play();
    }
}
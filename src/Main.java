        import java.util.Scanner;

        import static java.lang.Math.*;


        public class Main {
            public static void main(String[] args) {

                System.out.print("Введите трехзначное число: ");
                Scanner scan = new Scanner(System.in);

                int chislo = scan.nextInt();
                int otric = 0;

                if (chislo < 0) {
                    otric += chislo;
                    otric *= -1;

                    if (otric < 100 || otric > 999) return;
                    else {
                        while (otric > 0) {
                            System.out.print(otric % 10);
                            otric /= 10;
                        }
                        System.out.print("-");
                    }
                } else {
                    if (chislo < 100 || chislo > 999) return;
                    else {
                        while (chislo > 0) {
                            System.out.print(chislo % 10);
                            chislo /= 10;
                        }
                    }


                }
            }
        }


        











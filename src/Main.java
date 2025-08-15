        import java.util.Scanner;

        import static java.lang.Math.*;


        public class Main {
            public static void main(String[] args) {
                int Pervoe_Chislo = 10;
                int Vtoroe_Chislo = 142;

                int MaxChisloDelitel = 0;
                int chislo = 0;
                for (int peremenaya = Pervoe_Chislo; peremenaya < Vtoroe_Chislo; peremenaya++){
                    int Deliteley_Seychas = 0;

                    for (int delitel = 1;delitel <= peremenaya;delitel++){
                        if(peremenaya % delitel == 0){
                            Deliteley_Seychas++;
                        }


                    }
                    if (Deliteley_Seychas > MaxChisloDelitel){
                        MaxChisloDelitel = Deliteley_Seychas;
                        chislo = peremenaya;
                    }

                }
                System.out.println(MaxChisloDelitel);
                System.out.println(chislo);
                }
            }



        











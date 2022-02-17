package variables;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {



Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Podaj Wage: ");
            double bodyWeight = scanner.nextDouble();
            System.out.println("Podaj Wzrost: ");
            double bodyHeight = scanner.nextDouble(); 
            System.out.println("Podaj Wiek: ");
            double age = scanner.nextDouble();
            
            int userChoice;
            do { 
            System.out.println("Wybierz opcje: ");
            System.out.println("\t1. Wyświetl Zapotrzebowanie kaloryczne"); 
                        userChoice = scanner.nextInt();

                if (userChoice == 1) {

                double Calories = bodyWeight * 22; 
                System.out.println(" Twoje bazowe zapotrzebowanie kaloryczne to: " + Calories);
                  do {
                      System.out.println(" Wybierz opcje: ");
                      System.out.println("Współczynniki aktywności fizycznej: ");
                      System.out.println("\t1. 1.2     - przy pracy siedzącej i braku aktywności fizycznej");
                      System.out.println("\t2. 1.4     - przy pracy siedzącej i niskiej aktywności fizycznej (1-2 treningi w tygodniu)");
                      System.out.println("\t3. 1.6     - przy pracy siedzącej i średniej aktywności fizycznej (3-4 treningi w tygodniu)");
                      System.out.println("\t4. 1.8     - przy pracy fizycznej i średniej aktywnosci fizycznej (3-4 treningi w tygodniu)");
                      System.out.println("\t5. 2.0     - przy bardzo wysokiej aktywności fizycznej (codzienne treningi, sportowcy)");
                      System.out.println("\t0. Zakończ");
                      System.out.print("\tTwój wybór: ");
                      userChoice = scanner.nextInt();

                    if (userChoice == 1) {
                        double ActiveFactor = Calories * 1.2;
                        System.out.println(" Twoje zerowe zapotrzebowanie to: " + ActiveFactor);
                        double FatBurn1kg = ActiveFactor - (7000 / 7 ); 
                        System.out.println(" By chudnac 1kg na tydzien powinienes jesc: " + FatBurn1kg);
                    } else { 
                        if (userChoice == 2) {
                            double ActiveFactor2 = Calories * 1.4;
                            System.out.println(" Twoje zerowe Zapotrzebowanie to: " + ActiveFactor2);
                            double Fatburn1kg2 = ActiveFactor2 - (7000 / 7);
                            System.out.println(" By chudnac 1kg na tydzien powinienes jesc: " + Fatburn1kg2);
                        } else {
                            if (userChoice == 3 ) {
                                double ActiveFactor3 =  Calories * 1.6;
                                System.out.println(" Twoje zerowe zapotrzebowanie to: " + ActiveFactor3);
                                double FatBurn1kg3 = ActiveFactor3 - (7000 / 7);
                                System.out.println(" By chudnac 1kg na tydzien powinienes jesc: " + FatBurn1kg3);                               
                            } else {
                                if (userChoice == 4) {
                                    double ActiveFactor4 = Calories * 1.8;
                                    System.out.println(" Twoje zerowe zapotrzebowanie to: " + ActiveFactor4);
                                    double FatBurn1kg4 = ActiveFactor4 - (7000 / 7);
                                    System.out.println(" By chudnac 1kg na tydzien powinienes jesc: " + FatBurn1kg4);
                                } else {
                                    if (userChoice == 5) {
                                        double ActiveFactor5 = Calories * 2.0;
                                        System.out.println(" Twoje zerowe zapotrzebowanie to: " + ActiveFactor5);
                                        double FatBurn1kg5 = ActiveFactor5 - (7000 / 7);
                                        System.out.println(" By chudnac 1kg na tydzien powinienes jesc: " + FatBurn1kg5);
                                    }
                                }
                            }
                        }
                    }
                  } while (userChoice !=0); {
                        System.out.println("Zakończyłeś pracę z programem. Dziękujemy");
                  }
                      
                      
                      

            }
            
            System.out.println("\t2. Oblicz BMI");
                if (userChoice == 2) {
                    
            double BmiWeight = bodyWeight * 9.99;
            double BmiHeight = bodyHeight * 6.62;
            double BmiAge = age * 4.92;
                do { 
                      System.out.println(" Wybierz opcje: ");
                      System.out.println("Współczynniki Płci Bmi: ");
                      System.out.println("\t1. -161 Dla Kobiety");
                      System.out.println("\t2. 5 Dla Mezczyzny");
                      System.out.println("\t0. xD ");
                      
                    double BmiWithoutSex = (BmiWeight + BmiHeight ) - BmiAge;
                    
                        if (userChoice == 1) {
                           double BmiWithSexWomen = BmiWithoutSex - 161;
                           System.out.println("Twoje BMI to: " + BmiWithSexWomen);
                        } else {
                            if (userChoice == 2) {
                                double BmiWithSexMen = BmiWithoutSex + 5;
                                System.out.println("Twoje BMI to: " + BmiWithSexMen);
                                
                            }
                        }
                
                    
                } while (userChoice != 0);
                }


   
            System.out.println("\t3. Wyświetl bieżącą datę i godzinę");
            
            System.out.println("\t0. Zakończ");
            
            System.out.println();
            System.out.print("\tTwój wybór: ");
            System.out.println("Wybrałeś " + userChoice + ", wykonuje...");
            } while (userChoice != 0);
            System.out.println("Zakończyłeś pracę z programem. Dziękujemy");



        }
    }
}
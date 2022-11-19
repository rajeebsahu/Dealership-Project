import java .util.Scanner;
public class dealership {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("welcome to the java Delearship");
        System.out.println(" . select option 'a' to buy this car");
        System.out.println(" . Select option 'b' to sell this car\n");
        String option = sc.nextLine();
        switch(option){
            case "a": 
               System.out.println("What is your budget?");
               int budget = sc.nextInt();
               if (budget >10000){
                System.out.println("Great! A Nissan altiman is available");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                sc.nextLine();
                String insurance = sc.nextLine();
                System.out.println("\nDo you have licenec? Write 'yes' or 'no'");
                String licence = sc.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditscore =sc.nextInt();
                if(insurance.equals("yes") && licence.equals("yes") && creditscore > 660){
                    System.out.println("sold! pleasure doning business with you");
                }
               }
               else{
                System.out.println("Sorry! There is no car below 10000");
               }
               break;
               case "b":
                    System.out.println("\nWhat is your car valued at?");
                    int value= sc.nextInt();
                    System.out.println("\nWhat is your selling price");
                    int price = sc.nextInt();

                    if(value > price && price <30000){
                        System.out.println("\nWe will buy your car.Pleasure doing bussiness with you!");

                    }
                    else{
                        System.out.println("\nSorry! We are not interested!");
                    }
            

               
        }   
    }
}
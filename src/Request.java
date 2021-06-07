import java.util.Scanner;

public class Request {

    public boolean requestPlayground(Playground playground){
        Scanner scan= new Scanner(System.in);
        System.out.println("Would You like to accept that playground?(Y/N)");
        System.out.println("Name: " + playground.getName());
        System.out.println("Location: " + playground.getLocation());
        System.out.println("Size: " +  playground.getSize());
        System.out.println("Price: " +  playground.getPrice());
        System.out.println("Total hours available per day: " + playground.getTotalAvailableHoursToBook());
        String choice= scan.nextLine();
        if(choice=="Y"){
            System.out.println("Playground accepted");
            return true;
        }else if(choice=="N"){
            System.out.println("Playground declined");
            return false;
        }else{
            System.out.println("Invalid input");
        }
    }
}

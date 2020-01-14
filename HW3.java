import java.util.*;
public class HW3{
    public static void main(String[] args){        
        //get number of mids
        System.out.println("How many mids? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //make mids list(array of mids)
        Mid[] midlist = new Mid[n];

        //fill mids list
        for (int i=0; i<n; i++){
            midlist[i] = createMid(in);
        }

        //get the number for company you want to list
        System.out.println("What company would you like to print out? ");
        int comp = in.nextInt();

        //print the company's mids
        for(int i = 0; i<n; i++){
            if(midlist[i].company == comp){
                printMid(midlist[i]);
            }
        }


    }
    public static Mid createMid(Scanner in){
        Mid mid1 = new Mid();
        System.out.println("Alpha? ");
        mid1.alpha = in.nextLine();
        System.out.println("First name? ");
        mid1.firstName = in.nextLine();
        System.out.println("Last name? ");
        mid1.lastName = in.nextLine();
        System.out.println("Company? ");
        mid1.company = in.nextInt();
        return mid1;
        
    }
    public static void printMid(Mid mid){
        System.out.println(mid.alpha + " " + mid.lastName + " " + mid.firstName + " " + mid.company);
    }
}
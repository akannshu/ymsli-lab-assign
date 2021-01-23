import java.util.*;

public class InputExcept{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num=0;

        while(true){

            System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
            try {

                num = input.nextInt();

                if(num == -1) break;

                if(num%2==0) System.out.println("You have entered an even number");
                else System.out.println("You have entered an odd number");
                
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("You must enter an integer.");
            }
        }
    }
}
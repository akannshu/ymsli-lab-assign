import java.util.*;

class NumGreaterThan100Exception extends Exception{
    public NumGreaterThan100Exception(String s){
        super(s);
    }
}

class InputException extends Exception{
    public InputException(String s){
        super(s);
    }
}

public class NumGreatExp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num=0,limit=0;

        System.out.println("Set a limit for the numbers: ");
        limit = input.nextInt();
        input.nextLine();

        while(true){

            System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
            try {

                num = input.nextInt();

                if(num == -1) break;

                if(num>100){
                    throw new NumGreaterThan100Exception("Number can’t be greater than 100");
                }

                if(num>limit){
                    throw new InputException("Number can’t be greater than "+limit);
                }

                if(num%2==0) System.out.println("You have entered an even number");
                else System.out.println("You have entered an odd number");
                
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("You must enter an integer.");
            } catch (NumGreaterThan100Exception ex){
                input.nextLine();
                System.out.println(ex);
            } catch (InputException ex){
                System.out.println(ex);  
            }
        }
    }
}
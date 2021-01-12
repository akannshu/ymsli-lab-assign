import java.util.Scanner;

class GradesAverage{
    public static void main(String[] args) {
        System.out.print("Enter the number of Students: ");
        
        Scanner sc = new Scanner(System.in); 
        int numStudent = sc.nextInt();
        sc.nextLine();

        int studentNum=0;
        int[] grades = new int[numStudent];

        while(studentNum<numStudent){

            System.out.print("Enter the grade of Student"+(studentNum+1)+": ");
        
            int grade = sc.nextInt();
            sc.nextLine();

            if(grade>100 || grade<0){
                System.out.println("Invalid grade, try again...");
                continue;
            }
            
            grades[studentNum] = grade;
            ++studentNum;
        }

        int sum=0;

        for(int grade: grades){
            sum+=grade;
        }

        System.out.println("The Average is: "+(double)(sum/numStudent));
    }
}
class TimeTable{
    public static void main(String[] args) {
        
        System.out.println(" * | 1 2 3 4 5 6 7 8 9");
        System.out.println("-----------------------");

        for(int num=1; num<=9; num++){

            System.out.print(num+" | ");

            for(int mul=1; mul<=9; mul++){

                System.out.print(num*mul+" ");
            }
            
            System.out.println();
        }
    }
}
class Fibonacci{

    private int sumOfSeries;
    private int seriesLimit;
    private int[] fibArray;
    
    public void setSeriesLimit(int setLimit){

        if(setLimit>0){
        
            seriesLimit = setLimit;
            fibArray = new int[setLimit];
            
            fibArray[0] = 1;
            fibArray[1] = 1;
            sumOfSeries = 2; 
        }
    }

    public void getFibonacciSeries(){

        for(int i=2; i<seriesLimit; i++){

            fibArray[i] = fibArray[i-1] + fibArray[i-2];
            sumOfSeries+=fibArray[i];
        }
        

        for(int fibNum : fibArray){
            System.out.print(fibNum+" ");
        }
        System.out.println("");
        System.out.println("The Average is: "+((double) (sumOfSeries/(fibArray.length))));
    }

}
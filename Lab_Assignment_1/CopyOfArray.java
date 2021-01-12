class CopyOfArray{

    public static int[] copyOf(int[] arr) {
        
        int[] copyArr;
        int arrLength = arr.length;

        copyArr = new int[arrLength];

        for(int i=0; i<arrLength; i++){

            copyArr[i] = arr[i];
        }

        return copyArr;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,4,56,72};
        int[] copyArr = copyOf(arr);

        for(int val: copyArr){
            System.out.print(val+" ");
        }

        System.out.println("");
    }
}
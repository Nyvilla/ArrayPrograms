public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;
        System.out.println("Original Array: ");

        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
        }

    }
}

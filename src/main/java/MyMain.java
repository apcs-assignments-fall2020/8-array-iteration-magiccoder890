public class MyMain {

   
    public static int[] reverse(int[] arr) {
        int[] new_arr = new int[arr.length];
        int num = 0;
        for (int i = arr.length; i > 0; i--){
            new_arr[num] = arr[i-1];
            num ++;
        }
        for (int i = 0;i < arr.length;i ++){
            System.out.print(new_arr[i]);
        }
        return new_arr;
    }

    public static int secondLargest(int[] arr) {
        int max = -10000;
        for (int i = arr.length; i > 1; i--){
            if (Math.max(arr[i-1],arr[i-2]) > max ) {
                max = Math.max(arr[i-1], arr[i - 2]);
            }
        }
        for (int n = arr.length; n >0; n--){
            if (arr[n-1] == max) {
                arr[n-1] = -10000;
            }
        }
        int max_final = -10000;
        for (int i = arr.length; i > 1; i--){
            if (Math.max(arr[i-1],arr[i-2]) > max_final ) {
                max_final = Math.max(arr[i-1], arr[i - 2]);
            }
        }
        System.out.print(max_final);
        return max_final;
    }

    public static boolean isGeometric(int[] arr) {
        double answer = 0;
        boolean answer_1 = true;
        double check = (double)arr[arr.length-1]/arr[arr.length-2];
        for (int i = arr.length; i > 1; i--) {
            answer = (double)arr[i-1]/arr[i-2];
            if (answer ==  check){
                answer_1 = true;
            }
            else {
                answer_1 = false;
                break;
            }
        }
        return answer_1;
    }
    public static void main(String arg[]){
        System.out.print("All should work");
    }
}

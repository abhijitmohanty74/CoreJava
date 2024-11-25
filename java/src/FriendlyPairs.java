import java.util.Scanner;

public class FriendlyPairs {
    public static int countfrindlyPairs(int n, int[] arr) {
        int friendlyPairs = 0;

        for(int i = 0;i < n; i++){
            if(arr[i] == 0)
                continue;
            for(int j = i +1; j < n; j++){
                if(arr[j] == 0)
                    continue;

                if(arr[i] == arr[j] && isReachable(arr,i,j)){
                    System.out.println("value at i:"+i +"value:"+arr[i]);
                    System.out.println("value at j:"+j +"value:"+arr[j]);

                    friendlyPairs++;
                }
            }
        }
        return friendlyPairs;
    }
    public static boolean isReachable(int[] arr, int i, int j) {
        for(int k = i+1; k < j; k++){
            if(arr[k] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = countfrindlyPairs(n, arr);
        System.out.println(result);

        sc.close();
    }
}

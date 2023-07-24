import java.util.*;
public class CarPooling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int capacity = sc.nextInt();
        System.out.println(findSol(arr, n, capacity));
    }

    static boolean findSol(int[][] arr,int n,int capacity) {
        int passengers = arr[0][0];
        int ini_pass = passengers;
        for(int i=1;i<n;i++) {
            int start = arr[0][1],end = arr[0][2];
            if(arr[i][1] >= end) {
                passengers -= ini_pass;
            }
            if(arr[i][1]>start && arr[i][1] <end) {
                passengers += arr[i][0];
            }
        }
        if(capacity >= passengers) {
                return true;
        } else {
            return false;
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int count = 0;
        int []array = new int[N];
        while (count < N){
            array[count++] = sc.nextInt();
        }
        int start = 0, max = 0, start_max = -1, end_max = -1;
        for(int i = 1; i < N; i++){
            if(array[i]%array[i-1] != 0){
                int current = i - start;
                if(current > max){
                    max = current;
                    start_max = start;
                    end_max = i;
                }
                start = i;
            }
        }
        int current = N - start;
        if(current > max){
            max = current;
            start_max = start;
            end_max = N;
        }
        System.out.print("Max subsequence of evenly divisible numbers:");
        for(int i = start_max; i < end_max; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("\n(Of length " + max + ")");
    }
}

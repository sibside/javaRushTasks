import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PupkinSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        // Init array[]
        int[] arr = new int[N];
        for(int q = 0; q < arr.length; q++)
            arr[q] = Integer.parseInt(reader.readLine());
        int count = 0;
        for(int i = 0; i < arr.length; i++){ // first item take
            for(int j = 0; j < arr.length; j++){ // first if >
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    for(int x = 1; x < arr.length;x++){
                        if(x==arr.length-1){
                            arr[x-1] = arr[x];
                            arr[x] = tmp;
                            break;
                        }
                        arr[x-1] = arr[x];
                    }
                    count++;
                }
            }
        }
        reader.close();
        System.out.println(count);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            if(a < 1){
                a = 1;
                arr.add(a);
            }else{
                arr.add(a);
            }
        }
        
        for(int k = 0; k < 10; k++) {
            System.out.println("X[" +k +"] = " +arr.get(k));
        }
    }
}

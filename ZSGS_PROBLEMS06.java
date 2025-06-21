 import java.util.Arrays;


public class ZSGS_PROBLEMS06{
    public static void main(String[] args){
   System.out.print("Question 51 to 60 problems.");
    }
}


//51 DescendingToAscending
  class DescendingToAscending {
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        int n = arr.length;
        int oddSize = (n + 1) / 2;
        int evenSize = n / 2;
        int[] odd = new int[oddSize];
        int[] even = new int[evenSize];

        int o = 0, e = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) odd[o++] = arr[i];
            else even[e++] = arr[i];
        }

        Arrays.sort(odd);        
        Arrays.sort(even);             

        o = oddSize - 1;    
        e = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? odd[o--] : even[e++];
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }
}





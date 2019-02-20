import java.util.Arrays;

public class RepeatElement {
    public static void main(String a[]){
        int[] arr1 = {4,7,3,9,2,4,7,9,2};
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i+=2){
            int j=i+1;
            if(arr1[i]!=arr1[j]){
                System.out.println("The element that is not repeated twice in the array is: "+arr1[i]);
                break;
            }
        }
    }
}

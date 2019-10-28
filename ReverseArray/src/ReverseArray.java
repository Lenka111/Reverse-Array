import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int [] arr = new int[]{1, 3, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));


    }

    private static int[] reverseArray(int[] nums){
        return new int[]{nums[2], nums[1], nums[0]};
    }
}

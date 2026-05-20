import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> numners = new ArrayList<>();
        System.out.println(Arrays.toString(getTwoSum(new int[]{2, 3, 4, 7}, 11)));;
    }

    public static int[] getTwoSum(int[] nums, int target) {
        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int o = 0; o < nums.length; o++) {
                if(nums[i] + nums[o] == target){
                    if(i != o){
                        t1 = o;
                        t2 =i;
                        break;
                    }
                }
            }
        }
        return new int[] {t1, t2};
    }
}
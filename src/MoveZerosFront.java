import java.util.Arrays;

public class MoveZerosFront {
    public int[] moveZerosLast(int[] nums){

        int left = 0;


        for(int right = 0;right<nums.length;right++){

            if(nums[right] != 0){
                int tmp = nums[left];//1
                nums[left]= nums[right];
                nums[right]= tmp;
                left++;
            }

        }

        return nums;
    }

    public int[] moveZerosFirst(int[] nums){

        int left = nums.length-1;

        for(int right = nums.length-1;right>=0;right--){

            if(nums[right] != 0){
                int tmp = nums[left];//1
                nums[left]= nums[right];
                nums[right]= tmp;
                left--;
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        MoveZerosFront obj = new MoveZerosFront();
        System.out.println(Arrays.toString(obj.moveZerosLast(new int[]{1,0,7,2,5,0,4,0,0,1})));
        System.out.println(Arrays.toString(obj.moveZerosFirst(new int[]{1,0,7,2,5,0,4,0,0,1})));


    }
}

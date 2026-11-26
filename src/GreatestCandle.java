import java.util.Arrays;

public class GreatestCandle {

    public boolean[] solution(int[] nums){
        int max=0;int j=0;
        boolean[] b = new boolean[nums.length];
        for(int m: nums){

            if(m>max)max=m;
            j++;
        }

        for(int i=0;i<nums.length;i++){

            if(nums[i]+3 >= max){
                b[i]=true;
            }

        }




        return b;
    }
    public static void main(String[] args){
        GreatestCandle obj = new GreatestCandle();
        System.out.println(Arrays.toString(obj.solution(new int[]{2,3,5,1,3})));

    }


}

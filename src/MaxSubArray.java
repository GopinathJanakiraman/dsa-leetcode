public class MaxSubArray {

    public int solution(int[] nums){
     int max = 0;
     int best =0;

     for(int i =0;i<nums.length;i++){
         max = Math.max(nums[i], max+nums[i]);
         best = Math.max(best, max);
     }
     return best;
    }

    public static void main(String[] args){
        MaxSubArray obj = new MaxSubArray();
        System.out.println(obj.solution(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

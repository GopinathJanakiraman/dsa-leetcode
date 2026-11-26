import java.util.HashSet;

public class LongestConsecutiveNumbers {

    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int start=0,end=0;
        HashSet<Integer> s = new HashSet<>();
        int max = 0;int currLen = 0;
        for(int a: nums)
            s.add(a);

        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            if(s.contains(num-1))continue; // this iteration stops here

            currLen=0;
            start = num;
            while(s.contains(num)){
                end=num; num++;
                currLen++;

            }
            max = Math.max(max, currLen);
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutiveNumbers obj = new LongestConsecutiveNumbers();
        System.out.println(obj.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}

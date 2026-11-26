public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum =  n*(n+1)/2;
        int totalSum=0;
        for(int i:nums){
            totalSum += i;
        }

        return actualSum-totalSum;
    }

    public static void main(String[] args){
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber(new int[]{3,0,1}));
    }
}

public class ContainerMostWater {

    public int maxArea(int[] height) {
        int left =0;
        int right= height.length-1;
        int maxArea =0;
        while(left<right){
            int w = right-left;// x axis (0,height.length)
           int currentArea = w*Math.min(height[left],height[right]);

           maxArea = Math.max(currentArea,maxArea);

           if(height[left]<height[right]){
                left++;
           }else{
               right--;
           }


        }

return maxArea;
    }
    public static void main(String[] args){
        int g = 7-8;
        System.out.println(g);
        ContainerMostWater obj = new ContainerMostWater();
       System.out.println(obj.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}

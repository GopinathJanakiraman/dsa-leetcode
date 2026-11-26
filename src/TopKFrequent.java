import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        TopKFrequent obj = new TopKFrequent();

        System.out.println(Arrays.toString(obj.topKFrequent(new int[]{98, 98, 98, 99, 99, 100}, 2)));


    }

    private int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int a : nums) {
            if (!m.containsKey(a)) {
                m.put(a, 0);
            }
            m.put(a, m.get(a) + 1);

        }
//1:3times,2:2times,3:1times
        System.out.println(m);


        HashMap<Integer, List<Integer>> reverse = new HashMap<>();
        for (int nm : m.keySet()) {//1,2,3
            int countOfEachNumber = m.get(nm); //3 times
            if (!reverse.containsKey(countOfEachNumber)) {
                reverse.put(countOfEachNumber, new ArrayList<Integer>());
            }
            reverse.get(countOfEachNumber).add(nm);
        }
        System.out.println("reverse"+reverse);

        int[] result = new int[k];
        int index = 0;


        for (int possiblecount = nums.length; possiblecount >= 1; possiblecount--) {

            if (reverse.containsKey(possiblecount)) {

                for (int element : reverse.get(possiblecount)) {
                    if (index < k) {

                        result[index++] = element;

                    } else {
                        break;
                    }
                }
            }

        }

        return result;
    }
}

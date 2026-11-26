import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public long solution(int[] A) {
        int n = A.length+1;
        long correctSum = (long) n*(n+1)/2;
    long actualSum = 0;
            for(int a: A){
                actualSum += a;
            }
    return correctSum-actualSum;
    }

    public char solution(String S) {
        HashMap<Character, Integer> m = new HashMap<>();
        String d = S.toLowerCase();
        for(char c: d.toCharArray()){
            System.out.println(c);
            m.put(c, m.getOrDefault(c,0)+1);

        }
        for(char c: d.toCharArray()){
            if(m.get(c)== 1){
                return c;
            }
        }
        return '#';
    }

    public void findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                System.out.println("Duplicate present");
            }
        }
        System.out.println("Duplicate absent");
    }
    public void groupAnagram(){
        
    }
    public static void main(String[] args) {
        Main obj = new Main();
        HashSet<Integer> s = new HashSet<>();
        String name = "eat";
        char[] chars = name.toCharArray();
        Arrays.sort(chars);
        //1. List -> Stream
        List<String> strList = Arrays.asList("d","d");
        Stream<String> s0 = strList.stream();
        String[] str = {"dd"};
        //2. Array -> Stream
        Stream<String> s1 = Arrays.stream(str);
        //3. Stream of
        Stream<String> s2 = Stream.of("2","3");
        //4
        Stream<Double> d1 = Stream.generate(Math::random).limit(5);

        System.out.println(new String(chars));
        obj.findDuplicate(new int[]{1, 9, 2, 3, 4, 5, 6, 7});
        System.out.println(obj.solution(new int[]{1, 2,3}));
        System.out.println(obj.solution("Swiss"));


    }
}
import java.util.*;

public class LeastOccurrence {

    public static void solution(String str){
        char[] chararr = str.toCharArray();
        Map<Character, Integer> m = new LinkedHashMap<>();

        for(char c: chararr){
            char l = Character.toLowerCase(c);
            m.put(l, m.getOrDefault(l, 0) + 1);


        }
        int min = Collections.min(m.values());

        for(char element: chararr){
            char l = Character.toLowerCase(element);
            if(m.getOrDefault(l,0)== min){
                System.out.println(l);
                break;
            }
        }
        System.out.println(m);
        System.out.println(m);
    }

    public static void main(String[] args){
        solution("Gopig");
    }
}

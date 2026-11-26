import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagram {

    public List<List<String>> solution(String[] str){
        HashMap<String,List<String>> m = new HashMap<>();
       /* m.values();
        m.containsKey();
        m.entrySet();
        m.put();*/

        for(String s : str){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String keyStr = String.valueOf(c);

            if(!m.containsKey(keyStr))
                m.put(keyStr,new ArrayList<>());

            m.get(keyStr).add(s);



        }

        return new ArrayList<>(m.values());
    }

    public static void main(String[] args){
        GroupAnagram obj = new GroupAnagram();
        System.out.println(obj.solution(new String[]{"eat","tea","tan","ate","nat","bat"}));


    }
}

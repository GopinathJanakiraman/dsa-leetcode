import java.util.Arrays;

public class ReverseWordString {
    public String solution(String str){

        String[] strArr = str.split("\\s+");
        System.out.println(Arrays.toString(strArr));

        StringBuilder result= new StringBuilder();

        for(int i=strArr.length-1;i>=0;i--){
            result.append(strArr[i]);
            result.append(" ");
        }
        return result.toString();
    }

    public String betterSolution(String str){

        char[] strArr = str.toCharArray();


        return str;
    }

    public static void main(String[] args){
        ReverseWordString obj = new ReverseWordString();

        System.out.println(obj.solution("the sky is blue"));
    }
}

public class Palindrome {

    public boolean validPalindrome(String str){
        int left =0;
        int right = str.length()-1;

        while(left<right){

            if(Character.isLetter(str.charAt(left)) && Character.isLetter(str.charAt(right))){
                if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }else if(Character.isDigit(str.charAt(left)) && Character.isDigit(str.charAt(right))){
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }else if(!Character.isLetter(str.charAt(left)) && !Character.isDigit(str.charAt(left))){
                left++;
            }else if(!Character.isLetter(str.charAt(right)) && !Character.isDigit(str.charAt(right))){
                right--;
            }else{
                return false;
            }



        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.validPalindrome("A man, a plan, a canal: Panama"));
    }
}

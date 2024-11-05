import java.util.Stack;

public class Solution125 {
    public boolean isPalindrome(String s) {
    /*
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i< s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));
        }

        String newstr = sb.toString();
        System.out.print(sb.toString());

        for(int j =0, k =sb.length()-1;  j<k; j++, k-- )
        {
            if(newstr.charAt(j)!=newstr.charAt(k))
                return false;
        }

        return true;  */
        StringBuffer sb = new StringBuffer();
        for(int i =0; i< s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < sb.toString().length()){
            Character ch = sb.toString().charAt(i);
            stack.push(ch);
            i++;
        }
        int j =0;
        while(!stack.isEmpty()){
            if(sb.toString().charAt(j)!=stack.pop())
                return false;

            j++;
        }
        //System.out.println(sb.toString());
        return true;

    }
}

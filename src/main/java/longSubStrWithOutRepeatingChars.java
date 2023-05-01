import java.util.HashSet;
import java.util.Set;

public class longSubStrWithOutRepeatingChars {

    public static String method(String str){
        Set<Character> set = new HashSet<Character>();
        String stringValue;
        int start = 0;
        int end = 0;
        int max =0;
        String longestTillNow = "";
        String longestOverAll = "";
        while(end<str.length()){
            if(!set.contains(str.charAt(end))){
                set.add(str.charAt(end));
                end++;
                //max = Math.max(set.size(), max);
              // longestTillNow += str.charAt(end);

            }
            else {
          longestTillNow = "";
                set.remove(str.charAt(start));
                start++;


            }
            longestTillNow += str.charAt(end);
            if(longestTillNow.length()>longestOverAll.length()){
                longestOverAll = longestTillNow;
            }

        }

        return longestTillNow;
    }



    public static void main(String[] args) {

        System.out.println(method("aaddadchyuioopluynml"));
    }

}


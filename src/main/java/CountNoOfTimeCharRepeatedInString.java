import java.util.HashMap;
import java.util.Map;

public class CountNoOfTimeCharRepeatedInString {

    public void charcount(String baseStr){

      baseStr = baseStr.toLowerCase();

      char[] charArray = baseStr.toCharArray();

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();


      for(char character: charArray){

      if(map.containsKey(character)){
          map.put(character, map.get(character)+1);
      }
      else{
          map.put(character, 1);
      }

      }
       // System.out.println("The value of s is : "+map.get("s"));
        for(Map.Entry entry: map.entrySet()){

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }




    }


    public static void main(String[] args) {

        String str = "ShrreVishnu";

        CountNoOfTimeCharRepeatedInString count = new CountNoOfTimeCharRepeatedInString();
        count.charcount(str);

    }
}

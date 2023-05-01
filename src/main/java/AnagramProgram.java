import java.util.Arrays;

public class AnagramProgram {

    public boolean anagram(String str1, String str2 ){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean sameOrnot = Arrays.equals(char1,char2);
        return sameOrnot;
    }
    public static void main(String args[]){
        AnagramProgram anagramProgram = new AnagramProgram();
        System.out.println(anagramProgram.anagram("Race", "care"));
        System.out.println(anagramProgram.anagram("Kootio", "otooki" ));
    }
}

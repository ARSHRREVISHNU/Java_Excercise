public class StringReverse {

    public String revStr(String str){
        String rev = "";
        for(int i = str.length(); i>0; i-- ){
            rev = rev+str.charAt(i-1);

        }

        return rev;
    }

    public static void main(String[] args) {

        StringReverse reverse = new StringReverse();
        String reversedString = reverse.revStr("Tree");
        System.out.println(reversedString);
    }
}

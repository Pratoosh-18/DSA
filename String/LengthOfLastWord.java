package String;

public class LengthOfLastWord {
    public static int lolw(String s){
        String[] words = s.split(" ");
        return words[words.length-1].length();
    } 
    public static void main(String[] args) {
        int len = lolw("Your string here");
        System.out.println(len);
    }
}

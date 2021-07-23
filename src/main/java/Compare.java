import java.util.Arrays;
import java.util.Comparator;

class Compare {
    public static void main(String[] args) {
        String[] str = { "hello", "world!", "123", "4444" };
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){return s1.length()-s2.length();}
        });
        for(String s:str){
            System.out.println(s);
        }
    }
}

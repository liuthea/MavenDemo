package Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Stream {

    public static List<Integer> strToInt(List<String> strs, Function<String,Integer> f){
        List<Integer> result = new ArrayList<>();
        for(String s:strs){
            result.add(f.apply(s));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/java/Stream/icon1.png")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/main/java/Stream/icon2.png")));
//        char[] cbuf = new char[1024];
//        int len;
//        while ((len=bufferedReader.read(cbuf))!=-1) {
//            bufferedWriter.write(cbuf,0,len);
//        }
//        bufferedReader.close();
//        bufferedWriter.close();
        FileInputStream fis = new FileInputStream(new File("src/main/java/Stream/icon1.png"));
        FileOutputStream fos=new FileOutputStream(new File("src/main/java/Stream/icon4.png"));
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        Comparator<Integer> comp=Integer::rotateLeft; //Comparator is a functional interface, compare is abstract
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("345");
        List<Integer> integerList = strToInt(list,s -> Integer.parseInt(s));
        List<Integer> integerList2 = strToInt(list, Integer::parseInt);
        byte[] cbuf = new byte[1024];
        int len;
        while ((len=bis.read(cbuf))!=-1) {
            bos.write(cbuf,0,len);
        }
        bos.close();
        bis.close();
        fis.close();
        fos.close();


    }
}

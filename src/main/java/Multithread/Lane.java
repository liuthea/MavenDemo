package Multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

class Question{
    public int length;
    public String name;
    public Question(int length,String name){
        this.length=length;
        this.name=name;
    }
    private String getName(){
        return this.name;
    }

public static void main(String[]args){
    List<Question> list= new ArrayList<>();
    Question a1=new Question(5,"abc");
    Question a2=new Question(3,"cbce");
    Question a3=new Question(5,"cbce");
    list.add(a1);
    list.add(a2);
    list.add(a3);
   Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Question::getName,Collectors.counting()));
    for (String keys : map.keySet())
    {
        System.out.println(keys);
    }
    for (Long value : map.values())
    {
        System.out.println(value);
    }
//    try {
//        System.out.println(doStuff(args));
//    } catch (Exception e) {
//       System.out.println("exc");
//       doStuff(args);
//    }
}
static int doStuff(String[] args){
    return Integer.parseInt(args[0]);
}
}

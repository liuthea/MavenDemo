import java.lang.Comparable;

class Person implements Comparable<Person>{
    String age;
    @Override
    public int compareTo(Person p){
        return age.compareTo(p.age);
    }
}
package cn.com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    //TreeMap里面有keySet()方法
    public static void main(String[] args) {
        Map<Integer,String> m = new TreeMap<>();
        m.put(200,"o");
        m.put(160,"d");
        m.put(180,"z");
        m.put(0,"a");
//        for (Integer a : m.keySet()) {
//            System.out.println(a+"---"+m.get(a));
//        }
//        System.out.println(m.get(180));
        Map<Emp,String> m2 = new TreeMap<>();
        m2.put(new Emp(1000,"小红",500),"小红是个好孩子");
        m2.put(new Emp(500,"小白",250),"小白不是个好人");
        m2.put(new Emp(650,"小玲",350),"小玲是个好姑娘");
        m2.put(new Emp(300,"小军",350),"小军长得帅");
        for (Emp key:m2.keySet()) {
            System.out.println(key+"---"+m2.get(key));
        }
    }
}
class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    @Override
    public String toString() {
        return "id:"+id+",name:"+name+",salary:"+salary;
    }

    @Override
    public int compareTo(Emp o) {
        if (this.salary > o.salary) {
            return 1;
        }else if(this.salary <o.salary){
            return -1;
        }else {

            if (this.id > o .id) {
                return 1;
            }else if(this.id < o.id) {
                return -1;
            }else {
                return 0;
            }
        }
    }

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
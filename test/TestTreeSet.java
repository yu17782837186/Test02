package cn.com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    //测试TreeSet,TreeSet本质上其实是TreeMap实现，因为TreeMap
    //实现了对key的排序，那么TreeSet默认就有实现排序
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
//        for (Integer a : s) {
//            System.out.println(a);
//        }
        //System.out.println(s);
        Set<Empy> s2 = new TreeSet<>();
        s2.add(new Empy(1000,"小明",5000));
        s2.add(new Empy(2000,"小红",3500));
        s2.add(new Empy(1500,"小军",4500));
        s2.add(new Empy(150,"小琪",4500));
        for (Empy e:s2) {
            System.out.println(e);
        }
    }
}
class Empy implements Comparable<Empy> {
    int id;
    String name;
    double salary;

    public Empy(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Empy o2) {
        if (this.salary > o2.salary) {
            return 1;
        }else if(this.salary < o2.salary) {
            return -1;
        }else {
            if (this.id > o2.id) {
                return 1;
            }else if(this.id < o2.id) {
                return -1;
            }else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "id:"+id+",name:"+name+",salary:"+salary;
    }
}

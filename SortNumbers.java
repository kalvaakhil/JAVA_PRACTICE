package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("akhil");
        list.add("laxmi prasad");
        list.add("vinay Kumar");
        list.add("lalita");

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(list,(a,b)->a.compareTo(b));


        list.forEach(s -> System.out.println(s));
    }
}

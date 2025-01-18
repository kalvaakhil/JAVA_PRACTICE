package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5,6);
        long ans=li.stream().distinct().reduce(0,(a,b)->a+b);
        long s=li.stream().distinct().reduce(0,Integer::sum);
        System.out.println(ans+" "+s);
        List<String> names=new ArrayList<>(Arrays.asList("akhil","lalita","praasad","Akhil Reddy"));
        names.stream().sorted((a,b)->b.length()-a.length()).toList().forEach(x-> System.out.println(x));
        boolean asn=li.stream().allMatch(x->x%2==0);
        System.out.println(asn);
        String name = "akhil";
        String output = name.chars()
                .mapToObj(c->String.valueOf((char)c))
                .reduce("", (f, r) -> r+f);
        System.out.println(output);


    }
}

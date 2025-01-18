package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypesOfFunctionalInterface {

    public static void main(String[] args) {
        Predicate<String> startWithA=x->x.startsWith("A");
        Predicate<String> endsWithB=x->x.endsWith("l");
        Predicate<String> withNotwithstanding=startWithA.and(endsWithB);
        boolean ans=withNotwithstanding.test("Akhil");
        System.out.println(ans);
        List<String> names=new ArrayList<>(Arrays.asList("akhil","lalita","praasad","Akhil"));
        List<String> ans1=names.stream().filter(withNotwithstanding).collect(Collectors.toList());
        ans1.forEach(System.out::println);

//        Function-- works for us
        Function<Integer,Integer> f1=x->x*2;
        Function<Integer,Integer> f2=x->x*3;
        System.out.println(f1.andThen(f2).apply(30));

        List<Integer> l= Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toCollection(ArrayList::new));
        l.forEach(System.out::println);
        l.stream().filter(x->x%2==0).map(x->Math.pow(x,2)).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);



    }
}

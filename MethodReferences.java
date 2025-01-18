package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {

    public static void print(String s)
    {
        System.out.println(s);
    }

    public void display(String s)
    {
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("akhil","lalita","praasad"));

        names.forEach(x->print(x));

        names.forEach(MethodReferences::print);

        names.forEach(d->new MethodReferences().display(d));

        names.forEach(new MethodReferences()::display);

        List<Student> students=names.stream().map(x->new Student(x)).collect(Collectors.toList());

        List<Student> std1=names.stream().map(Student::new).collect(Collectors.toList());


        List<String> upperCase=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());

        List<String> upperCase1=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        names.forEach(System.out::println);



    }
}

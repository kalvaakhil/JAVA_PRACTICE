package Java8;

import java.util.Optional;

public class OptDemo {

    public static  Optional <String>getNme(int id)
    {
//        db-getNamebYid
        return Optional.ofNullable(null);
    }
    public static void main(String[] args) {
        Optional<String> ans=getNme(5);
        String s = ans.orElseGet(() -> "Akhil");

    }
}

package Java8;

public class Impl {
    public static void main(String[] args) {
        MyInter i1=new MyInter() {
//            @Override
//            public void show() {
//                System.out.println("Hii");
//            }
            public void add(int a,int b)
            {
                System.out.println("hello");
            }
        };

        MyInter i2=(a,b)->{
            System.out.println("Inside");
        };
        MyInter i3=(a,b)-> System.out.println("Hello");
        i3.add(2,3);
    }
}

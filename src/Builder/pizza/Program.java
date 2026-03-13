package Builder.pizza;

public class Program {

    static void main() {
        Pizza pizza= new Pizza.Builder().setDiametru(10).setHasCarne(true).build();
        System.out.println(pizza);
    }
}

package S1.singleton;

public class Membership extends AbstractMembership{
    public int price;
    public static Membership instanta=null;

    private Membership(int price) {
        this.price = price;
    }

    public static Membership getInstanta(){
        if(instanta==null)
            instanta=new Membership(20);
        return instanta;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Membership{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

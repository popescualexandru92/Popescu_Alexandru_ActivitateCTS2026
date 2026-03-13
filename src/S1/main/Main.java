package S1.main;

import S1.singleton.Membership;

public class Main {
    static void main() {
        Membership m=Membership.getInstanta();
        System.out.println(m.hashCode());
    }
}

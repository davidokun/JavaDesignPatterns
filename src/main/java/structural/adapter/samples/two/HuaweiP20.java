package structural.adapter.samples.two;

public class HuaweiP20 implements AndroidPhone {

    @Override
    public void chargePhone() {
        System.out.println("Charging HuaweiP20");
    }
}

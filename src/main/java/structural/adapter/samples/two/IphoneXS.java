package structural.adapter.samples.two;

public class IphoneXS implements Iphone {

    @Override
    public void chargePhone() {
        System.out.println("Charging from Iphone...");
    }
}

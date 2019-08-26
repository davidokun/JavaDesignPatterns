package structural.adapter.samples.two;

public class Client {

    public static void main(String[] args) {
        AndroidPhone huaweiP20 = new HuaweiP20();
        AndroidCharger androidCharger = new AndroidCharger();
        androidCharger.charge(huaweiP20);

        Iphone iphoneXS = new IphoneXS();
        IphoneCharger iphoneCharger = new IphoneCharger();
        iphoneCharger.charge(iphoneXS);

        AndroidToIphoneAdapter adapter = new AndroidToIphoneAdapter(huaweiP20);
        iphoneCharger.charge(adapter);
    }
}

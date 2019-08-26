package structural.adapter.samples.two;

public class AndroidToIphoneAdapter implements Iphone {

    private AndroidPhone androidPhone;

    AndroidToIphoneAdapter(AndroidPhone androidPhone) {
        this.androidPhone = androidPhone;
    }

    @Override
    public void chargePhone() {
        androidPhone.chargePhone();
    }
}

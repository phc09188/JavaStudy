package Kiosk.Domain;

public class Customer {
    private String phonenumber;     //식별자
    private String name;
    private int Coupon;
    public Customer(String phonenumber, String name){
        this.phonenumber = phonenumber;
        this.name = name;
        this.Coupon = 0;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoupon() {
        return Coupon;
    }

    public void setCoupon(int coupon) {
        Coupon = coupon;
    }
}

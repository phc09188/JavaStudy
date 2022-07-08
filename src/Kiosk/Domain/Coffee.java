package Kiosk.Domain;
public class Coffee {
    private String name;
    private int price;
    private String info;

    public Coffee(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
    public void allInfo(){
        System.out.println(this.name + " : " + this.price);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void PriceInfo(){
        System.out.println("결제 금액은 : "+ this.price + "원 입니다.");
    }
    @Override
    public String toString() {
        return "메뉴='" + name + '\'' +
                ", 가격= " + price +
                ", 원두= " + info;
    }
    public int getPrice() {
        return price;
    }
    public String getInfo(){
        return info;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
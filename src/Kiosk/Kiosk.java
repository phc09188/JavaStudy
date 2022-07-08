package Kiosk;

import Kiosk.Service.CoffeeShop;

import java.io.IOException;


public class Kiosk {
    public static void main(String[] args) throws IOException {

        CoffeeShop coffeeshop = new CoffeeShop();
        coffeeshop.work();
    }
}

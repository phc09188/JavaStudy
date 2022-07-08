package Kiosk.Service;

import Kiosk.Domain.Baristar;
import Kiosk.Domain.Coffee;
import Kiosk.Domain.Customer;
import Kiosk.repository.CoffeeRepository;
import Kiosk.repository.CustomerRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CoffeeShop {
    public String pakage;
    public int menu;
    public String PMethod;
    private CoffeeRepository coffeeRepository = new CoffeeRepository();
    private CustomerRepository customerRepository = new CustomerRepository();
    private PrintCoffeeService printCoffeeService = new PrintCoffeeService();
    private ScanCoffeeService scanCoffeeService = new ScanCoffeeService();
    private Baristar baristar = new Baristar();

    public void work() throws IOException {        //로직        //원두정보 혹은 커피정보
        printCoffeeService.Custommer();
        ChoosePakage();
        ChooseMenu();       //+ Acount
        Paying();
        Making();
    }
    public void coffeeInfoPrint(int key){
        Coffee cf = coffeeRepository.getCoffeeById(key);
        System.out.println(cf);
        String name = cf.getName();
        System.out.println(name);
    }

    public void ChoosePakage()  throws IOException {
        this.pakage = scanCoffeeService.Select_IO();
    }

    public void ChooseMenu() throws IOException {
        List<Coffee> coffees = coffeeRepository.getCoffees();
        printCoffeeService.printSelectMenu(coffees);
        this.menu = scanCoffeeService.SelectMenu();
        Account(this.menu);
        //Scancoffeeservice
    }

    public void Account(int coffeeID) {
        Coffee coffee = coffeeRepository.getCoffeeById(coffeeID);
        printCoffeeService.printPrice(coffee);
    }
    //쿠폰번호입력   없으면 생성
    public void Paying() throws IOException {
        Customer newCustomer = scanCoffeeService.join();
        customerRepository.save(newCustomer);
        this.PMethod = scanCoffeeService.SelectPMethod();
        printCoffeeService.paying();
    }
    public void Making(){
        baristar.makeCoffee(this.menu);
    }


    public void Result(){

    }

}

package Kiosk.repository;

import Kiosk.Domain.Coffee;

import java.sql.ClientInfoStatus;
import java.util.*;

public class CoffeeRepository {
    HashMap<Integer, Coffee> aa = new HashMap();
    public CoffeeRepository(){
        aa.put(1, new Coffee("아메리카노", 4000, "콜롬비아"));
        aa.put(2, new Coffee("카페라떼", 5000, "콜롬비아"));
        aa.put(3, new Coffee("바닐라라떼", 5500, "콜롬비아"));
    }
    public List<Coffee> getCoffees(){
        return new ArrayList<>(aa.values());
    }
//    public void PriceInfo(int a){
//        aa.get(a).PriceInfo();
//    }
    public Coffee getCoffeeById(int key){
        return aa.get(key);
    }
}

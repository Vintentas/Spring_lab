package spring_lab.model;

import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String secondName;
    private ArrayList<String> orders;

    public User (int id, String firstName, String secondName){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void addOrder(String order){
        if (orders.equals(null)){
            orders = new ArrayList<String>();
        }
        orders.add(order);
    }

    public String getAllOrder(){
        if (orders.equals(null)){
            return "No orders";
        }
        return orders.toString();
    }

    public String getAllInformation(){
        String s = (id + " - " + firstName + " " + secondName + " - " + getAllOrder());
        return s;
    }

}

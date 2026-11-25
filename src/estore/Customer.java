package estore;

import java.util.ArrayList;

public class Customer{
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private int phoneNumber;
    private ArrayList<BillingInformation> billingInformations = new ArrayList<>();
    private ShoppingCart cart;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<BillingInformation> getBillingInformations() {
        return billingInformations;
    }

    public void setBillingInformations(ArrayList<BillingInformation> billingInformations) {
        this.billingInformations = billingInformations;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }


}

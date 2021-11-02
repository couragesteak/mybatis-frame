package net920vip.bean;

public class OrdersCustom extends Orders {
    private String username;
    private String adress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "OrdersCustom{" +
                "username='" + username + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

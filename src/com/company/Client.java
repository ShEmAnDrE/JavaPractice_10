package com.company;

public class Client{
    public Chair chair = null;
    public void sit(){
        if (chair == null) {
            System.out.println("Клиенту не на чем сидеть!");
        } else {
            System.out.println("Клиент садится на стул: " + chair);
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}

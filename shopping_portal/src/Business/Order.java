/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class Order {

    private ArrayList<OrderItem> orderItemList;
    private int orderNum;

    private static int count = 0;

    public Order() {
        count++;
        orderNum = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    @Override
    public String toString(){
        return String.valueOf(orderNum);
    }


    public void addOrderItemList(OrderItem orderItems){
        
        this.orderItemList.add(orderItems);
    }
    
    
    
}

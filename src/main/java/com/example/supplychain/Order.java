package com.example.supplychain;

import java.sql.ResultSet;

public class Order {

    public static boolean orderProduct(int productId, String customerEmail) {

        String query = String.format("insert into orders (quantity, customer_id, product_id) values (1, (select cid from customer where email = '%s') ,%s);", customerEmail, productId);

        DatabaseConnection dbCon = new DatabaseConnection();

        System.out.println(dbCon.executeQuery(query));
        return true;
    }

    public static void main(String[] args) {
        Order.orderProduct(4, "a@gmail.com");
    }

}

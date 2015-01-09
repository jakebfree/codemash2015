package com.sample.codemash;

import java.time.LocalDateTime;
import java.util.List;


public class Order {
    private Customer customer;
    private LocalDateTime orderDateTime;
    private List<PurchasedItem> purchase;
}

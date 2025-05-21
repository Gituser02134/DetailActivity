package com.example.detailactivity;

import java.io.Serializable;
import java.util.List;

public class BorrowRequest implements Serializable {

    public String borrowerName;
    public String department;
    public String projectName;
    public String date1;
    public String time;
    public String venue;
    public List<Item> items;

    public static class Item implements Serializable {
        public int qty;
        public String description;
        public String dateOfTransfer;
        public String locationFrom;
        public String locationTo;
    }
}

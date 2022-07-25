package ru.netology;
import java.util.Objects;

public class Smartphone extends Product{
    protected String manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

}

package generics;
import java.util.*;

abstract class WarehouseItem { String name; WarehouseItem(String name){this.name=name;} }
class Electronics extends WarehouseItem { Electronics(String name){super(name);} }
class Groceries extends WarehouseItem { Groceries(String name){super(name);} }
class Furniture extends WarehouseItem { Furniture(String name){super(name);} }

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void addItem(T item){ items.add(item); }
    List<T> getItems(){ return items; }
}

class WarehouseUtil {
    static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.name);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("Laptop"));
        e.addItem(new Electronics("Phone"));

        WarehouseUtil.displayAll(e.getItems());
    }
}


package vsegdada;

import java.util.HashSet;

public class Warehouse {
    HashSet<Barrel> warehouseSet = new HashSet<>();


    public void addBarrel(Barrel barrel) {
        warehouseSet.add(barrel);
    }

    public void deleteBarrel(String label) {
        warehouseSet.removeIf(Barrel -> Barrel.label.equals(label));
    }

    public void deleteAllBarrels() {
        warehouseSet.clear();
    }

    public void info() {
        System.out.println(warehouseSet);
    }
}

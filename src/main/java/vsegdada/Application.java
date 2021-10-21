package vsegdada;


public class Application {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Barrel barrel0 = new Barrel("Красное");
        Barrel barrel1 = new Barrel("Белое");
        Barrel barrel2 = new Barrel("Самогон деда");

        warehouse.addBarrel(barrel0);
        warehouse.addBarrel(barrel1);
        warehouse.addBarrel(barrel2);

        warehouse.info();
        warehouse.deleteAllBarrels();
        warehouse.info();

        warehouse.addBarrel(barrel0);
        warehouse.addBarrel(barrel1);
        warehouse.addBarrel(barrel2);

        warehouse.info();
        warehouse.deleteBarrel("Самогон деда");
        warehouse.info();
    }
}

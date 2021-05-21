public class InventoryService {

    private static volatile int apple = 100;
    private static volatile int orange = 50;

    public boolean checkInv(int apple, int orange) {
        synchronized (InventoryService.class) {
            if ((this.apple - apple >= 0) && (this.orange - orange >= 0)) {
                this.apple -= apple;
                this.orange -= orange;
                return true;
            }
            return false;
        }
    }
}

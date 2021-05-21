import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {

    InventoryService inv = new InventoryService();
    @Test
    void lessThanInventory() {
        assertEquals(true, inv.checkInv(100, 50));
    }
    @Test
    void appleLowInventory() {
        assertEquals(false, inv.checkInv(101, 50));
    }
    @Test
    void orangeLowInventory() {
        assertEquals(false, inv.checkInv(100, 51));
    }
}
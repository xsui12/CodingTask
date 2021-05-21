import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    List<String> testString = new ArrayList<>();
    OrderService o = new OrderService();
    InventoryService inv = new InventoryService();

    @BeforeEach
    void init() {

    }


    @Test
    void calculatePrice1() {
        testString.add("");
        assertEquals(0, o.calculatePrice(testString));
    }

    @Test
    void calculatePrice2(){
        testString.add("Banana");
        assertEquals(0, o.calculatePrice(testString));
    }

    @Test
    void allApples(){
        testString.add("Apple");
        testString.add("Apple");
        assertEquals(0.6, o.calculatePrice(testString));
    }
    @Test
    void allOranges(){
        testString.add("Orange");
        testString.add("Orange");
        testString.add("Orange");
        assertEquals(0.5, o.calculatePrice(testString));
    }

}
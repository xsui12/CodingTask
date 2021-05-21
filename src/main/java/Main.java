import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> testString = new ArrayList<>();
        testString.add("Apple");
        testString.add("Orange");
        OrderService o = new OrderService();
        o.processOrder(testString);
    }
}

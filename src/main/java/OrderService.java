import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderService implements OrderListener{
    private final String apple = "Apple";
    private final String orange = "Orange";
    //List<String> orderString;
    Map<String, Integer> order = new HashMap<>();
    InventoryService inv = new InventoryService();
    private static final ExecutorService pool = Executors.newCachedThreadPool();

    public OrderService() {
    }

    public void processOrder(List<String> orderString){
        pool.submit(() -> calculatePrice(orderString));
        int a = order.get(apple);
        int o = order.get(orange);
        if (inv.checkInv(a, o)){
            sendEmail();
        }
    }

    public Double calculatePrice(List<String> stringList) {
        double total = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i) == apple) {
                order.put(apple, order.getOrDefault(apple, 0) + 1);
            } else if (stringList.get(i) == orange) {
                order.put(orange, order.getOrDefault(orange, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            if (entry.getKey() == apple) {
                total = total + entry.getValue() * 0.6 - (int)(entry.getValue()/2)*0.6;
            }
            if (entry.getKey() == orange) {
                total = total + entry.getValue() * 0.25 - (int)(entry.getValue()/3)*0.25;
            }
        }
        return total;
    }

    @Override
    public void sendEmail() {
        EmailService e = new EmailService();
        e.sendEmail();
    }
}

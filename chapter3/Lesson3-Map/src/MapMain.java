import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "田中");
        userMap.put(2, "鈴木");
        userMap.put(3, "山田");
        userMap.put(4, "大谷");
        userMap.put(5, "村上");
        userMap.put(6, "吉田");

        System.out.println(userMap.get(2));
        System.out.println(userMap.get(3));
        System.out.println(userMap.get(6));

        // 指定したキーが存在するかどうか判定する
        boolean containsKey = userMap.containsKey(5);
        System.out.println(containsKey);

        //指定した値が存在するかどうか判定する
        boolean containsValue = userMap.containsValue("中野");
        System.out.println(containsValue);
    }
}
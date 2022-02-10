import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {
    public static void main(String[] args) {
        //List
        List<String> items = new CopyOnWriteArrayList<>();

        //Set
        Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());

        //Map
        Map<String, Long> map = new ConcurrentHashMap<>();
    }
}

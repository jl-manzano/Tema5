package package12;

import java.util.Comparator;

public class OrdenDecreciente implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;  // Orden decreciente
    }
}


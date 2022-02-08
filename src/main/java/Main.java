import logic.BubbleSort;
import service.StringSortService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringSortService service = new StringSortService(new BubbleSort<>());
        List<String> list = service.doSort(Arrays.asList(args));

        System.out.println("Hello world! - result: " + list);
    }

}

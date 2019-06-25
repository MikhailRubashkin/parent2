package by.itacademy.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        Service service =

        ServiceLoader.load(Service.class)
            .findFirst()
                .orElseThrow(() -> new RuntimeException("Nope"));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        Double result = service.average(list);
        System.out.println(result);
        }

}
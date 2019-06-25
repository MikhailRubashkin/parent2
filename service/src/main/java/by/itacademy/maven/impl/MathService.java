package by.itacademy.maven.impl;



import by.itacademy.maven.Service;

import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class MathService implements Service {

    public Double average(List<Integer> values) {

        OptionalDouble optionalDouble = values.stream()
                .filter(Objects::nonNull)
                .mapToDouble(value -> value)
                .average();

        return optionalDouble.orElse(0.0);



       /* double sum = 0;
        for (Integer value:values){
          sum +=value;

        }
        return sum/values.size();
    }*/
    }

}

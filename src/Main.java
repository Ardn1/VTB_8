import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("1", "2", "1", "3", "2", "3", "2", "1", "2", "2"); //2 1 3
        System.out.println(names.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                        .entrySet().stream().max(Comparator.comparingLong(x->x.getValue())).get().getKey());

        List<Employer> employers = new ArrayList<>();
        employers.add(new Employer("Крутько", 21, 80003));
        employers.add(new Employer("Иванько", 101, 12000));
        employers.add(new Employer("Сидоров", 25, 10000));
        System.out.println(employers.stream().map(x->x.getSalary()).collect(Collectors.averagingDouble(Float::doubleValue)));
        int N = 2;
        System.out.println(employers.stream().sorted(Comparator.comparingInt(x->-x.getAge())).limit(N).map(x->x.getName())
                .collect(Collectors.joining(", ", "N самых старших сотрудников зовут: ", ";")));
    }
}

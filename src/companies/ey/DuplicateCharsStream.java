package companies.ey;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsStream {

    public static void main(String[] args) {
        String findDuplicateCharsFromThisString = "abcdaiomc";
        Map<Character, Long> collect = findDuplicateCharsFromThisString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println(e.getKey()));
    }
}

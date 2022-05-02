package trafficLights;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLight[] trafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                //.map(e -> TrafficLight.valueOf(e))
                .map(TrafficLight::valueOf)// replace above with method reference
                // .boxed
                // .collect(Collectors.toCollection())
                .toArray(TrafficLight[]::new);

        int n = scanner.nextInt();

        TrafficLight[] lights = TrafficLight.values();

        StringBuilder builder = new StringBuilder();

        while (n-- > 0) {
            for (int i = 0; i < trafficLights.length; i++) {
                int index = (trafficLights[i].ordinal() + 1) % lights.length;
                trafficLights[i] = lights[index];

                builder.append(trafficLights[i].toString()).append(" ");
            }
            builder.append(System.lineSeparator());
        }

        System.out.println(builder.toString());
    }
}

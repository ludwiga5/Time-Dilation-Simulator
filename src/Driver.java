import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        // distances (in km) are averaged due to eliptical orbit
        List<Destination> destinations = List.of(
            new Destination("Moon", 3.84E5),
            new Destination("Mercury", 9.17E7),
            new Destination("Venus", 4.14E7),
            new Destination("Mars", 7.83E7),
            new Destination("Jupiter", 6.28E8),
            new Destination("Saturn", 1.28E9),
            new Destination("Uranus", 2.72E9),
            new Destination("Neptune", 4.35E9),
            new Destination("Alpha Centauri", 4.13E13),
            new Destination("Barnard's Star", 5.68E13),
            new Destination("Sirius", 8.15E13),
            new Destination("Tau Ceti", 1.13E14),
            new Destination("Betelguese", 6.07E15)
        );

        Simulation sim = new Simulation();

        sim.StartSim(destinations.get(0));

    }
}



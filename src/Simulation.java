public class Simulation {
    
    private Destination target;
    private double targetDistance;
    private RocketState rocketState;

    public Simulation(){
        this.rocketState = new RocketState();
    }

    public void StartSim(Destination dest){
        this.target = dest;
        System.out.println("The Rocket Simulation has started for a trip to " + target.targetName);
    }


}

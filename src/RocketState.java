public class RocketState {

    double earthTime;       // time passed on earth since launch
    double localTime;       // time passed on rocket since launch
    double rocketVelocity;  // speed of rocket
    double rocketPosition;  // 1D position along trajectory

    double targetDistance;  // distance to planet/system
    boolean isRunning;      // is the rocket still moving
    
}

import java.util.HashMap;

public class PartsFactory {

    HashMap<String, Engine> engines = new HashMap<>();
    HashMap<Integer, Wheel> wheels = new HashMap<>();

    public Engine getEngine(int power, Engine.Fuel fuel){
        String key = power + ":" + fuel;
        Engine engine = engines.get(key);
        if (engine == null){
            engine = new Engine(power, fuel);
            engines.put(key, engine);
        }
        return engine;
    }

    public Wheel getWheel(int diameter){
        int key = diameter;
        Wheel wheel = wheels.get(key);
        if (wheel == null){
            wheel = new Wheel(diameter);
            wheels.put(key, wheel);
        }
        return wheel;
    }
}

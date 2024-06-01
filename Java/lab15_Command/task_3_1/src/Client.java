public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");

        Controller universalController = new UniversalController();

        Command kitchenLampOn = new TurnLightOnCommand(kitchenLamp);
        Command kitchenLampOff = new TurnLightOffCommand(kitchenLamp);
        Controller controllerKitchenLamp = new Controller();
        controllerKitchenLamp.setCommandOn(kitchenLampOn);
        controllerKitchenLamp.setCommandOff(kitchenLampOff);
        universalController.setCommandOn(kitchenLampOn);
        universalController.setCommandOff(kitchenLampOff);

        Command hallLampOn = new TurnLightOnCommand(hallLamp);
        Command hallLampOff = new TurnLightOffCommand(hallLamp);
        Controller controllerHallLamp = new Controller();
        controllerHallLamp.setCommandOn(hallLampOn);
        controllerHallLamp.setCommandOff(hallLampOff);
        universalController.setCommandOn(hallLampOn);
        universalController.setCommandOff(hallLampOff);


        Command bedroomLampOn = new TurnLightOnCommand(bedroomLamp);
        Command bedroomLampOff = new TurnLightOffCommand(bedroomLamp);
        Controller controllerBedroomLamp = new Controller();
        controllerBedroomLamp.setCommandOn(bedroomLampOn);
        controllerBedroomLamp.setCommandOff(bedroomLampOff);
        universalController.setCommandOn(bedroomLampOn);
        universalController.setCommandOff(bedroomLampOff);



        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerHallLamp.on();
        controllerHallLamp.on();

        universalController.off();

    }
}

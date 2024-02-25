public class Director {
    Car createDefaultCar() {
        Car.Builder carBuilder = new Car.Builder();
        Car car = carBuilder.build();
        return car;
    }

    Car createExampleSUV(){
        Engine.Builder engineBuilder = new Engine.Builder();
        Engine engine = engineBuilder
                .setFuel(Engine.Fuel.Diesel)
                .setPower(150)
                .setTorque(160)
                .build();

        Wheel.Builder wheelBuilder = new Wheel.Builder();
        Wheel wheel = wheelBuilder
                .setDiameter(15)
                .setMaterial(Wheel.Material.Alloy)
                .build();

        Transmission transmission = (new Transmission.Builder()).setGears(5).build();

        Car.Builder carBuilder = new Car.Builder();
        Car car = carBuilder
                .setEngine(engine)
                .setWheel(wheel)
                .setType(Car.Type.SUV)
                .setTransmission(transmission)
                .build();

        return car;
    }

    Car createAutomaticHatchback(){

        Engine engine = (new Engine.Builder())
                .setVolume(1.6f)
                .build();

        Wheel wheel = (new Wheel.Builder())
                .setDiameter(13)
                .build();

        Transmission transmission = (new Transmission.Builder())
                .setType(Transmission.Type.Automatic)
                .setGears(7)
                .build();

        Car.Builder carBuilder = new Car.Builder();
        Car car = carBuilder
                .setEngine(engine)
                .setWheel(wheel)
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Black)
                .setTransmission(transmission)
                .build();

        return car;
    }

}

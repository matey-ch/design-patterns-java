public class Engine implements Cloneable{

    public static class Builder{
        private Fuel fuel = Fuel.Petrol;
        private int power = 105;
        private int torque = 140;
        private float volume = 1.4f;

        public Builder setFuel(Fuel fuel){
            this.fuel = fuel;
            return this;
        }

        public Builder setPower(int power){
            this.power = power;
            return this;
        }

        public Builder setTorque(int torque){
            this.torque = torque;
            return this;
        }

        public Builder setVolume(float volume){
            this.volume = volume;
            return this;
        }

        public Engine build(){
            return new Engine(power,torque,fuel,volume);
        }
    }


    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    final int power;     //  Потужність
    final int torque;    //  Крутний момент
    final Fuel fuel;     //  Вид пального
    final float volume;  //  Об'єм двигуна

    private Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    private Engine(Engine other){
        this(other.power, other.torque, other.fuel, other.volume);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }

    @Override
    public Engine clone(){
        return new Engine(this);
    }

}

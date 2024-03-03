public class Transmission implements Cloneable{

    public static class Builder{

        private Type type = Type.Manual;   // Матеріал диску
        private int gears = 6;

        public Builder setType (Type type){
            this.type=type;
            return this;
        }

        public Builder setGears (int gears){
            this.gears=gears;
            return this;
        }

        public Transmission build(){
            return new Transmission(type,gears);
        }
    }

    public enum Type {
        Manual,
        Automatic,
    }

    final Type type;   // Матеріал диску
    final int gears;                //  Діаметр колеса

    private Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    private Transmission(Transmission other){
        this(other.type, other.gears);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }

    @Override
    public Transmission clone(){
        return new Transmission(this);
    }
}

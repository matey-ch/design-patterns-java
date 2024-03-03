public class Wheel implements Cloneable {

    public static class Builder{

        private Material material = Material.Steel;   // Матеріал диску
        private int diameter = 14;

        public Builder setMaterial (Material material){
            this.material=material;
            return this;
        }

        public Builder setDiameter (int diameter){
            this.diameter=diameter;
            return this;
        }

        public Wheel build(){
            return new Wheel(material,diameter);
        }
    }

    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }

    final Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса

    private Wheel(Material material,
                 int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    private Wheel(Wheel other){
        this(other.material, other.diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public Wheel clone(){
        return new Wheel(this);
    }
}

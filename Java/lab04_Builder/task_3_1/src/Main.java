public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        Car defaultCar1 = director.createDefaultCar();
        System.out.println(defaultCar1);

        Car exampleSUV1 = director.createExampleSUV();
        System.out.println(exampleSUV1);

        Car automaticHatchback = director.createAutomaticHatchback();
        System.out.println(automaticHatchback);
    }
}

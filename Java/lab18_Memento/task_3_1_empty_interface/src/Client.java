import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker(triangle);
        Random rand = new Random();

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        System.out.println("Volume = " + triangle.square());

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    caretaker.setA(values[index]);
                    break;
                case "b":
                    caretaker.setB(values[index]);
                    break;
                case "c":
                    caretaker.setC(values[index]);
                    break;
            }

            System.out.println("Volume = " + triangle.square());

            int cnt = rand.nextInt(3);
            for (int j=0; j<cnt;j++){
                caretaker.undo();
                System.out.println("Undid to volume = " + triangle.square());
            }
        }



    }

}

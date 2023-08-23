package plantation;

public class Garden {
    private static void growPlants(Plant[] plants, int years) {
        for (int year = 0; year < years; year++) {
            System.out.println("Year " + (year + 1) + ":");
            for (Plant plant : plants) {

                plant.goSpring();
                plant.goSummer();
                plant.goAutumn();
                plant.goWinter();

            }
            System.out.println("++++++++++++++++++++++++++");
        }

        for (Plant plant : plants) {
            plant.plantInformation();
        }
    }

    public static void main(String[] args) {
        Plant[] plants = {
                new Tree("Apple tree", 80, 1),
                new Flower("Rose", 50, 1),
                new Flower("Rose bush", 100, 2),
                new Tree("Cherry tree", 80, 1),
                new Flower("Marigolds", 20, 1)
        };

        growPlants(plants, 5);
    }
}


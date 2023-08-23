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
            plant.Information();
        }
    }

    public static void main(String[] args) {
        Plant[] plants = {
                new Tree("AppleTree", 80, 2),
                new Flower("Rose", 50, 2)
        };

        growPlants(plants, 5);
    }
}


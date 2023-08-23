package plantation;


public class Garden {
    public static void main(String[] args) {
        Plant[] plants = {
                new Tree("Cherry tree", 80, 1),
                new Flower("Marigolds", 20, 1)
        };
        growPlants(plants, 5);
    }

    private static void growPlants(Plant[] plants, int years) {
        int passed = 0;
        while ( passed <= years ) {
            for (Plant plant : plants) {
                plant.goSpring();
                plant.goSummer();
                plant.goAutumn();
                plant.goWinter();
                passed = plant.getAge();
            }
            System.out.println("++++++++++ The annual cycle has passed ++++++++++++++++");

        }

        for (Plant plant : plants) {
            plant.plantInformation() ;
        }
    }


}


package plantation;

public class Flower extends Plant {
    private static int FLOWER_GROWTH_PER_SEASON = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void goSpring() {
        height += FLOWER_GROWTH_PER_SEASON;
        super.goSpring();
    }

    @Override
    protected void goSummer() {
        System.out.println(name + " is flowering in Summer");
    }

    @Override
    protected void goAutumn() {
        System.out.println(name + " is being cut in Autumn");
    }

    @Override
    protected void goWinter() {
        System.out.println(name + " is NOT growing in Winter");
    }
}


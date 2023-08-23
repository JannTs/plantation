package plantation;

public class Flower extends Plant {
    private static int TREE_GROW_PER_SEASON = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override

    protected void goSpring() {
        height += TREE_GROW_PER_SEASON;
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
        System.out.println(name + " is not growing in Winter");
    }
}


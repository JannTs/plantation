package plantation;

public class Flower extends Plant {
    int flower_grow_per_season = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    protected void goSpring() {
        height += flower_grow_per_season;
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


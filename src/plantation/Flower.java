package plantation;

public class Flower extends Plant {
    int flower_grow_per_season = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    protected void doSpring() {
        height += flower_grow_per_season;
        super.doSpring();
    }

    @Override
    protected void doSummer() {
        System.out.println(name + " is flowering in Summer");
    }

    @Override
    protected void doAutumn() {
        System.out.println(name + " is being cut in Autumn");
    }

    @Override
    protected void doWinter() {
        System.out.println(name + " is not growing in Winter");
    }
}


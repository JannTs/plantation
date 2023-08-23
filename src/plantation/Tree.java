package plantation;

public class Tree extends Plant {
    int tree_grow_per_season = 5;

    Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    protected void doSpring() {
        height += tree_grow_per_season;
        super.doSpring();
    }

    @Override
    protected void doSummer() {
        height += tree_grow_per_season;
        super.doSummer();
    }

    @Override
    protected void doAutumn() {
        System.out.println(name + " is not growing in Autumn");
    }

    @Override
    protected void doWinter() {
        System.out.println(name + " is not growing in Winter");
    }
}

public abstract class Plant {
    double height;
    Type type;

    public Plant(double height, Plant.Type type) {
        this.height = height;
        this.type = type;
    }

    double measure() {
        return height;
    }

    enum Type{Grass, Tree, YoungTree, TreeStump, Flower}
}

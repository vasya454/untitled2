public class Wood {
    double volume;

    public Wood(double volume) {
        this.volume = volume;
    }

    public void addWood(Wood w) {
        this.volume+=w.volume;
    }
}

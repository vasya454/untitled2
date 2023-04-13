public class Wood {
    double volume;

    public Wood(double volume) {
        this.volume = volume;
    }

    public Wood addWood(Wood w) {
        return new Wood(volume+w.volume);
    }
}

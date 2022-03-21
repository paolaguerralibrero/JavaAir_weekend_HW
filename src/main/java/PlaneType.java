public enum PlaneType {

    BOEING747(467, 140000);

    private final int capacity;
    private int total_weight;

    PlaneType(int capacity, int total_weight) {
        this.capacity = capacity;
        this.total_weight = total_weight;
    }
}

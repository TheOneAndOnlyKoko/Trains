public class Parcel
{
    private int trackingID;
    private double weight;
    public destinationAddress destinationAddress;
    public originAddress originAddress;
    public Parcel(int ID) {
        trackingID = ID;
        weight = 0;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    public double getWeight() {
        return weight;
    }
}

public class Wagon extends RollingStock {
    private Parcel[] mParcels;
    private int mParcelCount;
    static int wagonCount = 0;

    public Wagon(int ID) {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
        wagonCount++;
    }

    // Accessor methods
    public int getWagonID() {
        return this.getID();
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < mParcelCount; i++) {
            totalWeight += mParcels[i].getWeight();
        }
        return totalWeight;
    }

    public int getNumberOfWagons() {
        return wagonCount;
    }

    public void addParcel(Parcel parcel) {
        mParcels[mParcelCount] = parcel;
    }

    public Parcel getParcel(int index) {
        Parcel parcel;
        parcel = mParcels[index];
        mParcels[index] = null;
        return parcel;
    }
// Other methods
}


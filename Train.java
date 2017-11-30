import java.util.*;

public class Train
{
    private Engine[] mEngines;
    private LinkedList<Wagon> mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight = getWeight(); // Total weight in kilograms

    public Train(int number)
    {
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        LinkedList<Wagon> mWagons = new LinkedList<Wagon>();
        mWagonCount = 0;
        mWeight = 0;
    }
    public void addEngine( Engine newEngine )
    {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }
    public Engine removeEngine()
    {
        mEngineCount--;
        return mEngines[mEngineCount];
    }
    public void addWagon( Wagon newWagon )
    {
        mWagons.addFirst(newWagon);
        mWagonCount++;
    }
    public Wagon removeWagon(int removeID) {
        Wagon store = null;
        for (int i = 0; i < mWagons.size(); i++) {
            if (mWagons.get(i).getWagonID() == removeID) {
                store = mWagons.get(i);
                mWagons.remove(i);
            }
        }
        return store;
    }
    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < mEngineCount; i++) {
            totalWeight += mEngines[i].getWeight();
        }
        for (int i = 0; i < mWagonCount; i++) {
            totalWeight += mWagons.get(i).getWeight();
        }
        return totalWeight;
    }
}

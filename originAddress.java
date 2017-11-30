public class originAddress {
    int buildingNumber;
    String street;
    String city;
    String state;
    String country;
    boolean buisnessAddress;
    boolean pickupPostOffice;
    public originAddress (int buildingNumber, String street, String city, String state, String country, boolean buisnessAddress, boolean pickupPostOffice) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.buisnessAddress = buisnessAddress;
        this.pickupPostOffice = pickupPostOffice;
    }

}

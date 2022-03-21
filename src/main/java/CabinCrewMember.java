public class CabinCrewMember {

    private String name;
    private CabinCrewMemberType cabinCrewMemberType;


    public CabinCrewMember(String name, CabinCrewMemberType cabinCrewMemberType) {
        this.name = name;
        this.cabinCrewMemberType = cabinCrewMemberType;
    }

    public String getName() {
        return this.name;
    }

    public CabinCrewMemberType getCabinCrewMemberType() {
        return this.cabinCrewMemberType;
    }

    public String canRelayMessages() {
        return "Fasten your seatbelts";
    }
}

import java.util.ArrayList;

public class Pilot {

    private String name;

    public Pilot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCabinCrewMemberType() {
        return "I am the Pilot";
    }

    public String getLicenceNumber() {
        return "LN23235";
    }

    public String canFly() {
        return "I can fly";
    }
}

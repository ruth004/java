package GoePoliticalZone;

public enum GoePoliticalZoneEnum {
    NORTH_CENTRAL("Benue", "FCT","Kogi","Kwara","Nasarawa","Niger","Plateau","North"),
    EAST("Adamawa","Bauchi","Borno","Gome","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo"), SOUTH_WEST();

    private String [] state;

    GoePoliticalZoneEnum(String... state){
        this.state = state;
    }

    public String[] getStates(){
        return this.state;
    }

    public class SOUTH_WEST {
    }



}

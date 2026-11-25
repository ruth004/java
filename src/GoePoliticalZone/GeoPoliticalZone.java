package GoePoliticalZone;

public class GeoPoliticalZone {
    public static GoePoliticalZoneEnum getZone(String state){
        for(GoePoliticalZoneEnum zones : GoePoliticalZoneEnum.values()){
             for(String states : zones.getStates()){
                 if (states.equalsIgnoreCase(state)) {
                     return zones;
                 }
             }
        }
        return null;
    }
}

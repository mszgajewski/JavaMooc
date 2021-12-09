package VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> licensePlateStringHashMap;

    public VehicleRegistry(){
        this.licensePlateStringHashMap = new HashMap<>();
    }

    public void add(LicensePlate licensePlate, String owner){
        for (LicensePlate element : licensePlateStringHashMap.keySet()) {
            if (!element.equals(licensePlate)) {
                licensePlateStringHashMap.put(licensePlate, owner);
            }
        }
    }

    public String get(LicensePlate licensePlate) {
        return licensePlateStringHashMap.getOrDefault(licensePlate, null);
    }

    public void remove(LicensePlate licensePlate){
        if(licensePlateStringHashMap.containsKey(licensePlate)){
            licensePlateStringHashMap.remove(licensePlate);
        }
    }

    public void printLicensePlates(){
        for(LicensePlate element : licensePlateStringHashMap.keySet()){
            System.out.println(element);
        }
    }

    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<>();

        for(String element : licensePlateStringHashMap.values()){
            if (!ownersList.contains(element)) {
                ownersList.add(element);
                System.out.println(element);
            }
        }
    }

}

package StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageListHashmap;

    public StorageFacility(){
        this.storageListHashmap = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storageListHashmap.putIfAbsent(unit, new ArrayList<>());
        this.storageListHashmap.get(unit).add(item);
    }

    public ArrayList<String> items(String unit){
        ArrayList<String> list = new ArrayList<>();
        return this.storageListHashmap.getOrDefault(unit, list);
    }

    public void remove(String unit, String item){
        this.storageListHashmap.get(unit).remove(item);
    }

    public ArrayList<String> units(){
        ArrayList<String>  keys = new ArrayList<>();
        for(String element : storageListHashmap.keySet()){
            if(!storageListHashmap.get(element).isEmpty()){
                keys.add(element);
            }
        }
        return keys;
    }


}

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PackAnimalClass extends HomeAnimalClass{

    
    private Map<Integer, ArrayList<String>> reestr = new TreeMap<Integer, ArrayList<String>>();
    private String packWeightKG;


    public PackAnimalClass(Integer id, String vid, String name, String packWeightKG) {
        super(id, vid, name);
        this.packWeightKG=packWeightKG;

    }
    
    public void plus(Integer id, String vid, String name, String packWeightKG) {

        try {
            ArrayList<String> list = new ArrayList<>();
            list.add(0,vid);
            list.add(1,name);
            list.add(2,packWeightKG);
            
            this.reestr.put(id,list);

        } catch (Throwable t) {
            throw t;
        }      
    }
    public void wiew() {
        for (Entry<Integer, ArrayList<String>> entry : reestr.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            System.out.println("ID: " + key + ", VID: " + value.get(0)+", Name: "+value.get(1)+ ", packWeightKG: " + value.get(2));
        }
    }
}
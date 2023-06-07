import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HomeAnimalClass extends animalClass{

    private Map<Integer, ArrayList<String>> reestr = new TreeMap<Integer, ArrayList<String>>();
    
    private String name;

    public HomeAnimalClass(Integer id, String vid, String name) {
        super(id, vid);
        this.name=name;
    }
    
    public void plus(Integer id, String vid, String name) {
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add(0,vid);
            list.add(1,name);
            
            this.reestr.put(id,list);

        } catch (Throwable t) {
            throw t;
        }      
    }
    public void wiew() {
        for (java.util.Map.Entry<Integer, ArrayList<String>> entry : reestr.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            System.out.println("ID: " + key + ", VID: " + value.get(0)+", Name: "+value.get(1));
        }
    }
}

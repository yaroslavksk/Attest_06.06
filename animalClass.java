import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class animalClass {

    private Integer id;
    private String vid;
    
    private Map<Integer, String> reestr = new TreeMap<Integer, String>();

    public animalClass(Integer id, String vid){
        this.id = id;
        this.vid = vid;
    }

    public void AddAnimal(Integer id, String vid) {
        try {
            this.reestr.put(id,vid);
        } catch (Throwable t) {
            throw t;
        }      
    }

    public void wiew() {
        for (Entry<Integer, String> entry : reestr.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("ID: " + key + ", Vid: " + value);
        }
    }
}
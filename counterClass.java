import javax.management.RuntimeErrorException;

public class counterClass {

    private Integer count=0;

    public void plus() {

        count++;
        boolean result = true;
        
        if (result == true){}else {throw new RuntimeErrorException(null, "this count is not correct");}
    }
}
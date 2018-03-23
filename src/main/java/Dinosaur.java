import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private Enum type;
    private ArrayList<Belly> belly;


    public Dinosaur(String name, ArrayList<Belly> belly){
        this.name = name;
        this.belly = belly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

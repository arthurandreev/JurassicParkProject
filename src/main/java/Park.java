import java.util.ArrayList;

public class Park {

    private String name;
    private ArrayList<Paddock> paddocks;
    private ArrayList<Visitor> visitors;

    public Park(String name, ArrayList<Paddock> paddocks, ArrayList<Visitor> visitors){
        this.name = name;
        this.paddocks = paddocks;
        this.visitors = visitors;
    }

    public String getName() {
        return name;
    }
}

public class Visitor {

    private String name;
    private String jobTitle;


    public Visitor(String name, String jobTitle){

        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {

        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }


}

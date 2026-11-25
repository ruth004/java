package problem;

public class Problem {
    private String name;
    private String description;
    private ProblemEnum type;
    private boolean status;

    public Problem(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public String getDescriptioni() {
        return description;
    }


    public ProblemEnum getType() {
        return type;
    }

    public void setType(ProblemEnum type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}

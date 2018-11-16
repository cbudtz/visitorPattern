public class Group {


    private String name;
    private Ownable[] ownables;

    public Group(String name, Ownable[] ownables) {
        this.name = name;
        this.ownables = ownables;
    }

    public void setOwnables(Ownable[] ownables) {
        this.ownables = ownables;
    }

    public String getName() {
        return name;
    }

    public Ownable[] getOwnables() {
        return ownables;
    }
}

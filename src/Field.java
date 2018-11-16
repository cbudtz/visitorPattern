abstract public class Field {
    public Field(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String name;
    public int position;

    public abstract void accept(FieldVisitor v);


    public String getName() {
        return name;
    }
}

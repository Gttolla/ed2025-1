public class Info<T> {

    private int id;
    private T info;

    public Info(int id, T info) {
        this.id = id;
        this.info = info;
    }

    public String toString()
    {
        return ("_" + info + "_");
    }

}

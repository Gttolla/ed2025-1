public class Info<T> {

    private int id;
    private T info;

    public Info(int id, T info) {
        this.id = id;
        this.info = info;
    }

    public int getId()
    {
        return this.id;
    }

    public T getInfo()
    {
        return this.info;
    }

    public String toString()
    {
        return ("_" + info + "_");
    }

}

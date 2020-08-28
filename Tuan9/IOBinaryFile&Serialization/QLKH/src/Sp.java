public class Sp {
    private String name;
    private int id;
    private String nhaSX;
    private long pride;
    private String more;

    public Sp() {
    }

    public Sp(String name, int id, String nhaSX, long pride, String more) {
        this.name = name;
        this.id = id;
        this.nhaSX = nhaSX;
        this.pride = pride;
        this.more = more;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public long getPride() {
        return pride;
    }

    public void setPride(long pride) {
        this.pride = pride;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }
    @Override
    public String toString(){
        return id+","+name+","+nhaSX+","+pride+","+more+"\n";
    }
}

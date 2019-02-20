package it524.collections.set;

public class Faction {
    private int id;
    private String name;

    public Faction() {
        // TODO Auto-generated constructor stub
    }

    public Faction(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        return new Integer(id).equals(((Faction)obj).getId());
    }

    @Override
    public int hashCode() {
        return id;
    }

}

package comcast;

/**
 * @project q
 * @authore dgunda on 2/19/19
 */
public class Coordinates {
    String id;
    String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Coordinates{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

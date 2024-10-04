package Entity;

import java.time.LocalDate;

public class Staff {
    private int id;
    private String code;
    private String name;
    private LocalDate DoB;

    public Staff() {;}

    public Staff(int id, LocalDate DoB, String name, String code) {
        this.id = id;
        this.DoB = DoB;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoB(LocalDate DoB) {
        this.DoB = DoB;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", DoB=" + DoB +
                '}';
    }
}


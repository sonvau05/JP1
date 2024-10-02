import Entity.Manager;
import Entity.Staff;
import Entity.Technician;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Manager("Ronaldo", 4000, 1000));
        staffList.add(new Technician("Messi", 2000, 500));

        staffList.forEach(staff -> System.out.println(staff.toString()));
    }
}

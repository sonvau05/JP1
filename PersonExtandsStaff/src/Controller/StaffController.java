package Controller;

import Entity.Gender;
import Entity.Staff;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StaffController {
    private static List<Staff> staffList;

    public StaffController(List<Staff> staffList) {
        StaffController.staffList = staffList;
    }

    public Optional<Staff> getHighestPaidFemaleStaff() {
        return staffList.stream()
                .filter(staff -> staff.getGender() == Gender.Female)
                .max(Comparator.comparing(Staff::getPay));
    }

    public static Optional<Staff> getById(String id) {
        return staffList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    public static List<Staff> getByName(String name) {
        return staffList.stream()
                .filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void changeStaffName(String id, String newName) {
        getById(id).ifPresent(staff -> staff.setName(newName));
    }
}


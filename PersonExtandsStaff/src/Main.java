import Controller.StaffController;
import Controller.StudentController;
import Entity.Gender;
import Entity.Staff;
import Entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // List Student
        List<Student> students = new ArrayList<>();
        students.add(new Student("C2309G5953", "Hai", LocalDate.of(2005, 5, 24), Gender.Male, "Ha Noi"));
        students.add(new Student("C2309G5975", "Vinh Le", LocalDate.of(2006, 11, 18), Gender.Other, "Ha Noi"));
        students.add(new Student("C2309G5955", "Hieu Hoang", LocalDate.of(1999, 3, 25), Gender.Female, "Ha Noi"));

        StudentController sc = new StudentController(students);

        // Hiển thị thông tin sinh viên trẻ nhất
        Optional<Student> studentYoungest = sc.getYoungest();
        studentYoungest.ifPresent(student -> System.out.println("Student youngest: " + student));

        // Tìm sinh viên theo tên
        StudentController.getByName("vinh").forEach(System.out::println);

        // List Staff
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("S001", "Anna", "New York", "School A", 5000, Gender.Female));
        staffList.add(new Staff("S002", "Jane", "Los Angeles", "School B", 6000, Gender.Female));

        StaffController staffController = new StaffController(staffList);

        // Hiển thị thông tin nhân viên nữ có lương cao nhất
        Optional<Staff> highestPaidFemale = staffController.getHighestPaidFemaleStaff();
        highestPaidFemale.ifPresent(staff -> System.out.println("Highest Paid Female Staff: " + staff));

        // Tìm nhân viên theo ID
        Optional<Staff> staffById = StaffController.getById("S002");
        staffById.ifPresent(staff -> System.out.println("Staff by ID S002: " + staff));

        // Tìm nhân viên theo tên
        List<Staff> staffByName = StaffController.getByName("anna");
        staffByName.forEach(System.out::println);

        // Thay đổi tên của nhân viên
        staffController.changeStaffName("S001", "Anna Maria");
        StaffController.getById("S001").ifPresent(staff -> System.out.println("Updated Staff: " + staff));
    }
}

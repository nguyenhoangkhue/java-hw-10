package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> arrStudent=new ArrayList<>();

        Student student1=new Student("a1","b1",13,"c1",9.9,"9");
        Student student2=new Student("a2","b3",13,"c2",9.9,"10");
        Student student3=new Student("a3","b3",13,"c3",9.9,"11");
        Student student4=new Student("a4","b4",13,"c4",9.9,"9");

        arrStudent.add(student1);
        arrStudent.add(student2);
        arrStudent.add(student3);
        arrStudent.add(student4);

        for (int i=0;i<arrStudent.size();i++){
            System.out.println(arrStudent.get(i));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thêm id học sinh mới");
            String setId=sc.nextLine();
            System.out.println("Thêm tên học sinh mới");
            String setName=sc.nextLine();
            System.out.println("Thêm tuổi học sinh mới");
            int setAge=sc.nextInt();
            System.out.println("Thêm địa chỉ học sinh mới");
            String setAddress=sc.nextLine();
            System.out.println("Thêm điểm học sinh mới");
            double setPoint= sc.nextDouble();
            System.out.println("Thêm lớp học sinh mới");
            String setClassRoom=sc.nextLine();
            sc.nextLine();
            Student student = new Student(setId,setName,setAge,setAddress,setPoint,setClassRoom);
            arrStudent.add(student);
        }
        for (int i=0;i<arrStudent.size();i++){
            System.out.println(arrStudent.get(i));
        }

        System.out.println("Nhập id học sinh muốn cập nhật điểm");
        String updId=sc.nextLine();
        for (int i=0;i<arrStudent.size();i++){
            if (updId==arrStudent.get(i).getId()){
                System.out.println("Nhập điểm mới");
                double updPoint=sc.nextDouble();
                System.out.println("Đã cập nhật điểm mới"+updPoint);
            }
        }

        System.out.println("Nhập id học sinh muốn xóa");
        String removeId=sc.nextLine();
        for (int i=0;i<arrStudent.size();i++){
            if (removeId==arrStudent.get(i).getId()){
                System.out.println("Đã xóa học sinh có id: "+removeId);
                arrStudent.remove(arrStudent.get(i));
                System.out.println("Danh sách học sinh sau khi xóa là");
                arrStudent.remove(arrStudent.get(i));
            }
        }

        System.out.println("Nhập lớp muốn xem danh sách học sinh");
        String classList=sc.nextLine();
        for (int i=0;i<arrStudent.size();i++){
            if (classList==arrStudent.get(i).getClassRoom()){
                System.out.println("Danh sách học sinh là");
                arrStudent.remove(arrStudent.get(i));
            }
        }

        System.out.println("Danh sách học sinh sắp xếp theo tên là: ");
        Collections.sort(arrStudent);
        show(arrStudent);

        Collections.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint() - o2.getPoint() > 0 ? 1 : -1;
            }
        });
        System.out.println("Danh sách học sinh sắp xếp theo điểm là: ");
        show(arrStudent);
        Collections.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge() > 0 ? 1 : -1;
            }
        });
        System.out.println("Danh sách học sinh sắp xếp theo tuổi là: ");
        show(arrStudent);
    }
    public static void show(ArrayList<Student> list){
        for (Student student: list) {
            System.out.println(student);
        }
    }

}

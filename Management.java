public class Management {
    public static void main(String[] args) {
        Student sinhvien1 = new Student("Tran Nhat Hung", 19, "23020777");
        Teacher giaovien1 = new Teacher("Le Phe Do", 50);
        Person nhansu1 = new Person("Cristiano Ronaldo", 40);
        sinhvien1.print();
        giaovien1.print();
        nhansu1.print();
    }
}

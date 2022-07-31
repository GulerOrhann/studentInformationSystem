public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO", t3);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 100, 100);
        s1.addBulkExamSozNote(60,60,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50, 30, 70);
        s1.addBulkExamSozNote(50,60,60);
        s2.isPass();
    }
}

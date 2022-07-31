public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozNote;
    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int sozNote=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }

}

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkExamSozNote(int sozNote1, int sozNote2, int sozNote3) {
        if (sozNote1 >= 0 && sozNote1 <= 100) {
            this.c1.sozNote = sozNote1;
        }
        if (sozNote2 >= 0 && sozNote2 <= 100) {
            this.c2.sozNote = sozNote2;
        }
        if (sozNote3 >= 0 && sozNote3 <= 100) {
            this.c3.sozNote = sozNote3;
        }

    }

    void isPass() {
        System.out.println("====================");
        this.average = ((this.c1.note * 0.8 + this.c1.sozNote * 0.2)
                + (this.c2.note * 0.8 + this.c2.sozNote * 0.2)
                + (this.c3.note * 0.8 + this.c3.sozNote * 0.2)) / 3.0;
        if (this.average > 55) {
            System.out.println("Sinifi basarili gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldiniz!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c1.name + " SozNotu\t:" + this.c1.sozNote);
        System.out.println(this.c2.name + " SozNotu\t:" + this.c2.sozNote);
        System.out.println(this.c3.name + " SozNotu\t:" + this.c3.sozNote);
        System.out.println("Ortalamaniz:" + this.average);

    }

}

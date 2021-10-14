package zarintasnim;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student.universityName="Leading University";

        Student student2 = new Student("Zarin Tasnim Khan");
        Student student3 = new Student(2012020178);

        student1.display();
    }
}
/*
      Name: Zarin Tasnim Khan
      ID : 2012020178
      Section : D
      Email : cse_2012020178@lus.ac.bd
      Date : 07.08.2021
 */
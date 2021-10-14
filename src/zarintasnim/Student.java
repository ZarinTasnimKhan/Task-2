package zarintasnim;

public class Student
{
    String name;
    int id;
    static String universityName;

    Student()
    {
        System.out.println("Default constructor");
    }

    Student (String name)
    {
        this.name = name;
        System.out.println("Name :"+this.name);

    }

    Student (int id)
    {
        this.id = id;
        System.out.println("Id :"+this.id);
    }

    void display()
    {
        System.out.println("University name :"+universityName);
    }
}
/*
      Name: Zarin Tasnim Khan
      ID : 2012020178
      Section : D
      Email : cse_2012020178@lus.ac.bd
      Date : 07.08.2021
 */
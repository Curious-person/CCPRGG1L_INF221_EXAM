public class App {
    public static void main(String[] args) {
    Student Me = new Student();

    Me.surname = "Abgao";
    Me.firstName = "John Kevin";
    Me.MiddleInitial = 'D';
    Me.dateofBirth = "7/26/2022";
    Me.studentNumber = 2022100165;
    Me.studentEmailAddress = "abgaojd@students.national-u.edu.ph";
    Me.iAmAwesome = true;

    Me.sayMyStudentNumber();
    Me.sayMyEmailAddress();
    Me.iAmAwesome();
    }
}

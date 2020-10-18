public class AddGrades {
    public static void main(String[] args) {
        Grades gradesForStudent = new Grades();
       // gradesForStudent.addGrade(1);
       // gradesForStudent.addGrade(2);
       // gradesForStudent.addGrade(4);
       // gradesForStudent.addGrade(2);
       // gradesForStudent.addGrade(8);
        gradesForStudent.addGrade(3);
        gradesForStudent.addGrade(1);
        gradesForStudent.addGrade(0);
       // gradesForStudent.addGrade(3);
       // gradesForStudent.addGrade(4);
       // gradesForStudent.addGrade(1);
                System.out.println("ostatnio dodano ocenę" + " " + gradesForStudent.lastGrade());
        System.out.println("srednioa ocen to" + " " + gradesForStudent.average());

    }
}

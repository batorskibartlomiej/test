public class StudentTest {

    public static void main(String[] args) {


        Student student1 = new Student("Bartek", "Batorski", 999, 25, "barti");
        Student student2 = new Student("Jan", "Kowalski", 980, 28,"john");
        Student student3 = new Student("Katarzyna", "Nowak", 800, 20, "katie");

        Student [] group = {student1,student2,student3};

        for (int i = 0; i < group.length; i++) {
            group[i].przedstawSie();
            group[i].podajNrIndeksu();
            group[i].podajWiek();
            group[i].zalogujSie();


        }




    }
}

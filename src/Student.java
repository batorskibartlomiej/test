public class Student {

    String name;
    String surname;
    int index;
    int age;
    String login;


    public Student(String name, String surname, int index, int age, String login) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        this.age = age;
        this.login = login;
    }



    void przedstawSie(){
        System.out.println("Nazywam sie "+ name+" "+ surname);
    }

    void zalogujSie() {
        System.out.println("loguje się "+ login);
    }

    void podajNrIndeksu(){
        System.out.println("Mój numer indesku: "+ index);
    }

    void podajWiek(){
        System.out.println("Mam "+ age +" lat");
    }
}

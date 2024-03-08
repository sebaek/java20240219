package ch07.sec09;

public class InstanceOfExample {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }

    private static void personInfo(Person person) {
        System.out.println("person.name = " + person.name);
        person.walk();

        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("student.studentNo = " + student.studentNo);
            student.study();
        }

        if (person instanceof Student student) {
            System.out.println("student.studentNo = " + student.studentNo);
            student.study();
        }
    }
}

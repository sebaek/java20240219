package ch06.lecture.p7access;

public class C05GetterSetter {
}

class C05MyClass {
    private String name;
    private String ssn;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }
}

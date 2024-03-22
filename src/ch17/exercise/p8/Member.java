package ch17.exercise.p8;

public class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

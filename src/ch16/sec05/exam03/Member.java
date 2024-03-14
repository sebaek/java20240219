package ch16.sec05.exam03;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("Member.Member");
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member.Member");
    }

    @Override
    public String toString() {
        return STR."{ id: \{id}, name: \{name} }";
    }
}

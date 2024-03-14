package ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member member1 = person.getMember1(Member::new);
        System.out.println(member1);

        Member member2 = person.getMember2(Member::new);
        System.out.println(member2);


    }
}

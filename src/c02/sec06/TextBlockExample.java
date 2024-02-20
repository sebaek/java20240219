package c02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "{" +
                "\n\t\"id\":\"winter\"," +
                "\n\t\"name\":\"눈송이\"\n" +
                "}";
        System.out.println(str1);


        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;
        System.out.println(str2);

        String str3 = """
                aljdf aldfjladf l aldfjk  aldfk ladjf lajf alkdf \
                aldf lak fdlakds flak dfla dflkj aldkjf lala aldkf 
                """;

        System.out.println(str3);
    }
}

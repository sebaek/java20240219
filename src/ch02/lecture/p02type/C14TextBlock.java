package ch02.lecture.p02type;

public class C14TextBlock {
    public static void main(String[] args) {
        /*
        <html>
            <head>
                <title>웹 페이지</title>
            </head>
            <body>
                <h1>페이지 제목</h1>
                <p>
                    aljdlajf
                    aldfjlajlkdfl
                    aldfj  alfdj asfdj a;ldjkf
                    ;adfj lajfdal; "lajdf"
                </p>
            </body>
        </html>
         */
        String html1 = "<html>\n\t<head>\n\t<title>\"웹\" 페이지</title>";

        // text block
        // """로 묶음
        // newline, 따옴표등을 탈출문자 없이 사용 가능
        // 가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html2 = """
                <html>
                    <head>
                        <title>웹 페이지</title>
                    </head>
                    <body>
                        <h1>페이지 제목</h1>
                        <p>
                            aljdlajf
                            aldfjlajlkdfl
                            aldfj  alfdj asfdj a;ldjkf
                            ;adfj lajfdal; "lajdf"
                        </p>
                    </body>
                </html>
                """;
        System.out.println(html2);

    }
}

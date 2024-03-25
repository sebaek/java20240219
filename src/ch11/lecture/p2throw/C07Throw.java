package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C07Throw {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        method1();
    }

    public static void method1() throws ClassNotFoundException, SQLException {
        boolean b1 = true;
        boolean b2 = true;

        if (b1) {
            throw new ClassNotFoundException();
        }
        if (b2) {
            throw new SQLException();
        }
    }
}

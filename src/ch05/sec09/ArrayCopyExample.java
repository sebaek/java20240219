package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArry = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArry, 0, newStrArray, 0, oldStrArry.length);

        System.out.println(Arrays.toString(newStrArray));
    }
}

package ch08.exercise.p3;

import javax.swing.text.Segment;

public class Exercise03 {
    public static void main(String[] args) {
        CharSequence[] charSequences = new CharSequence[10];

        charSequences[0] = "java";
        charSequences[1] = new String("hello");
        charSequences[2] = new Segment();
        charSequences[3] = new StringBuffer();
        charSequences[4] = new StringBuilder();

        charSequences[3].chars();
        charSequences[4].toString();
        charSequences[2].charAt(3);
    }
}

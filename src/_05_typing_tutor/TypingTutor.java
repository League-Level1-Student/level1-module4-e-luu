package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;

public class TypingTutor {
JFrame frame = new JFrame();
public static current {
char currentLetter;
currentLetter = generateRandomLetter();

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}

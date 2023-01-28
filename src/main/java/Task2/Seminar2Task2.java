package Task2;
/* Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

 */
class RotationString {
    String str1;
    String str2;
    RotationString(String first_s, String second_s) {
        str1 = first_s;
        str2 = second_s;
    }
    String rotation_string(String string1, String string2) {
        string1 = str1;
        string2 = str2;
        StringBuilder first_string = new StringBuilder(str1);
        if(String.valueOf(first_string.reverse()).equals(str2)) return "Одна строка является вращением другой";
        else return "Указанные строки не являются вращением друг друга";
    }
}

public class Seminar2Task2 {
    public static void main(String[] args) {
        RotationString answer = new RotationString("Hello", "olleH");
        System.out.println(answer.rotation_string(answer.str1, answer.str2));
    }
}


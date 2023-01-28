package Task3;
// Напишите программу, чтобы перевернуть строку с помощью рекурсии.

class StringReverseRecurse {
    String str = new String();

    String reverse_recourse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        if(string == "") return "";
        else
            return reverse_recourse(stringBuilder.substring(1).toString())+stringBuilder.charAt(0);
    }
}
public class Seminar3Task3 {
    public static void main(String[] args) {
        StringReverseRecurse test_string = new StringReverseRecurse();
        System.out.println("методом рекурсии: " + test_string.reverse_recourse("Hello"));
    }
}

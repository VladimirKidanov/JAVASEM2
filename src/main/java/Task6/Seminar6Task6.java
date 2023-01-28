package Task6;
// *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
class WithOutEqually {
    String str = new String();

    WithOutEqually(String str) {
        this.str = str;
    }

    String OutEqually() {
        StringBuilder stringBuilder = new StringBuilder(str);
        int index;
        while ((index = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(index,index+1,"равно");

        }
        return stringBuilder.toString();

    }
}




public class Seminar6Task6 {
    public static void main(String[] args) {
        String string = "3 + 5 = 8\n9 - 6 = 3\n8 * 9 = 72\n";
        WithOutEqually answer = new WithOutEqually(string);
        System.out.println(answer.OutEqually());
    }
}
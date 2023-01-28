package Task7;

import java.util.Arrays;
import java.util.Random;

//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
public class Seminar7Task7 {
    public static void main(String[] args) {
        RandExample Rand10000 = new RandExample();
        String example_string = Rand10000.RandExample(10000);
        System.out.println(example_string);
        long time1 = System.currentTimeMillis();
        WithOutEqually SbMethod = new WithOutEqually(example_string);
        System.out.println(SbMethod.OutEqually());
        long time2 = System.currentTimeMillis();
        WithOutEqually StrMethod = new WithOutEqually(example_string);
        String res = StrMethod.OutEquallySTR();
        long time3 = System.currentTimeMillis();
        System.out.println("для замены 10000 знаков равно с помощью StringBuilder потребуется " + (time2-time1) + " миллисекунд");
        System.out.println("для замены 10000 знаков равно с помощью String потребуется " + (time3-time2) + " миллисекунд");
    }

}
// класс, генерирующий 10000 случайных примеров
class RandExample {
    String RandExample(int counter) {
        String[] str = new String[]{"+","-","*"};
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(150000);
        for(int i = 0;i<counter;i++) {
            stringBuilder.append(random.nextInt(1,100)).
                    append(str[random.nextInt(0,3)]).
                    append(random.nextInt(1,100)).
                    append("=").append(random.nextInt(1,100)).append("\n");
        }
        return stringBuilder.toString();
    }
}

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

    String OutEquallySTR() {
        String result = new String();
        int index;
        int ignore = 0;
        int count = 0;
        int[] equally_position = new int[str.length()];
        while ((index = str.indexOf("=",ignore)) != -1) {
            equally_position[count] = index;
            count++;
            ignore+=index;
        }
        char[] stringToArr = str.toCharArray();
        String[] arr = new String[stringToArr.length];

        for(int i = 0; i<arr.length;i++) {
            for(int j = 0; j<equally_position.length;j++) {
                if(i==equally_position[j]) arr[i] = "равно";
            }

            arr[i] = String.valueOf(stringToArr[i]);
        }
        for(int j=0;j<equally_position.length;j++) {
            arr[equally_position[j]] = "равно";
        }
        return Arrays.toString(arr);
    }
}

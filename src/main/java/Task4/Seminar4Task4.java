package Task4;
/* Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
 */
class CreateString {
    int first_number;
    int second_number;
    CreateString(int first, int second) {
        first_number = first;
        second_number = second;
    }

    StringBuilder SumNumbers() {
        StringBuilder summa = new StringBuilder();
        summa
                .append(first_number)
                .append(" + ")
                .append(second_number)
                .append(" = ")
                .append(first_number+second_number);
        return summa;
    }

    StringBuilder DifNumbers() {
        StringBuilder difference = new StringBuilder();
        difference
                .append(first_number)
                .append(" - ")
                .append(second_number)
                .append(" = ")
                .append(first_number-second_number);
        return difference;
    }

    StringBuilder MultyNumbers() {
        StringBuilder multiplication = new StringBuilder();
        multiplication
                .append(first_number)
                .append(" * ")
                .append(second_number)
                .append(" = ")
                .append(first_number*second_number);
        return multiplication;
    }

    String AnswerString() {
        StringBuilder answer_string = SumNumbers()
                .append("\n")
                .append(DifNumbers())
                .append("\n")
                .append(MultyNumbers());
        return String.valueOf(answer_string);
    }
}


     class Seminar2Task4 {
    public static void main(String[] args) {
        CreateString new_string = new CreateString(3,56);
        System.out.println(new_string.AnswerString());

    }
}
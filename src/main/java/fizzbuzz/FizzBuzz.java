package fizzbuzz;

public class FizzBuzz {
    public static String print(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "Fizz";
        if (number % 5 == 0)
            result += "Buzz";
        return result.isEmpty() ? String.valueOf(number) : result;
    }

    public static String printRange(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(print(i) + "\n");
        }
        return sb.toString();
    }
}

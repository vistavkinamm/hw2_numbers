public class hw2{
    public static void main(String[] args) {

        StringBuilder stringBuilder = numbersString(3, 56);
        System.out.println(stringBuilder);

        modifString(stringBuilder);
        System.out.println(stringBuilder);
        replaceModifString(stringBuilder);
        System.out.println(stringBuilder);
        result(args);
        System.out.println(args);

    }

    public static StringBuilder numbersString(int a, int b) {

        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        result.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }

    public static StringBuilder modifString(StringBuilder stringBuilder) {
        // int pos = stringBuilder.indexOf("=");
        // stringBuilder.deleteCharAt(pos);
        // stringBuilder.insert(pos, "равно");

        int pos;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, "равно");
        }
        return stringBuilder;

    }

    public static StringBuilder replaceModifString(StringBuilder stringBuilder) {
        int pos;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos, pos + 1, "равно");
        }
        return stringBuilder;
    }

    public static String stringConcatenation() {
        String s = "=";
        for (int i = 0; i < 1000; i++) {
            s = s + "=";
        }
        return s;
    }

    public static String stringBuilderConcatenation() {
        String s = "=";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void result(String[] args) {

        long start, end;
        start = System.currentTimeMillis();
        stringConcatenation();
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        stringBuilderConcatenation();
        end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}

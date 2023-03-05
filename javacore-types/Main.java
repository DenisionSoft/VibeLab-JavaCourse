public class Main {
    public static void main(String[] args) {
        final int hexLiteral = 0x9230;
        String hexLiteralString = String.format("%06d", hexLiteral);
        final long decLiteral = 89123456789L;
        String binLiteral = Integer.toBinaryString((int)(decLiteral % 100));
        String octLiteral = Integer.toOctalString((int)(decLiteral % 10000));
        int group = (13 - 1) % 26 + 1;
        char groupLetter = (char)(group + 64);

        System.out.println("ID number - " + hexLiteralString);
        System.out.println("Phone number - " + decLiteral);
        System.out.println("Last two in binary - " + binLiteral);
        System.out.println("Last four in octal - " + octLiteral);
        System.out.println("Modified group index - " + group);
        System.out.println("Letter for index - " + groupLetter);
    }
}

public class CRC {
    public static String divide(String dividend, String divisor) {
        int len = divisor.length();
        String temp = dividend.substring(0, len);
        StringBuilder remainder = new StringBuilder(temp);

        for (int i = len; i < dividend.length(); i++) {
            if (remainder.charAt(0) == '1') {
                for (int j = 1; j < len; j++) {
                    remainder.setCharAt(j - 1, (remainder.charAt(j) == divisor.charAt(j)) ? '0' : '1');
                }
                remainder.setCharAt(len - 1, dividend.charAt(i));
            } else {
                for (int j = 0; j < len - 1; j++) {
                    remainder.setCharAt(j, remainder.charAt(j + 1));
                }
                remainder.setCharAt(len - 1, dividend.charAt(i));
            }
        }
        return remainder.toString().substring(1);
    }

    public static void main(String[] args) {
        String data = "1101011011"; // Data bitstream
        String divisor = "1011";    // CRC divisor
        System.out.println("CRC Remainder: " + divide(data + "000", divisor)); // Data + zeros
    }
}

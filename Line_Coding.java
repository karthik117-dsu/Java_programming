class LineCoding {
    public static String nrzLineCoding(String data) {
        StringBuilder result = new StringBuilder();
        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String data = "110100101";
        System.out.println("NRZ Line Coding: " + nrzLineCoding(data));
    }
}

import java.util.*;

class Subnetting {
    public static void calculateSubnet(String ip, String subnetMask) {
        String[] ipParts = ip.split("\\.");
        String[] maskParts = subnetMask.split("\\.");
        StringBuilder ipBin = new StringBuilder();
        StringBuilder maskBin = new StringBuilder();
        
        for (int i = 0; i < 4; i++) {
            ipBin.append(String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(ipParts[i])))));
            maskBin.append(String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(maskParts[i])))));
        }

        String network = ipBin.substring(0, maskBin.indexOf("1")) + maskBin.substring(maskBin.indexOf("1"));
        System.out.println("Network Address: " + toDecimal(network));
    }

    private static String toDecimal(String binary) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String octet = binary.substring(i, i + 8);
            result.append(Integer.parseInt(octet, 2)).append(".");
        }
        return result.toString().substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        String ip = "192.168.1.15";
        String mask = "255.255.255.0";
        calculateSubnet(ip, mask);
    }
}

package br.pucrs;

public class karatsuba {
    public static String tsuba(String s1, String s2) {
        if (s1.length() == 1 || s2.length() == 1) {
            long c1 = Character.getNumericValue(s1.charAt(0));
            long c2 = Character.getNumericValue(s2.charAt(0));
            return Long.toBinaryString(c1 * c2);
        }
        int m1 = s1.length() / 2;
        int m2 = s2.length() / 2;
        String w = s1.substring(0, m1);
        String x = s1.substring(m1);
        String y = s2.substring(0, m2);
        String z = s2.substring(m2);

        String p1 = tsuba(w, y);
        String p2 = tsuba(x, z);
        String p3 = tsuba(addBinaryStrings(w, x), addBinaryStrings(y, z));

        String result = addBinaryStrings(
                addBinaryStrings(
                        shiftLeft(p1, 2 * (m1)),
                        shiftLeft(subtractBinaryStrings(p3, addBinaryStrings(p1, p2)), s1.length() - m1)
                ),
                p2
        );

        return result;
    }

    public static String addBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static String subtractBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, borrow = 0;

        while (i >= 0 || j >= 0) {
            int diff = (a.charAt(i--) - '0') - (j >= 0 ? b.charAt(j--) - '0' : 0) - borrow;
            if (diff < 0) {
                diff += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.append(diff);
        }

        return result.reverse().toString().replaceFirst("^0+(?!$)", "");
    }

    public static String shiftLeft(String s, int positions) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < positions; i++) {
            result.append('0');
        }
        return result.toString();
    }
}
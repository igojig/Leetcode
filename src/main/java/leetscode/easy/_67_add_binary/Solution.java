package leetscode.easy._67_add_binary;

public class Solution {
//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        int carry = 0;
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//
//        while (i >= 0 || j >= 0 || carry == 1) {
//            if (i >= 0)
//                carry += a.charAt(i--) - '0';
//            if (j >= 0)
//                carry += b.charAt(j--) - '0';
//            sb.append(carry % 2);
//            carry /= 2;
//        }
//        return sb.reverse().toString();
//    }

    public String addBinary(String a, String b) {
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int maxLen = Math.max(a.length(), b.length());
        int index = maxLen - 1;

        StringBuilder sb=new StringBuilder(maxLen+1);

        char[] arr = new char[maxLen];
        boolean overflow = false;

        while (indexA >= 0 || indexB >= 0) {
            char charA = indexA>=0? a.charAt(indexA):'0';
            char charB = indexB>=0? b.charAt(indexB):'0';

            if (overflow) {
                if (charA == '0' && charB == '0') {
                    arr[index] = '1';
                    overflow = false;
                } else if (charA == '1' && charB == '1') {
                    arr[index] = '1';
                } else {
                    arr[index] = '0';
                }
            } else {
                if (charA == '0' && charB == '0') {
                    arr[index] = '0';
                } else if (charA == '1' && charB == '1') {
                    arr[index] = '0';
                    overflow = true;
                } else {
                    arr[index] = '1';
                }
            }

            indexA--;
            indexB--;
            index--;
        }

        if(overflow){
            sb.append("1");
        }
        sb.append(arr);

        return sb.toString();
    }
}

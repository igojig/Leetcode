package leetscode.medium._443_string_compression;

public class Solution {
    public int compress(char[] chars) {


        int search = 0;
        int insertPos = 0;
        int index = 0;
        char[] digits;

        while (index < chars.length) {
            search = index;
            while (search + 1 < chars.length && chars[index] == chars[search + 1]) {
                ++search;
            }
            if (index != search) {
                digits = String.valueOf(search - index + 1).toCharArray();
                chars[insertPos] = chars[search];
                ++insertPos;
                for (char digit : digits) {
                    chars[insertPos] = digit;
//                    ++index;
                    ++insertPos;
                }
                index = search + 1;
            } else {
                chars[insertPos] = chars[search];
                ++index;
                ++insertPos;
            }

        }
        return insertPos;
    }

    public char[] IntToChars(int value){

        char[] result=new char[4];
        int index=0;
        int digit=0;
        while(value/10>0){
            digit=value%10;
            value=value/10;
            result[index]=(char)('0'+digit);
            ++index;
        }
        result[index]=(char)('0'+value);

        return result;

    }
}

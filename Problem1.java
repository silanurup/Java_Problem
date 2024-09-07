// https://leetcode.com/problems/string-compression/submissions/1382196194/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int compress(char[] chars) {
        int writePos = 0;
        int readPos = 0;

        while (readPos < chars.length) {
            char currentChar = chars[readPos];
            int count = 0;

            while (readPos < chars.length && chars[readPos] == currentChar) {
                readPos++;
                count++;
            }

            chars[writePos++] = currentChar;

            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[writePos++] = digit;
                }
            }
        }

        return writePos;
    }
}


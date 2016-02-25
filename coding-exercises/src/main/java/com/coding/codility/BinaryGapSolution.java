package com.coding.codility;

import org.junit.Assert;
public class BinaryGapSolution {
        public int solution(int N) {
            // write your code in Java SE 8
            if (N < 1) {
                throw new RuntimeException(String.format("Invalid input %1$d passed in", N));
            }
            char[] binaryCharArr = Integer.toBinaryString(N).toCharArray();

            int largestBinaryGap = 0;
            int countBinaryGap = 0;

            for (int i = 0; i <binaryCharArr.length; i++) {
                char charDigit = binaryCharArr[i];
                int digit = Character.getNumericValue(charDigit);


                if (digit == 1) {
                    if (countBinaryGap > largestBinaryGap) {
                        largestBinaryGap = countBinaryGap;
                    }
                    countBinaryGap = 0;
                }

                if (digit == 0) {
                    countBinaryGap++;
                }
            }

            return largestBinaryGap;
        }

    public static void main(String[] args) {
        BinaryGapSolution binaryGapSolution = new BinaryGapSolution();
        Assert.assertEquals(0, binaryGapSolution.solution(6));

        Assert.assertEquals(2, binaryGapSolution.solution(328));
        Assert.assertEquals(5, binaryGapSolution.solution(4545));
    }
}

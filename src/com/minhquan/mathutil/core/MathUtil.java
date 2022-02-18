/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhquan.mathutil.core;

/**
 *
 * @author Admins
 */
public class MathUtil {

    public static long getFactorial(int n) {   //Hàm tính giai thừa, ko có số âm, 0! = 1, 0<n<21 để tránh bị tràn

        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("Invalid n."
                    + "n must between 0-20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;

        }
        return product; 
    }

}

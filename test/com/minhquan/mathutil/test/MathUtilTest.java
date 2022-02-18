/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhquan.mathutil.test;

import static com.minhquan.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author quanq
 */
// nếu muốn sử dụng các Hàm STATIC
// -- Cách 1: gọi tên class.tên hàm static() truyền thống đó giờ
//          nhớ import packages... tên class chứa hàm static

// -- Cách 2: không gọi tên clas.tên hàm static() mà gọi tên hàm() một mình giống như C
//          nhớ import static packages...tên class.tên hàm static không ngoặc
//     hoặc                                       .* lấy tất cả các hàm() static

/**
 *
 * @author quanq
 */
public class MathUtilTest {

    // Test case #1: check getFactorial() with valid argumennt
    // n = 0 , expected = 1; actual = (chạy thử)
    // Test biến 1 hàm bất kì trong Class thành Main()
    @Test
    public void testFactorialGivenValidArgumentN0ReturnsWell() {
        long expected = 1; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFactorial(0);

        assertEquals(expected, actual);
        // Trong main() in ra kết quả của EXPECTED và ACTUAL
        // ta tự nhìn bằng mắt và so sánh
        // Bên JUnit nhìn bằng 2 màu
                // Xanh: khi EXPECTED và ACTUAL khớp nhau
                    // Đỏ: khi EXPECTED và ACTUAL không khớp
        // chạy bằng cách chuột phải -> run test
        // ko F6, nó sẽ chạy main()
    }

    // Test case #2: check getFactorial() with valid argumennt
    // n = 6 , expected = 720; actual = (chạy thử)
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFactorial(6);

        assertEquals(expected, actual);
        
    }
}

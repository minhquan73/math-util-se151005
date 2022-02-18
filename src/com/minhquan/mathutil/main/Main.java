/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhquan.mathutil.main;

import com.minhquan.mathutil.core.MathUtil;

/**
 *
 * @author Admins
 */
public class Main {

    public static void main(String[] args) {
        // kiểm thử = cách gọi hàm với data đưa vào, chaỵ và nhìn kết quả của hàm trả về (actual)
        // so sánh với cái ta hy vọng nó sẽ trả về (expected)
        // Ex: 5! -> expected = 120 nhưng thực tế hàm getFactorial(5) actual = ???
        // =>> so sánh expected vs actual

        // để đảm bảo hàm đúng ta phải chia các tr hợp/ nghĩ ra các tình huống hàm sẽ đc chạy, xài
        // -> nghĩ ra các bộ data đưa cho hàm -> hàm chạy -> output -> kết luận
        //MỖI BỘ DATA ĐƯA VÀO, MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MỤC ĐÍCH NÀO ĐÓ -> TA GỌI LÀ TEST CASE - TÌNH HUỐNG TEST
//        long expected = 120;
//        long actual = MathUtil.getFactorial(5);
//        System.out.println("0! - Expected: " + expected
//                                    + " - Actual: " + actual);
        //Test case#3 : check getFactorial() with valid argument
        // n=-5 -> expected = throw exception (lỗi)
        // expected = exception sẽ phải xuất hiện
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        System.out.println("0! - Expected: " + expected
                + " - Actual: " + actual);
        // xuất hiện ngoại lệ -> điều đáng mừng
        //5 phai ra 120, -5 ném ngoại lệ

    }

}

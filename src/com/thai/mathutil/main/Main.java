/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thai.mathutil.main;

import com.thai.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! expected: " + expected + "; actual: " + actual);
        //
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + "; actual: " + actual);
    }
    //viet code xong thi phai test code
    // test ngay từng hàm , từng class trước khi ráp chúng với các class khác
    //tét ngay khi xong hàm. xong class được gọi là test mưc độ 1, unit test(test mức đơn vị)
    // làm sao để test . có nhiều cách
    //1. cách 1: sout(gọi hàm) để xem in ra két quả của hàm
    //2. cách 2: JOptionPane để popup lên kết quả của hàm
    //3. cách 3: ghi ra LOG file, ra 1 trang web 
    //3 cách này đều phải dùng mắt để xem kết quả đúng sai
    //* đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE và ta thấy khớp bằng với giá trị mà ta mong đợi, ta tính được trước = tay
    // gọi là EXPECTED VALUE
    //* sai: test 6! = 720 , xui chạy ra ACTUAL = 120 => hàm xử lý sai
    //4. cách 4: máy oi so sanh giùm và kết luận luôn
    //nếu tất cả ddeuf đúng --> hàm đúng --> màu xanh
    //hầu hết tình huống chạy hàm đều đúng, có 1 cái sai --> hàm sai --> màu đỏ
    //muốn làm được điều này ta cần thư viện phụ trợ giúp cho java xanh đỏ
    // điều này cũng có bên c#,PHP,JS,RUBY...
    //đối với JAVA: JUnit, TestNG
    //          C#: NUnit, xUnit ,MSTest
    //          PHP: PHPUnit
    

}

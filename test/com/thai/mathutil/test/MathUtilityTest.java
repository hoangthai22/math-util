/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thai.mathutil.test;

import static com.thai.mathutil.MathUtility.*; //tao muon cac ham bien trong class nay
import java.sql.SQLException;
// go truc tiep k can class. chi static moi co dieu nay
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgurmentReturnsGoodResult() {
        int n = 5;
        long expected = 120;
        long actual = getFactorial(n);
        assertEquals(expected, actual);

        //minh test tiep cac truong hop khac, dung dau vao,dung dau ra
        //khoi can bien trung gian , coi luon trong lienh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(0));

    }
    //dieu gi xay neu ta dua vao tham so am , hoac >20
    //theo thiet ke cuar ham dua vao cà chớn se nem ra ngoai le 
    // va ta can test xem, ngoai le co dc nem ra ko neu ta ca chon
    // tuc la thay xuat hien ngoai le neu co ca chon dua vao -- > ham dung
    // thya ngoai le khi co cà chớn minh mung vi ham da dung

    @Test(expected = IllegalArgumentException.class)
    //khi chay ham nay nem ra ngoai le ten la Illegal...
    //neu dung no nem ra ngoai le cung ten ,code dung roi
    public void testFactorialWrongArgumentThrowsExeception() {
        // test tinh huong ham phai nem ra ngoai le neu tham so sai
        // ngoai le khong phai la value de so sanh, k dung assertEquals
        // ta phai dung chieu khac, JUnit 4 khac JUnit 5 o cho bat ngoai le
        // ki 5 di du thinh mon SWT301 cua tui: DI(Dependency Injection),Lambda, Expresssion lien 
        //quan den JUnit 5
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }

}

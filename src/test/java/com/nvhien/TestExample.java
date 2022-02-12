package com.nvhien;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestExample {
    Employee employee = new Employee(4.5, 1000l, 2, 10);

    @Before
    public void setUp() throws Exception {
        //connect to database
    }

    @After
    public void tearDown() throws Exception {
        //close connection
    }

    @Test
    public void getSalary() {
        long expectedResult = 4500;
        long actualResult = employee.getSalary();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getSalaryWithDayOff() {
        long expectedResult = 4200;
        long actualResult = employee.getSalaryWithDayOff();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getSalaryWithOT() {
        long expectedResult = 4650;
        long actualResult = employee.getSalaryWithOT();
        Assert.assertEquals(expectedResult, actualResult);
    }
}

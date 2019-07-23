package com.example.myjar;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyJarTest {
    @Test
    public void sayHello() throws Exception {
        new MyJar().sayHello("world");
    }
}
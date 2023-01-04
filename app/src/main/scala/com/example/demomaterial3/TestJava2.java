package com.example.demomaterial3;

import java.io.File;
import java.io.IOException;

public class TestJava2 {
    String hello() throws IOException {
        new File("xxx").getCanonicalPath();
        return "hello java";
    }
}

package com.example.demo.basics;

import java.io.File;
import java.util.HashMap;

public class HashCodeTest {

    public static void main(String[] args) {

            File file = new File("报表查询数据对应表和字段.docx");
            String fileName = file.getName();
            String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
            System.out.println(suffix);


    }
}

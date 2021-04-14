package com.example.demo.design.patterns.decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/4/13 9:40 上午
 */
public class InputStreamStudy {


    public static void main(String[] args) throws FileNotFoundException {
        InputStream  in = new FileInputStream("test");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);



    }
}

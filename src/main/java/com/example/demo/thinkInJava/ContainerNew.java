package com.example.demo.thinkInJava;


import java.util.*;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 9:28 PM
 * @Description: 具有泛型的容器类
 */
public class ContainerNew {

    public static <K, V> Map<K, V> getMap() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> getList() {

        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> getLinklist() {

        return new LinkedList<T>();
    }

    public static <T> Set<T> getSet() {

        return new HashSet<T>();
    }

    public static <T> Queue<T> getQueue() {

        return new LinkedList<T>();
    }
}

package com.example.demo.thinkInJava;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 9:15 PM
 * @Description: coffee  咖啡对象生成器。
 */
public class CoffeeGenerator  implements Generator<Coffee>, Iterable<Coffee>{



    @Override
    public Coffee next() {
        return null;
    }



    @Override
    public Iterator<Coffee> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Coffee> action) {

    }

    @Override
    public Spliterator<Coffee> spliterator() {
        return null;
    }
}

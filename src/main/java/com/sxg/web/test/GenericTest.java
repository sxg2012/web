package com.sxg.web.test;

/**
 * Created by shaoxiangen 2018/2/3
 */
public class GenericTest {


}

class GenericOne{

    public <T> T get(String s) {
        return new GenericTwo().<T>query(s);
    }
}

class GenericTwo {
    public <T> T query(String s){

        return (T)s;
    }
}

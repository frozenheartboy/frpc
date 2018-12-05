package com.frozen.frpc.client;

import org.junit.Test;

/**
 * @author frozen
 * @since 18-12-6
 **/
public class MyTest {
    @Test
    public void test() {
        System.out.println(String.format("123f %s",MyEnum.QQQ));
    }

    enum MyEnum {
        QQQ,
        WWW
    }
}

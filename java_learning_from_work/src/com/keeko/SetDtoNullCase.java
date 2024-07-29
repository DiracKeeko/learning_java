package com.keeko;

import com.keeko.entity.FundResDto;

public class SetDtoNullCase {
    public static void main(String[] args) {
        FundResDto res = new FundResDto();
        res.setId("111");

        // 下面这2种情况 不会导致 NullPointerException
        // v1
        String name = res.getName();
        System.out.println("name: " + name); // name: null

        // v2
        res.setName(null);
        System.out.println(res); // FundResDto{id='111', name='null', m1Return=null}

        // 但是下面这种情况会报空指针异常
        // FundResDto res2 = null;
        // res2.getName(); // null.getName() 这里空指针了
    }
}

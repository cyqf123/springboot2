package com.test;


import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        List list=new ArrayList();
        list.add("lwx");
        list.add(1,"yrc1");
        list.add(2,"yrc2");
        list.add(3,"yrc3");
        list.add(1,"插队了");//类似插队，后面的都向后拍

        for (Object o : list) {
            System.out.println(o);
        }

        list.addAll(2,list);//添加一个集合到指定位置后面的元素后移
        list.indexOf("lwx");//获取第一次出现该值的索引
        list.lastIndexOf("lwx");//获取最后一个该值的索引
        list.remove(1);//移除指定位置元素
        list.get(2);//根据索引得到值
        list.set(0, "lx");//替换指定位置的元素
        list=list.subList(0,2);//获取指定片段，前闭后开路径
        list.toArray();//集合转为数组，顺序不变
        list.clear();

    }

    @Test
    public void test2() throws JSONException {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime e = LocalDateTime.now();
        LocalDateTime s= e.minusDays(30);
        String end = df.format(e);
        String start=df.format(s);
        System.out.println(start);
        System.out.println(end);

        
    }



    @Test
    public void test3() throws JSONException {
        int i=1,j=0;
        switch (i){
            case 2:j++;
            default:j+=2;
            case 0:j+=4;
        }
        System.out.println("J="+j);


    }



}

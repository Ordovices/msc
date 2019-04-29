package com.github.msc;

import io.swagger.models.auth.In;
import org.assertj.core.util.Lists;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class tests {
    static String tags=";";




    public static void main(String[] args) {

//        List<String> strings =new ArrayList<>();
//
//        List<String> ss=   strings.stream().filter(s -> s.equals("1")).collect(Collectors.toList());
//        System.out.println(ss);

//
//        if(tags != null && tags.trim().length() > 0 ){
//          String s=  tags.substring(1);
//            String[] tagArray=s.split(";");
//            List list=   Arrays.asList(tagArray);
//            System.out.println(list);
//        }

//        List<String> p1 = Lists.newArrayList("1","2","3","4");
//
//        List<String> p2 = Lists.newArrayList("1","4");
//        p1.removeAll(p2);
//
//        System.out.println(p2);
//
//        System.out.println(p1);


        List<String> p1 = Lists.newArrayList();

        List<String> p2 = p1.stream().map(String::trim).collect(Collectors.toList());



        String s=  MessageFormat.format("统货更新场次起拍价失败:{0},{1}", "545","sasdja");
        System.out.println(s);

       System.out.println(p1);
    }
}


/**
 *
 *
 *  QuotationRecyclerQuoted quoted = recyclerQuoteds.stream().
 *                 max(Comparator.comparing(QuotationRecyclerQuoted::getQuotationRecyclerQuotedPrice)
 *                 ).get();
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * **/
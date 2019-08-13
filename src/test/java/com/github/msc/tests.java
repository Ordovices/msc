package com.github.msc;

import io.swagger.models.auth.In;
import org.assertj.core.util.Lists;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

public class tests {
    static String tags=";";




    public static void main(String[] args) {
String s = "eeqwe";
String dd=s.concat("中——").concat("312312313");
System.out.println(dd);
    }

    public int[] twoSum(int[] nums, int target) {

        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int expect = target - temp;
            if (map.containsKey(expect)&&(int)map.get(expect)!=i) {
                return new int[]{i, (int) map.get(expect)};
            } else {
                map.put(temp, i);
            }
        }
        return new int[]{};
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
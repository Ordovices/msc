package com.github.msc;

public enum EnumQuotationProductSaleWay {

    定价销售(1),
    暗拍(10),
    明拍(60),
    统货暗拍(20),
    统货明拍(80),
    秒杀(70);

    private int value;

    EnumQuotationProductSaleWay(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EnumQuotationProductSaleWay matchByValue(Integer value) {
        if (value == null) {
            return null;
        }
        EnumQuotationProductSaleWay[] saleWayArray = EnumQuotationProductSaleWay.values();
        for (EnumQuotationProductSaleWay saleWay : saleWayArray) {
            if (value.equals(saleWay.getValue())) {
                return saleWay;
            }
        }
        return null;
    }

}

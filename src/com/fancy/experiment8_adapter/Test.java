package com.fancy.experiment8_adapter;

import com.fancy.experiment8_adapter.XMLUtil;

public class Test {
    public static void main(String[] args) {
        Cipher cipher = (Cipher) XMLUtil.getBean();
        cipher.encipher("加密字符串");
        cipher.decipher("解密字符串");
    }

}

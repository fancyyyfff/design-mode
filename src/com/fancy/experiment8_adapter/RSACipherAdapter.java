package com.fancy.experiment8_adapter;

public class RSACipherAdapter extends DESEncoder implements Cipher{
    @Override
    public String encipher(String str) {
        return encrypted(str);
    }

    @Override
    public String decipher(String buf) {
        return decrypted(buf);
    }
}

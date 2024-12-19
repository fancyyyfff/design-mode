package com.fancy.experiment8_adapter;

public class DESCipherObjectAdapter implements Cipher{
    private DESEncoder desEncoder;

    @Override
    public String encipher(String str) {
        return desEncoder.encrypted(str);
    }

    @Override
    public String decipher(String buf) {
        return desEncoder.decrypted(buf);
    }
}

package com.fancy.experiment8_adapter;

public class RSACipherObjectAdapter implements Cipher{
    private RSAEncoder rsaEncoder;

    public RSACipherObjectAdapter(RSAEncoder rsaEncoder) {
        this.rsaEncoder = rsaEncoder;
    }

    @Override
    public String encipher(String str) {
        return rsaEncoder.encoded(str);
    }

    @Override
    public String decipher(String buf) {
        return rsaEncoder.decoded(buf);
    }
}

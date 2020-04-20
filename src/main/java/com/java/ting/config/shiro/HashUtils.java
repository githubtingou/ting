package com.java.ting.config.shiro;

import org.apache.shiro.codec.CodecException;
import org.apache.shiro.crypto.UnknownAlgorithmException;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * shiro密码加密 测试123456
 *
 *
 * @author LISHUANG
 * @date 2020/2/5
 */
public class HashUtils extends SimpleHash {

    // 加密方式
    public static final String ALGORITHM_NAME = "MD5";

    public HashUtils(String algorithmName) {
        super(ALGORITHM_NAME);
    }

    public HashUtils(String algorithmName, Object source) throws CodecException, UnknownAlgorithmException {
        super(ALGORITHM_NAME, source);
    }

    public HashUtils(String algorithmName, Object source, Object salt) throws CodecException, UnknownAlgorithmException {
        super(ALGORITHM_NAME, source, salt);
    }

    public HashUtils(String algorithmName, Object source, Object salt, int hashIterations) throws CodecException, UnknownAlgorithmException {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static void main(String[] args) {
        String source = "123456";
        String salt = "tingou";
        System.out.println(new HashUtils(null, source, salt));
    }

}

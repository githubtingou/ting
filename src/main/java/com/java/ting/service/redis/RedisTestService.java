package com.java.ting.service.redis;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * redis测试
 *
 * @author LISHUANG
 * @date 2020/1/2
 */
@Service
public class RedisTestService {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    /**
     * string 添加操作
     *
     * @param value 添加key的值
     * @return {@link ResponseVo} 添加后的值
     */
    public ResponseVo redisAddTest(String value) {
        redisTemplate.opsForValue().set("name", value);
        Map<String, String> map = new HashMap<>();
        map.put("name", value);
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE, map);
    }

    /**
     * 根据key获取对应的value
     *
     * @param key key
     * @return {@link ResponseVo} 根据key获取对应的value
     */
    public ResponseVo redisGetTest(String key) {
        Object redisName = redisTemplate.opsForValue().get(key);
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE, redisName);
    }

    /**
     * 添加list
     *
     * @return {@link ResponseVo} 根据key获取对应的list
     */
    public ResponseVo redisAddTest() {
        String key = "list";
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        redisTemplate.opsForValue().set(key, list);
        Map<String, List<Object>> map = new HashMap<>();
        map.put(key, list);
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE, map);
    }
}

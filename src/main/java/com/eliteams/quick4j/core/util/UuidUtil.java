package com.eliteams.quick4j.core.util;

/**
 * @author RisingSun
 * @date 2020/8/8 8:27
 */
import java.util.UUID;

/**
 * 产生UUID随机字符串工具类
 */
public final class UuidUtil {
    private UuidUtil(){}
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
    /**
     * 测试
     */
    public static void main(String[] args) {
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
    }
}

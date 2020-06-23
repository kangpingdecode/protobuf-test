package com.kangping.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * <p>
 * 功能：
 * </p>
 *
 * @author kangping
 * Copyright Inc. All rights reserved
 * @version v1.0
 * @ClassName: Test
 * @date 2020/6/23
 */

public class Test {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        // 通过链式风格创建user对象
        UserProtos.User user =  UserProtos.User.newBuilder().setName("kp").setAge(300).build();
        byte[] bytes = user.toByteArray();
        // 序列化后的字节数组长度
        System.out.println(bytes.length);
        // 打印字节数组的值
        for (byte bytee: bytes){
            System.out.print(bytee+" ");
        }
        System.out.println("");
        // 反序列打印age
        UserProtos.User parse = UserProtos.User.parseFrom(bytes);
        System.out.println(parse.getAge());
    }
}

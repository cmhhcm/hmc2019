package com.hmc.domain.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

/**
 * Author:meice Huang
 * Time: 2019-12-01 20:50
 */
public class RedisJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");//localhost
        System.out.println("连接成功！");
        //查看服务是否运行？
        System.out.println(jedis.ping());
        String hmc = jedis.get("hmc");
        System.out.println(hmc);

        Jedis jedis1 = new Jedis("116.62.65.219",6379,true);
        System.out.println(jedis1.ping());

    }
}

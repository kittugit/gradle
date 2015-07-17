package org.yazh.rest;
import redis.clients.jedis.*;

public class RedisApp {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.99.100", 32768);
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.println("value"+value);
    }
}


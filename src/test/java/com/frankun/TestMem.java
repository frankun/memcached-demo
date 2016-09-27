package com.frankun;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.junit.Test;

/**
 * Created by frankun on 2016/9/27.
 */

/**
 * 测试memcached能否连接成功
 */
public class TestMem {
    @Test
    public void testIt(){
        try {
            MemcachedClient client = new XMemcachedClient("127.0.0.1", 11211);
            String testVal = "this is a test demo.";
            client.set("test_key", 10, testVal);
//            Thread.sleep(5000);
            System.out.println("=================" + client.get("test_key"));
//            Thread.sleep(15000);
//            System.out.println("=================" + client.get("test_key"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TimeoutException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MemcachedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


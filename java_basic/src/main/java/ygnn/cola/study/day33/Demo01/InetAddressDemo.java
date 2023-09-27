package ygnn.cola.study.day33.Demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Cola0817
 * @name InetAddressDemo
 * @date 2023/9/27 11:53
 * @since 1.0.0
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println("address.getHostName() = " + address.getHostName());
        System.out.println("address.getHostAddress() = " + address.getHostAddress());
    }
}

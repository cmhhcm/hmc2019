import org.junit.Test;

/**
 * Author:meice Huang
 * Time: 2019-12-20 15:23
 */
public class UtilsTest {
    /**
     * IP地址过滤
     */

    @Test
    public void testIpCompare(){
        String ip1 = "172.29.39.189";
        String ip2 = "172.35.34.234";
        String ip3 = "172.16.45.234";
        System.out.println(ip1.compareTo("172.16"));
        System.out.println(ip2.compareTo("172.32"));

    }

}

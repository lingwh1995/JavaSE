package structure.bridge.bridge_g;

/**
 * 使用Email的方法发送消息
 * @author ronin
 * @version V1.0
 * @since 2019/8/6 9:14
 */
public class MessageEmail {

    /**
     * 发送消息
     * @param message
     * @param toUer
     */
    public void send(String message, String toUer) {
        System.out.println("使用邮件的方法发送消息"+message+"给"+toUer);
    }
}

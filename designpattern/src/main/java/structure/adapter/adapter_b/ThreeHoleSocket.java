package structure.adapter.adapter_b;

/**
 * @author ronin
 * @version V1.0
 * @desc 三孔插座
 * @since 2019/7/9 14:43
 */
public interface ThreeHoleSocket {
    /**
     * 参数分别为火线live，零线null，地线earth
     * @param l
     * @param n
     * @param e
     */
    public void electrify(int l, int n, int e);
}

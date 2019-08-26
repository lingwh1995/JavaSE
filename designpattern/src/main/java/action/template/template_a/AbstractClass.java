package action.template.template_a;

/**
 * 定义模板方法、原语操作等的抽象类
 * @author ronin
 * @version V1.0
 * @since 2019/8/26 11:16
 */
public abstract class AbstractClass {

    /**
     * 原语操作1，所谓原语操作就是抽象的操作，必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语操作2
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}

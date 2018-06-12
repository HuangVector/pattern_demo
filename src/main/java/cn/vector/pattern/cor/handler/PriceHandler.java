package cn.vector.pattern.cor.handler;

/**
 * 价格处理人，负责处理客户折扣申请
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 11:00
 */
public abstract class PriceHandler {
    /**
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }
    /**
     * 处理折扣申请
     */
    public abstract void processDiscount(float discount);
}

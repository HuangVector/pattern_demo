package cn.vector.pattern.cor.handler;

/**
 * 销售，可以批准5%以内的折扣
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 14:38
 */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        }else{
            successor.processDiscount(discount);
        }

    }
}

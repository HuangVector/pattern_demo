package cn.vector.pattern.cor.handler;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 16:40
 */
public class PriceHandlerFactory {
    /**
     * 创建PriceHandler的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler(){
        PriceHandler sales = new Sales();
        PriceHandler ld = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(ld);
        ld.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);
        return sales;
    }
}

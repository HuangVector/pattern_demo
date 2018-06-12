package cn.vector.pattern.cor;

import cn.vector.pattern.cor.handler.PriceHandler;
import cn.vector.pattern.cor.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户， 请求折扣
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-12 16:18
 */
public class Customer {
    private PriceHandler priceHandler;
    public  void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }


    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        Random rand = new Random();
        for(int i = 1; i <= 100; i++){
            System.out.print(i+":");
            customer.requestDiscount(rand.nextFloat());
        }
    }
}

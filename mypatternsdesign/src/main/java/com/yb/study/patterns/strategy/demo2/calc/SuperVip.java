package com.yb.study.patterns.strategy.demo2.calc;


import com.yb.study.patterns.strategy.demo2.PriceRegion;

/**
 * @author YBl
 */
@PriceRegion(min=20000,max=30000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.8;
    }
}

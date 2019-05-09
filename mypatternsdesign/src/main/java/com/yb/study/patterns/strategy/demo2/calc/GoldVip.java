package com.yb.study.patterns.strategy.demo2.calc;


import com.yb.study.patterns.strategy.demo2.PriceRegion;

/**
 * @author YBl
 */
@PriceRegion(min=3000)
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.7;
    }
}

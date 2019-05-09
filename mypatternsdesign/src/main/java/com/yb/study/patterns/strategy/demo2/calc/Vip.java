package com.yb.study.patterns.strategy.demo2.calc;


import com.yb.study.patterns.strategy.demo2.PriceRegion;

/**
 * @author YBl
 */
@PriceRegion(max=20000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.9;
    }
}

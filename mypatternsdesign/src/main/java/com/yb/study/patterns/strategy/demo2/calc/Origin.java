package com.yb.study.patterns.strategy.demo2.calc;


import com.yb.study.patterns.strategy.demo2.PriceRegion;

/**
 * @author YBl
 */
@PriceRegion(max = 10000)
public class Origin implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}

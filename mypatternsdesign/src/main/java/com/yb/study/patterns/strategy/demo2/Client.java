package com.yb.study.patterns.strategy.demo2;

/**
 * @author YBl
 */
public class Client {

    public static void main(String[] args) {
        Player player = new Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(20000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(40000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }

}

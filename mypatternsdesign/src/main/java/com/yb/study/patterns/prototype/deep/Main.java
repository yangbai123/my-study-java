package com.yb.study.patterns.prototype.deep;

/**
 * Created by YB .
 */
public class Main {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            //如果没有重写clone方法，则是浅复制，就不科学了。
            System.out.println( qiTianDaSheng.jinGuBang == clone.jinGuBang);

        } catch (Exception e) {
            e.printStackTrace();
        }
//        QiTianDaSheng q = new QiTianDaSheng();
//        QiTianDaSheng n = q.copy(q);
//        System.out.println(q.jinGuBang == n.jinGuBang);

    }

}

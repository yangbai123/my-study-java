package com.yb.study.patterns.prototype.simple;

import java.util.ArrayList;

/**
 * Created by YB .
 */
public class Prototype implements Cloneable {

    public String name;

    CloneTarget target = null;

    public ArrayList<CloneTarget> list;
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


}

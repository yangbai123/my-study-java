package com.yb.study.patterns.decorator.demo2;

/**
 * 具体的四年级成绩
 * @author YBl
 */
public class FourthGradeSchoolReport implements SchoolReport {

    public void report(){
        System.out.println("尊敬的YB家长");
        System.out.println("成绩如下");
        System.out.println("语文 87");
        // ...
    }

    public void sign(String name){
        System.out.println("家长签名为："+name);
    }

}

package com.yb.study.patterns.decorator.demo2;

/**
 * @author YBl
 *
 */
public class Father {

    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr;
        //原装的成绩单
        sr = new FourthGradeSchoolReport();
        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 加了排名的说明
        sr = new SortScoreDecorator(sr);
        //看成绩单
        sr.report();
        sr.sign("YB");
    }

}

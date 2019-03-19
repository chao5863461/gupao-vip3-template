package com.gupaoedu.vip.pattern.template.cource;

public class BigDataCourse extends NetworkCourse{

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    protected boolean needHomeword(){
        return this.needHomeworkFlag;
    }
}

package com.gupaoedu.vip.pattern.template.cource;

/**
 * 模板会有一个或多个未实现方法
 * 而且这几个未实现方法有固定的执行顺序
 */
public abstract class NetworkCourse {

    protected final void createeCourse(){

        //1.发布预习资料
        this.publishRecource();
        //2.制作PPT课件
        this.createPPT();
        //3.在线直播
        this.liveVideo();
        //4.提交作业,课堂笔记
        this.postNot();
        //5.提交源码
        this.postSource();
        //6.布置作业，有些科有作业，有的课没用作业
        //如果有作业，检查作业，没用，则完成，所以需要子类去根据情况自己实现
        if(needHomework()){
            checkHomework();
        }

    }
    abstract void checkHomework();

    protected boolean needHomework() {
        return false;
    }

    final void postSource(){
        System.out.println("提交源码");
    }

    final void postNot(){
        System.out.println("提交笔记");
    }

    final  void liveVideo(){
        System.out.println("直播授课");
    }

    final void createPPT(){
        System.out.println("制作PPT");
    }

    final void publishRecource(){
        System.out.println("发布预习资料");
    }
}

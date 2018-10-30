package com.example.cctread;

/**
 * @Auther: caic
 * @Date: 2018/10/11 11:15
 * @Description:
 * @Version: 1.0
 */

/**
 * Java8 简洁的匿名内部类使用Demo
 * Created by wangyingjie1 on 2017/2/23.
 */
public class ExecuteHelper {

    public static void execute(Execute execute) {
        execute.doExecute();
    }

    /**
     * 带有返回值得执行方法、可以实现代码的静态织入
     *
     * @param execute
     * @param umpKey
     * @param <T>
     * @return
     */
    public static <T> T execute(Execute execute, String umpKey) {
        System.out.println("start========" + umpKey);
        try {
            return (T) execute.doExecute(7);
        } catch (Exception e) {
            System.out.println("umpKey===>" + umpKey);
        }
        System.out.println("end========" + umpKey);

        return null;
    }

    private interface Execute {
        Object doExecute(int i);
    }

    //测试匿名内部类的使用方式
    public static void main(String[] args) {

//        ExecuteHelper.execute(() ->
//            Study.print()
//        );
//        ExecuteHelper.execute(() -> Study.print());
       String test= ExecuteHelper.execute(() -> Study.sayHello("zhangsan"),"sss");
        System.out.println(test);
        //String xxx = ExecuteHelper.execute(() -> Study.print(), "xxx");
        String execute = ExecuteHelper.execute(() -> {System.out.println();Study.sayHello("zhangsan")}, "zzz");

        //System.out.println(xxx + "==========" + execute);
    }

    public static class Study {
        public static String print() {
            System.out.println("Hello world*******");
            return "中国";
        }

        public static String sayHello(String userName) {
            System.out.println("say Hello *******" + userName);
            return "龙的传人";
        }
    }
}


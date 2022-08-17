/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo5;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 16:40
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Worker extends Person{

    private String workId;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }


    public Worker(String name, int age ) {
        super(name,age);
    }


    public void work(){
        System.out.println("我爱工作");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workId='" + workId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.reflect;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 10:42
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class User{
    // Field
    int no;
    private String name;


    // Constructor

    public User(){}
    public User(int no){
        this.no = no;
    }

    // Method
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

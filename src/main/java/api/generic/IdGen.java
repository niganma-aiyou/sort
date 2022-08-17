/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.generic;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/15 15:06
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class IdGen <T>{
    protected T id;

    public  IdGen(T id){
        this.id = id ;
    }

    static class User extends  IdGen<Integer>{
        public User(Integer id){
            super(id);
        }
    }

    public static void main(String[] args) {
        IdGen idGen = new IdGen<>(1);
        System.out.println(idGen);

        User user = new User(1);
        System.out.println(user);
    }
}

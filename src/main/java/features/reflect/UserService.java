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
 * @date 2022/8/17 13:56
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class UserService {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean login(String username,String password){
        return username == getUsername()&& password ==getPassword();
    }
}

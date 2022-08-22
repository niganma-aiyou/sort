/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.pool;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/22 11:16
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
import lombok.Data;

import java.io.Serializable;

@Data
class UserBean implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -321995474641098444L;

    private int id;
    private String userName;
    private String sex;


}




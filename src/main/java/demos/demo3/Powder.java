/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo3;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 15:16
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Powder {
    private String name;
    private Integer quantity;
    private Boolean likeSoup;

    public Powder(String name , int quantity, boolean likeSoup){
        this.name = name;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public Powder(String name , int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public Powder(){
        name = "酸辣面";
        quantity = 2;
        likeSoup = true;
    }

    public String checkResult(){
        if (likeSoup == null){
            return name+quantity+"两,不知道带不带汤";
        }else if (Boolean.TRUE.equals(likeSoup)){
            return name+quantity+"两,带汤";
        }else {
            return name+quantity+"两,不带汤";
        }
    }
}

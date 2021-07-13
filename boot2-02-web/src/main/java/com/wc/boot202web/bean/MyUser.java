package com.wc.boot202web.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/8 16:57
 * @since JDK 1.8+
 */
@Data
@ToString
public class MyUser implements Serializable {

    private String usr;
    private String pwd;
    private Phone phone;

}



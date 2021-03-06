package com.wc.boot202web.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
public class MyUser implements Serializable {

    private String usr;
    private String pwd;
    private Phone phone;

    public MyUser(String usr, String pwd) {
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "usr='" + usr + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

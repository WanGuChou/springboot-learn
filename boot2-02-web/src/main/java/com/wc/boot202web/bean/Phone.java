package com.wc.boot202web.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Phone implements Serializable {
    private String prefix;
    private String subfix;
}

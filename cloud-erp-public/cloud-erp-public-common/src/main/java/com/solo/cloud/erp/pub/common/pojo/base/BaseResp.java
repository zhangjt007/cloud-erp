package com.solo.cloud.erp.pub.common.pojo.base;

import lombok.Data;

import java.io.Serializable;
@Data
public class BaseResp implements Serializable {
    private String version;
    private String systemId;
    private String respCode;
    private String respMsg;
}

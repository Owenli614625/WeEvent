package com.webank.weevent.governance.enums;

import lombok.Getter;

@Getter
public enum DatabaseTypeEnum {

    H2_DATABASE(1, "h2 database"),
    MYSQL_DATABASE(2, "mysql database");

    private Integer code;
    private String value;

    DatabaseTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getValueByCode(Integer code) {
        for (DatabaseTypeEnum isDeleteEnum : DatabaseTypeEnum.values()) {
            if (isDeleteEnum.code.equals(code)) {
                return isDeleteEnum.value;
            }
        }
        return null;
    }


}
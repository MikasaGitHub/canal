package com.example.canal.service;

import java.util.Map;

/**
 * @author hongjiangming
 * @date 2022/1/26 5:28 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public interface BusinessRouter {
    void processHandler(String database, String tableName, String operatingType, Map columns);
}

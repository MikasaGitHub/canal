package com.example.canal.service.impl;

import com.example.canal.service.BusinessRouter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author hongjiangming
 * @date 2022/1/26 5:29 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Component
@Slf4j
public class BusinessRouterImpl implements BusinessRouter {

    @Override
    public void processHandler(String database, String tableName, String operatingType, Map columns) {

    }

}

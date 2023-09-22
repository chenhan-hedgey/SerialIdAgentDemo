package org.tools.mockAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Author: chenhan
 * @Description: API调用这
 * @ProjectName: devtools
 * @Date: 2023/8/29 15:22
 */
public class ApiCaller {
    private static final Logger logger = LoggerFactory.getLogger(ApiCaller.class);
    /**
     * 基本调用
     * @param params
     * @return
     */
    private static String call(String[] params){
        logger.info("param = {}",Arrays.toString(params));
        return "模拟API调用{String[]}";
    }

    /**
     * 全面调用
     * @param params
     * @param anotherParam
     * @return
     */
    private static String call(String[] params,String[] anotherParam){
        logger.info("param = {},anotherParam = {}", Arrays.toString(params),Arrays.toString(anotherParam));
        return "模拟API调用{String[],String[]}";
    }


    public static String mockCall(String[] params){
        return call(params);
    }

}

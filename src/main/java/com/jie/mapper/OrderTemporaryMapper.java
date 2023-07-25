package com.jie.mapper;

import com.jie.pojo.OrderTemporary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jie
 * @create 2023/7/24 9:31
 */
@Mapper
@Repository
public interface OrderTemporaryMapper {
    /**
     * 分页查询临时订单
     * @param start 开始
     * @param count 每次查询数量
     * @param key 字段
     * @param value 字段值
     * @return 临时订单集合
     */
    List<OrderTemporary> queryOrderTemporaryPaging(String start, String count, String key, String value);

    /**
     * 临时订单数量
     * @param key 字段
     * @param value 字段值
     * @return 数量
     */
    int queryOrderTemporaryCount(String key, String value);
}

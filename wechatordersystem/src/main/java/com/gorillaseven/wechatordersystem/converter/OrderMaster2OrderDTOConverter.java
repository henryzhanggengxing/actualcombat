package com.gorillaseven.wechatordersystem.converter;

import com.gorillaseven.wechatordersystem.dto.OrderDTO;
import com.gorillaseven.wechatordersystem.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Desc
 * @ClassName OrderMaster2OrderDTOConverter
 * @Date 2019/5/31 16:28
 * @Created by Mr.Zeng
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasters) {
        return orderMasters.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}

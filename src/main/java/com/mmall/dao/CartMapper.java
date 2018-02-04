package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@Param("userID") Integer userID,@Param("productId") Integer productId);

    List<Cart> selectCartByUserId(@Param("userID")Integer userId);

    int selectCartProductCheckedStatusByUserId(@Param("userID")Integer userId);

    int deleteByUserIdProductIds(@Param("userID") Integer userId,@Param("productIdList") List<String> productIdList);

    int checkOrUncheckedProduct(@Param("userID") Integer userID, @Param("checked") Integer checked,@Param("productId") Integer productId);

    int selectCartProductCount(@Param("userID") Integer userID);

}
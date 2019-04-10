package com.sen.mapper;

import com.sen.modal.Pool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 8:20 PM  2018/12/17
 */
@Mapper
public interface ResPoolMapper {
    @Select("select * from RES_POOL where id = #{id}")
    Pool selectPool(String id);
}

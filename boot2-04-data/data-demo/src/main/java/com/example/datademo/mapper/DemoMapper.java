package com.example.datademo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

/**
 * @author new
 */
@Mapper
public interface DemoMapper {
	@Select("select  CURRENT_TIMESTAMP from  dual ")
	Date now();

	@Select("select  2 from  dual ")
	Boolean flag();
}

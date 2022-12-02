package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HGD
 * @create 2022-11-28 16:09
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}

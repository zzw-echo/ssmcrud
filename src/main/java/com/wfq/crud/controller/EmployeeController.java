package com.wfq.crud.controller;

import com.wfq.crud.bean.Employee;
import com.wfq.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 处理员工CRUD请求
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    /**
     * 查询员工数据（分页查询）
     * @return
     */
    @RequestMapping("/emps")
    public String getEmps(){

        List<Employee> emps = employeeService.getAll();
        return "list";
    }

}

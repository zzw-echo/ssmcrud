package com.wfq.crud.test;

import com.wfq.crud.bean.Employee;
import com.wfq.crud.dao.DepartmentMapper;
import com.wfq.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * 测试dao层工作
 * Spring的项目可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class mapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    /**
     * 测试DepartmentMapper
     */
    @Test
    public void testCRUD(){

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

/*        //1、创建SpringIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从容器中获取mapper
        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);*/

        //测试mapper是否自动注入
//        System.out.println(departmentMapper);

        //1、插入/删除部门
//        departmentMapper.insertSelective(new Department(null,"测试"));
//        departmentMapper.insertSelective(new Department(null,"测试2"));
//        departmentMapper.deleteByPrimaryKey(3);

        //2、生成员工数据，测试员工插入
//        employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@aaa.aaa",1));


        //3、批量插入多个员工；使用可执行批量操作的sqlSession
        /*for(){    //for循环并非批量，是插入1000次，而sqlsession是预编译sql，然后修改参数进行插入
            employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@aaa.aaa",1));
        }*/
        String uid = "initUid";
        int rid1 = 666;
        int rid2 = 666;
        for (int i = 0; i < 1000; i++) {
            uid = UUID.randomUUID().toString().substring(0, 5)+i;
            rid1 = (int)(1+Math.random()*(2-1+1));
            rid2 = (int)(1+Math.random()*(2-1+1));
            mapper.insertSelective(new Employee(null,uid,(rid1==1)?("M"):("W"),uid+"@aaa.aaa",rid2));
        }



        //4、删除所有员工
//        mapper.deleteByExample(null);
        


    }

}

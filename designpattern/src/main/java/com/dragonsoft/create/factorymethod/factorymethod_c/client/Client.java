package com.dragonsoft.create.factorymethod.factorymethod_c.client;

import com.dragonsoft.create.factorymethod.factorymethod_c.domain.User;
import com.dragonsoft.create.factorymethod.factorymethod_c.factory.MysqlFactory;
import com.dragonsoft.create.factorymethod.factorymethod_c.factory.OracelFactory;
import com.dragonsoft.create.factorymethod.factorymethod_c.service.IUserService;
import com.dragonsoft.create.factorymethod.factorymethod_c.service.UserServiceMysql;
import com.dragonsoft.create.factorymethod.factorymethod_c.service.UserServiceOracle;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //不使用工厂方法模式
        UserServiceOracle userServiceOracle = new UserServiceOracle();
        User oracle = userServiceOracle.get(1);

        UserServiceMysql userServiceMysql = new UserServiceMysql();
        User mysql = userServiceMysql.get(1);


        System.out.println("--------------------------------------------");

        //使用工厂方法模式
        OracelFactory oracelFactory = OracelFactory.class.newInstance();
        IUserService oracleOperator = oracelFactory.getOperator();
        oracleOperator.get(1);
        MysqlFactory mysqllFactory = MysqlFactory.class.newInstance();
        IUserService mysqlOperator = mysqllFactory.getOperator();
        mysqlOperator.get(1);
    }
}

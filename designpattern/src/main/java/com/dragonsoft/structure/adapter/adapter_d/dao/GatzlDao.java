package com.dragonsoft.structure.adapter.adapter_d.dao;

import com.dragonsoft.structure.adapter.adapter_d.domain.Gatzl;

public class GatzlDao {

    public void save(Gatzl gatzl) {
        System.out.println("保存公安厅指令......");
    }

    public boolean sendMsg(String phoneNumber) {
        System.out.println("公安厅指令发送短信......");
        return true;
    }

    public boolean delete(Gatzl gatzl) {
        System.out.println("删除公安厅指令......");
        return true;
    }
}

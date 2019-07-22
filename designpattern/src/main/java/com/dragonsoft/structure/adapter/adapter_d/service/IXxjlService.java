package com.dragonsoft.structure.adapter.adapter_d.service;

import com.dragonsoft.structure.adapter.adapter_d.domain.Xxjl;

/**
 * 信息交流:提供两个API
 *      保存
 * 需求：复用公安厅指令模块的发送短信和通知通告模块发送邮件的API
 *
 */
public interface IXxjlService {
    void save(Xxjl xxjl);
    boolean delete(Xxjl xxjl);
}

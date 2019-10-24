package com.gpdi.web.service;

import com.gpdi.web.data.QueryData;
import com.gpdi.web.entity.role.SysRole;
import pub.dao.query.QueryResult;
import pub.dao.query.QuerySettings;

import java.util.List;

/**
 *
 */
public interface SysRoleService {

    /**
     * 删除操作
     * @param id
     */
    void delete(Integer id);

    /**
     * 保存操作
     * @param sysRole
     * @return
     */
    Integer save(SysRole sysRole);

    /**
     * 根据id查询操作
     * @param id
     * @return
     */
    SysRole get(Integer id);

    /**
     * 查询操作
     * @param queryData
     * @param settings
     * @return
     */
    QueryResult query(QueryData queryData, QuerySettings settings);

    String formTree(Integer roleId);

    List<SysRole> getAll();

    void saveModuleByRole(List<SysRole> list, Integer moduleId);

    void saveTree(Integer roleId, String array[]);

    void updateRole(Integer userId, String array[]);

}

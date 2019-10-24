package com.gpdi.web.entity.module;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 系统模块
 */
@Entity
@Table(name = "sys_module")
public class SysModule implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer moduleId;
    private String moduleName;
    private String moduleCode;
    private Integer parentId;
    private Integer ifSystem;
    private List<SysModule> child;
    private Integer isEnable;

    @Id
    @Column(name = "module_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    @Column(name = "module_name")
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Column(name = "module_code")
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @Column(name = "parent_id")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Column(name = "ifSystem")
    public Integer getIfSystem() {
        return ifSystem;
    }

    public void setIfSystem(Integer ifSystem) {
        this.ifSystem = ifSystem;
    }

    public List<SysModule> getChild() {
        return child;
    }

    public void setChild(List<SysModule> child) {
        this.child = child;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}

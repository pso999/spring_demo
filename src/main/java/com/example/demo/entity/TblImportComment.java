package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author icy
 * @since 2024-12-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tblimportcomment")
public class TblImportComment implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 用户ID
     */
    private Integer userID;

    /**
     * 主题ID
     */
    private Integer topicID;

    /**
     * 添加者
     */
    @TableField("AddBy")
    private String addBy;

    /**
     * 状态（1表示正常）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime created_at;

    /**
     * 更新时间
     */
    private LocalDateTime updated_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        addBy = addBy;
    }

    public Integer getTopicID() {
        return topicID;
    }

    public void setTopicID(Integer topicID) {
        this.topicID = topicID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}

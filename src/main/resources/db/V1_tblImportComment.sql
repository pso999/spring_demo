CREATE TABLE `tblImportComment` (
      id INT AUTO_INCREMENT PRIMARY KEY COMMENT '自增主键', -- id字段
      content TEXT NOT NULL COMMENT '评论内容',              -- 评论的具体内容
      userID INT NOT NULL COMMENT '用户ID',                 -- 评论所属的用户ID
      topicID INT NOT NULL COMMENT '主题ID',                -- 评论对应的主题ID
      AddBy VARCHAR(50) COMMENT '添加者',                   -- 谁添加了这条记录
      status TINYINT DEFAULT 1 COMMENT '状态（1表示正常）',   -- 记录的状态标志
      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间', -- 记录生成的时间
      updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' -- 记录修改的时间
);

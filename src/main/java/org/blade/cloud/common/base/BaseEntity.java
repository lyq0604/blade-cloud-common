package org.blade.cloud.common.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author lyq on 2021-04-16 下午11:38
 * @desc
 */
@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
public class BaseEntity<T extends Model> extends Model {

    @TableId(type=IdType.AUTO)
    private Long id;

    private LocalDateTime createTime;

    private String creator;

    private LocalDateTime updateTime;

    private String updater;

}

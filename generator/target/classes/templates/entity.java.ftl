<#ftl strip_whitespace=true>
package ${package.Entity};

<#list table.importPackages as pkg>
    import ${pkg};
</#list>
<#if springdoc>
    import io.swagger.v3.oas.annotations.media.Schema;
</#if>
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.jsy.lease.model.entity.BaseEntity;

/**
* <p>
    * <#if table.comment??>${table.comment}<#else>${entity}实体类</#if>
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Data
@EqualsAndHashCode(callSuper = true)
<#if table.convert>
    @TableName("${table.name}")
</#if>
<#if springdoc>
    @Schema(name = "${entity}", description = "<#if table.comment??>${table.comment}<#else>${entity}</#if>")
</#if>
public class ${entity} extends BaseEntity {

private static final long serialVersionUID = 1L;
<#list table.fields as field>
    <#if field.propertyName != "createTime" && field.propertyName != "updateTime" && field.propertyName != "isDeleted">
        <#if field.comment?? && field.comment != "">
            /**
            * ${field.comment}
            */
            @Schema(description = "${field.comment}")
        </#if>
        <#if field.keyFlag>
            @TableId(value = "${field.annotationColumnName}"<#if field.keyIdentityFlag>, type = IdType.AUTO</#if>)
        <#else>
            @TableField(value = "${field.annotationColumnName}")
        </#if>
        private ${field.propertyType} ${field.propertyName};
    </#if>
</#list>
}
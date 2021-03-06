package ${packageName};

import java.util.Collection;
import java.util.List;

import com.github.hualuomoli.base.entity.Pagination;
import ${entity.fullName};

// ${r"#"}${entity.simpleName}
public interface ${name} {

	${entity.simpleName} get(${entity.simpleName} ${entity.simpleName?uncap_first});
	
	${entity.simpleName} get(String id);

	int insert(${entity.simpleName} ${entity.simpleName?uncap_first});
	
	int batchInsert(List<${entity.simpleName}> list);

	int update(${entity.simpleName} ${entity.simpleName?uncap_first});

	int delete(${entity.simpleName} ${entity.simpleName?uncap_first});
	
	int delete(String id);
	
	int deleteByIds(String[] ids);
	
	int deleteByIds(Collection<String> ids);

	List<${entity.simpleName}> findList(${entity.simpleName} ${entity.simpleName?uncap_first});

	Pagination findPage(${entity.simpleName} ${entity.simpleName?uncap_first}, Pagination pagination);
	
}

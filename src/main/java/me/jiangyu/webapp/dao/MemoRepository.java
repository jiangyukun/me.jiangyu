package me.jiangyu.webapp.dao;

import me.jiangyu.webapp.domain.Memo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface MemoRepository extends CrudRepository<Memo, String> {

}

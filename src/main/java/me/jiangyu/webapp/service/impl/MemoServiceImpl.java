package me.jiangyu.webapp.service.impl;

import me.jiangyu.webapp.dao.MemoRepository;
import me.jiangyu.webapp.domain.Memo;
import me.jiangyu.webapp.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoRepository memoRepository;

    @Override
    public void saveMemo(Memo memo) {
        memo.setPostData(new Date());
        memoRepository.save(memo);
    }

    @Override
    public Memo findMemoById(String id) {
        return memoRepository.findOne(id);
    }

    @Override
    public void updateMemo(Memo memo) {
    }

    @Override
    public void deleteMemoById(String id) {
    }
}

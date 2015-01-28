package me.jiangyu.webapp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Entity
@Table(name = "yun_memo")
public class Memo extends IdEntity {
    private String title;
    private String content;
    private User user;
    private Date postData;

    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NotNull
    @Column(length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Temporal(TemporalType.DATE)
    public Date getPostData() {
        return postData;
    }

    public void setPostData(Date postData) {
        this.postData = postData;
    }

}

/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/course/view/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package org.mengyun.tcctransaction.api;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 事务上下文.
 * Created by changmingxie on 10/30/15.
 */
public class TransactionContext implements Serializable {

    private static final long serialVersionUID = -8199390103169700387L;
    
    private TransactionXid xid;

    private int status;

    /**
     * 附加属性.
     */
    private Map<String, String> attachments = new ConcurrentHashMap<String, String>();

    public TransactionContext() {

    }

    /**
     * 构建事务上下文对像.
     * @param xid
     * @param status
     */
    public TransactionContext(TransactionXid xid, int status) {
        this.xid = xid;
        this.status = status;
    }

    public void setXid(TransactionXid xid) {
        this.xid = xid;
    }

    public TransactionXid getXid() {
        return xid.clone();
    }

    public void setAttachments(Map<String, String> attachments) {
        this.attachments = attachments;
    }

    public Map<String, String> getAttachments() {
        return attachments;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }


}

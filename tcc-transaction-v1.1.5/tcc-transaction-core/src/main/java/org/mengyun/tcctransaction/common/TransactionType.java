/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/course/view/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package org.mengyun.tcctransaction.common;

/**
 * 事务类型.
 * Created by changmingxie on 11/15/15.
 */
public enum TransactionType {

	/**
	 * 主事务:1.
	 */
    ROOT(1),
    
    /**
     * 分支事务:2.
     */
    BRANCH(2);

    int id;

    TransactionType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public  static TransactionType  valueOf(int id) {
        switch (id) {
            case 1:
                return ROOT;
            case 2:
                return BRANCH;
            default:
                return null;
        }
    }

}

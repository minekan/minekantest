package sample.sastruts.test.service;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static sample.sastruts.test.names.TestTableNames.*;

import java.util.List;

import javax.annotation.Generated;

import sample.sastruts.test.entity.TestTable;

/**
 * {@link TestTable}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2017/04/20 3:07:40")
public class TestTableService extends AbstractService<TestTable> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param testCol
     *            識別子
     * @return エンティティ
     */
    public TestTable findById(String testCol) {
        return select().id(testCol).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<TestTable> findAllOrderById() {
        return select().orderBy(asc(testCol())).getResultList();
    }
}
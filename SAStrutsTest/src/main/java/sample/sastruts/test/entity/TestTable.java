package sample.sastruts.test.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TestTableエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/04/20 2:49:14")
public class TestTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /** testColプロパティ */
    @Id
    @Column(length = 2147483647, nullable = false, unique = true)
    public String testCol;
}
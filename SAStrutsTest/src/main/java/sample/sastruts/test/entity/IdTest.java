package sample.sastruts.test.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IdTestエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/06/15 22:05:05")
public class IdTest implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(length = 2147483647, nullable = false, unique = true)
    public String id;

    /** valプロパティ */
    @Column(length = 2147483647, nullable = true, unique = false)
    public String val;
}
package sample.sastruts.test.names;

import javax.annotation.Generated;
import sample.sastruts.test.entity.IdTest;
import sample.sastruts.test.entity.KeyTest;
import sample.sastruts.test.entity.TestTable;
import sample.sastruts.test.names.IdTestNames._IdTestNames;
import sample.sastruts.test.names.KeyTestNames._KeyTestNames;
import sample.sastruts.test.names.TestTableNames._TestTableNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2017/06/15 22:18:02")
public class Names {

    /**
     * {@link IdTest}の名前クラスを返します。
     * 
     * @return IdTestの名前クラス
     */
    public static _IdTestNames idTest() {
        return new _IdTestNames();
    }

    /**
     * {@link KeyTest}の名前クラスを返します。
     * 
     * @return KeyTestの名前クラス
     */
    public static _KeyTestNames keyTest() {
        return new _KeyTestNames();
    }

    /**
     * {@link TestTable}の名前クラスを返します。
     * 
     * @return TestTableの名前クラス
     */
    public static _TestTableNames testTable() {
        return new _TestTableNames();
    }
}
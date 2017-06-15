package sample.sastruts.test.names;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import sample.sastruts.test.entity.TestTable;

/**
 * {@link TestTable}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/06/15 22:18:02")
public class TestTableNames {

    /**
     * testColのプロパティ名を返します。
     * 
     * @return testColのプロパティ名
     */
    public static PropertyName<String> testCol() {
        return new PropertyName<String>("testCol");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TestTableNames extends PropertyName<TestTable> {

        /**
         * インスタンスを構築します。
         */
        public _TestTableNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TestTableNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TestTableNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * testColのプロパティ名を返します。
         *
         * @return testColのプロパティ名
         */
        public PropertyName<String> testCol() {
            return new PropertyName<String>(this, "testCol");
        }
    }
}
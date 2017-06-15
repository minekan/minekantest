package sample.sastruts.test.names;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import sample.sastruts.test.entity.KeyTest;

/**
 * {@link KeyTest}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.40", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/06/15 22:18:02")
public class KeyTestNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<String> id() {
        return new PropertyName<String>("id");
    }

    /**
     * valのプロパティ名を返します。
     * 
     * @return valのプロパティ名
     */
    public static PropertyName<String> val() {
        return new PropertyName<String>("val");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _KeyTestNames extends PropertyName<KeyTest> {

        /**
         * インスタンスを構築します。
         */
        public _KeyTestNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _KeyTestNames(final String name) {
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
        public _KeyTestNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<String> id() {
            return new PropertyName<String>(this, "id");
        }

        /**
         * valのプロパティ名を返します。
         *
         * @return valのプロパティ名
         */
        public PropertyName<String> val() {
            return new PropertyName<String>(this, "val");
        }
    }
}
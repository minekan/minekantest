package sample.sastruts.test.form;

import java.io.Serializable;

public class DbTestForm implements Serializable {
    private static final long serialVersionUID = 1L;

    public String id;
    public String val;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}


}

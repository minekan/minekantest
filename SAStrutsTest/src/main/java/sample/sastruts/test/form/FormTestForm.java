package sample.sastruts.test.form;

import java.io.Serializable;

public class FormTestForm implements Serializable {
    private static final long serialVersionUID = 1L;

    public String arg1;
    public String arg2;
    public String result;
	public String getArg1() {
		return this.arg1;
	}
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	public String getArg2() {
		return this.arg2;
	}
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}


}

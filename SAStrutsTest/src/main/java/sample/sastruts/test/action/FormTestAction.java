package sample.sastruts.test.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sample.sastruts.test.form.FormTestForm;

public class FormTestAction
{
	@ActionForm
	@Resource
	public FormTestForm formTestForm;

    @Execute(validator = false)
    public String index()
    {
    	if(formTestForm.arg1 == null) formTestForm.arg1 = "0";
    	if(formTestForm.arg2 == null) formTestForm.arg2 = "0";
    	formTestForm.result = new Integer(new Integer(formTestForm.arg1).intValue() +
    			new Integer(formTestForm.arg2).intValue()).toString();
        return "formtest.jsp";
    }
}

package sample.sastruts.test.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sample.sastruts.test.entity.IdTest;
import sample.sastruts.test.form.DbTestForm;
import sample.sastruts.test.service.IdTestService;

public class DbTestAction
{
	@ActionForm
	@Resource
	public DbTestForm dbTestForm;

	@Resource
	public IdTestService idTestService;

    @Execute(validator = false)
    public String index()
    {

        return "dbtest.jsp";
    }
    @Execute(validator = false,urlPattern="insert")
    public String insert()
    {
    	IdTest entity = new IdTest();
    	entity.id = dbTestForm.getId();
    	entity.val = dbTestForm.getVal();
    	idTestService.insert(entity);
        return "dbtest.jsp";
    }
    @Execute(validator = false,urlPattern="select")
    public String select()
    {
    	IdTest entity = idTestService.findById(dbTestForm.getId());
    	dbTestForm.setId(entity.id);
    	dbTestForm.setVal(entity.val);
        return "dbtest.jsp";
    }
}

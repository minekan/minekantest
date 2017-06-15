<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://sastruts.seasar.org" prefix="s"%>
<html>
<head>
<title>Sample</title>
</head>
<script type="text/javascript" src="${f:url('/js/jquery-3.2.1.js')}"></script>
<script type="text/javascript">
$(function(){
	  // ここにプログラムを記述
	  $('#jqcal').click(function() {
		  $('#jqresult').val($('#jqarg1').val() + $('#jqarg2').val());
	  });
	});

</script>
<body>
<s:form>
    key:<html:text property="id"/><br/>
    val:<html:text property="val"/><br/>

    <input type="submit" name="insert" value="登録" />
    <input type="submit" name="select" value="検索" />
    <br/>
    <br/>
</s:form>
</body>
</html>

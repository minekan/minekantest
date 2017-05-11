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
sastruts
    <html:text property="arg1"/>
    +
    <html:text property="arg2"/>
    =
    <html:text property="result"/>

    <input type="submit" name="cal" value="計算" />
    <br/>
    <br/>
</s:form>
jquery
    <input type="text" id="jqarg1"/>
    +
    <input type="text" id="jqarg2"/>
    =
    <input type="text" id="jqresult"/>

    <input type="submit" id="jqcal" value="計算" />
</body>
</html>

<%@ page import="sun.misc.BASE64Encoder" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="/resources/scripts/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen" href="/resources/styles/bootstrap-datetimepicker.min.css" />

</head>
<body>
<h1>Home Page !!!</h1>
<script>
$(document).ready(function(){
	
});
</script>

<div class="well">
  <div id="datetimepicker2" class="input-append">
    <input data-format="MM/dd/yyyy HH:mm:ss PP" type="text"></input>
    <span class="add-on">
      <i data-time-icon="icon-time" data-date-icon="icon-calendar">
      </i>
    </span>
  </div>
</div>
<script type="text/javascript">
  $(function() {
    $('#datetimepicker2').datetimepicker({
      language: 'en',
      pick12HourFormat: true
    });
  });
</script>




<a href="test.html?userSId=Ritesh">Test Page</a>
</body>
</html>
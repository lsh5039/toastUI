<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
	<script src="/resources/tui-grid.js"></script>
	<link rel="stylesheet" href="/resources/tui-grid.css" type="text/css" />
</head>
<script type="text/javascript">
window.onload = function(){
	const grid = new tui.Grid({
	    el: document.getElementById('grid'),
	    //data: gridData,
	    scrollX: false,
	    scrollY: false,
	    columns: [
	      {
	        header: 'Name',
	        name: 'name'
	      },
	      {
	        header: 'Artist',
	        name: 'artist'
	      },
	      {
	        header: 'Type',
	        name: 'type'
	      },
	      {
	        header: 'Release',
	        name: 'release'
	      },
	      {
	        header: 'Genre',
	        name: 'genre'
	      }
	    ]
	  });
	
	
	
	$.ajax({
		url : 'ajax/toastList',	//toastDataList
		method : 'post',
		dataType:'json',
		success: function(result){
			console.log(result);
			grid.resetData(result);
		},
		error : function(result){
			console.log('ajax error');
		}
	})
};



</script>
<body>

	<div id="grid"></div>
</body>
</html>

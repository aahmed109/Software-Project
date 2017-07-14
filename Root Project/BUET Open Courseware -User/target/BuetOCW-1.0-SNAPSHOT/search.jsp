<%@ page import="java.util.List" %>
<%@ page import="TableObjects.*" %><%--
  Created by IntelliJ IDEA.
  User: graphics
  Date: 7/12/2017
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<%
    List<BookListObject> blist = (List<BookListObject>) session.getAttribute("sBook");
    for(int i = 0; i < blist.size(); i++){
        out.print(blist.get(i).getBook_name() + blist.get(i).getBook_author());
    }
%>

<%
    List<InteractiveTestObject> ilist = (List<InteractiveTestObject>) session.getAttribute("sTest");
    for(int i = 0; i< ilist.size(); i++){
        out.print(ilist.get(i).getQuestion_link());
    }
%>

<%
    List<SlideObject> slist = (List<SlideObject>) session.getAttribute("sSlide");
    for(int i = 0; i< slist.size(); i++){
        out.print(slist.get(i).getSlide_title());
    }
%>
<%
    List<VideoTutorialObject> vlist = (List<VideoTutorialObject>) session.getAttribute("sVideo");
    for(int i = 0; i< vlist.size(); i++){
        out.print(vlist.get(i).getTitle());
    }
%>
<%
    List<DepartmentObject> dlist = (List<DepartmentObject>) session.getAttribute("sDept");
    for(int i = 0; i< dlist.size(); i++){
        out.print(dlist.get(i).getDepartment_name());
    }
%>

<%
    List<CourseObject> clists = (List<CourseObject>) session.getAttribute("sCourse");
    for(int i = 0; i< clists.size(); i++){
        out.print(clists.get(i).getCourse_name());
    }
%>

<%
    List<InstructorObject> tlist = (List<InstructorObject>) session.getAttribute("sTeacher");
    for(int i = 0; i< tlist.size(); i++){
        out.print(tlist.get(i).getTeacher_name());
    }
%>

</body>
</html>

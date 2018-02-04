<%@page import="java.io.Serializable"%>
<%@page import="model.dao.music_contestDAOHIbernate"%>
<%@page import="model.Music_contestBean"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.HibernateUtil"%>
<%@page import="model.MemberBean"%>
<%@page import="model.dao.MemberDAOHibernate"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.boot.MetadataSources"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistry"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Hello :)</title>
</head>
<body>

<h1> MUSIC STAR</h1>

<a href="<c:url value="/login/login.jsp"/>">Login:</a></br>
<a href="<c:url value="/music/musiccontest.jsp"/>">Music Star Contest:</a>

<%

Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
session2.beginTransaction();
music_contestDAOHIbernate dao = new music_contestDAOHIbernate(session2);
Music_contestBean bean = new Music_contestBean();


bean.setMusic_contest_name("10月鄉村");
bean.setMusic_contest_status("end");
bean.setMusic_contest_style("country");

Serializable backeBean = dao.update(bean);

System.out.println("bean:" + backeBean);

session2.getTransaction().commit();
HibernateUtil.closeSessionFactory();
%>

</body>
</html>
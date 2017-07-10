<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactory"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactory"%>
<%@page import="javax.servlet.FilterRegistration.Dynamic"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.pn.service.StaffsLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="org.pn.model.StaffsSoap"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="org.pn.model.Staffs"%>
<%@page import="org.pn.service.StaffsLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>


<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Property"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Junction"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Criterion"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<theme:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%     
	
       List<Staffs> liststaff = StaffsLocalServiceUtil.getStaffses(0, 100);
       List<Staffs> liststaf =  liststaff;
       if (liststaff!= null) {
              liststaf = liststaff;
       }
%>
<portlet:renderURL  var="editURL"/>

<liferay-ui:search-container delta="20" emptyResultsMessage="No Results Found">
    <liferay-ui:search-container-results total="<%= liststaf .size() %>"
            results="<%= ListUtil.subList(liststaf , searchContainer.getStart(), searchContainer.getEnd()) %>" />

    <liferay-ui:search-container-row keyProperty = "id_staff" modelVar="aStaffs"
            className="org.pn.model.Staffs">

        <liferay-ui:search-container-column-text name="id_staff" value='<%=String.valueOf(aStaffs.getId_staff())%>'/> 

        <liferay-ui:search-container-column-text name="name" value='<%=String.valueOf(aStaffs.getName())%>' /> 
        
        <liferay-ui:search-container-column-text name="department" value='<%=String.valueOf(aStaffs.getDepartment())%>'/> 

        <liferay-ui:search-container-column-text name="phonenumber" value='<%=String.valueOf(aStaffs.getPhonenumber())%>' /> 
        
        <liferay-ui:search-container-column-text name="gender" value='<%=String.valueOf(aStaffs.getGender())%>' /> 
        

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>

</liferay-ui:search-container>
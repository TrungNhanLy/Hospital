<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="org.pn.model.StaffsSoap"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="org.pn.model.Staffs"%>
<%@page import="org.pn.service.StaffsLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>


<liferay-theme:defineObjects />
<portlet:defineObjects />
<theme:defineObjects />


<h3><b>Show Page</b></h3>

<br/>

<% List<Staffs> list = StaffsLocalServiceUtil.getStaffses(0, StaffsLocalServiceUtil.getStaffsesCount());%>
<%/*
              List<Staffs>  listStaff= (List<Staffs>) session.getAttribute(" listStaff");
              Integer countStaff = (Integer) session.getAttribute("countStaff");
*/%>

 <portlet:actionURL var="searchStaffURL" name="searchStaf" />
<aui:form  action="<%=searchStaffURL%>" method="post" name="fmSearchProduct">

    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text"  placeholder="search"/>
            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form>

<!-- --------------------------------------------------------------------- -->
<%/*                  
       List<Staffs> liststaff = StaffsLocalServiceUtil.getStaffses(0, 100);
       List<Staffs> liststaf =  liststaff;
       if (liststaff!= null) {
              liststaf = liststaff;
       }
*/%>

<%/*
	String redirect = ParamUtil.getString(request, "redirect");
	StaffsSearchContainer searchContainer = (StaffsSearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	StaffsDisplayTerms displayTerms = (StaffsDisplayTerms)searchContainer.getDisplayTerms();
*/%>

<liferay-ui:search-container delta="2" deltaConfigurable="true"
	emptyResultsMessage="Sorry. There are no record to display">

	<liferay-ui:search-container-results
		results="<%= ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= list.size() %>" />

	<liferay-ui:search-container-row className="org.pn.model.Staffs"
		modelVar="aStaffs">

		<liferay-ui:search-container-column-text property="id_staff" />

		<liferay-ui:search-container-column-text property="id_doctor" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="department" />

		<liferay-ui:search-container-column-text property="gender" />

		<liferay-ui:search-container-column-text property="phonenumber" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:renderURL var="insertURL">
	<portlet:param name="jspPage" value="/html/informationstaff/insert.jsp" />
</portlet:renderURL>
<a href="<%=insertURL %>"><aui:button type="submit"
		value="Insert staff" /></a>
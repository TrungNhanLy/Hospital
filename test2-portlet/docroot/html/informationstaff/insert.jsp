<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />
<theme:defineObjects />

<portlet:actionURL var="insertURL" name="addInformationStaff"></portlet:actionURL>

<aui:form action="<%=insertURL%>" name="addInformationStaff"
	method="POST" id="addInformationStaff">

	<aui:input type="text" name="name" placeholder="Input name">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:input type="text" name="gender" placeholder="gender">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>


	<aui:input type="text" name="department" placeholder="department">
		<aui:validator name="required" />
	</aui:input>

	<aui:input type="text" name="phonenumber" placeholder="phonenumber">
		<aui:validator name="required" />
		<aui:validator name="digits"></aui:validator>
		<aui:validator name="minLength">8</aui:validator>
		<aui:validator name="maxLength">10</aui:validator>
	</aui:input>



	<aui:button type="submit" style=" background-color: #3a96f2"
		value="submit" />
</aui:form>
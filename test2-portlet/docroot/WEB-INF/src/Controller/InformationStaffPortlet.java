package Controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpSession;

import org.apache.el.util.Validation;
import org.pn.model.Staffs;
import org.pn.model.StaffsSoap;
import org.pn.model.impl.StaffsImpl;
import org.pn.service.StaffsLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactory;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.Portal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.List;
import java.util.ArrayList;

/**
 * Portlet implementation class InformationStaffPortlet
 */
public class InformationStaffPortlet extends MVCPortlet {	
	public static final String EMPTY_RESULTS_MESSAGE = "Khong tim thay ket qua nao";

	public String addInformationStaff(ActionRequest actionReques,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {

			String name = ParamUtil.getString(actionReques, "name");
			String gender = ParamUtil.getString(actionReques, "gender");
			String department = ParamUtil.getString(actionReques, "department");
			String phonenumber = ParamUtil.getString(actionReques,"phonenumber");

			Staffs staff = new StaffsImpl();

			staff.setId_staff((int) CounterLocalServiceUtil.increment(InformationStaffPortlet.class.getName()));
			staff.setName(name);
			staff.setPhonenumber(phonenumber);
			staff.setGender(gender);
			staff.setDepartment(department);
			StaffsLocalServiceUtil.addStaffs(staff);

			long id_staff = staff.getId_staff();
			actionReques.setAttribute("id_staff", id_staff);
			actionReques.setAttribute("name", name);
			actionReques.setAttribute("gender", gender);
			actionReques.setAttribute("department", department);
			actionReques.setAttribute("phonenumber", phonenumber);
			actionResponse.setRenderParameter("jspPage",
					"/html/informationstaff/insert.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public void searchStaf(ActionRequest actionReques,
			ActionResponse actionResponse) throws IOException, PortletException {

		try {
			String name = ParamUtil.getString(actionReques, "name");
			DynamicQuery dynamicquery = DynamicQueryFactoryUtil.forClass(Staffs.class, "emp",PortletClassLoaderUtil.getClassLoader());
			
			dynamicquery.add(RestrictionsFactoryUtil.eq("emp.name", name));
			
			
			List<Staffs> listStaff = StaffsLocalServiceUtil.dynamicQuery(dynamicquery);
			
			for (Staffs staff : listStaff) {
				
				actionResponse.setRenderParameter("jspPage",
						"/html/informationstaff/search.jsp");
			}
			
			// System.out.println("Your inputs ==> "+ listStaff);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

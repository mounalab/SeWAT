
package fr.lig.vasco.filters;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Servlet Filter implementation class CustomOCLFilter_4
 * Automatically generated by LIG VASCO Team at 2016-08-22 23:52:16.554
 */
@WebFilter("/medicalrecord/details")
public class CustomOCLFilter_4 implements Filter {

    /**
     * Default constructor. 
     */
    public CustomOCLFilter_4() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// pass the request along the Spring Security filter chain
				chain.doFilter(request, response);
		
		// Translation of the OCL Constraint to JAVA
		/*
         The constraints goes as follows:
         Constraint n.1 : | Role : MedicalStaff | Operation : MedicalRecord__GetData | If the user is not a doctor, the medical record must be validated.
         Constraint n.2 : | Role : MedicalStaff | Operation : MedicalRecord__GetValid | If the user is not a doctor, the medical record must be validated.
         Constraint n.3 : | Role : MedicalStaff | Operation : MedicalRecord__GetPatient | If the user is not a doctor, the medical record must be validated.
        */
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}

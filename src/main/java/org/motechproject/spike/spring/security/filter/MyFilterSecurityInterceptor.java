package org.motechproject.spike.spring.security.filter;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

public class MyFilterSecurityInterceptor extends FilterSecurityInterceptor {

    @Override
    public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
        return super.getSecurityMetadataSource();
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return super.obtainSecurityMetadataSource();
    }
}

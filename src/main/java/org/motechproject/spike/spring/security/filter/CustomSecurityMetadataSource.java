package org.motechproject.spike.spring.security.filter;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.DefaultFilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.RequestMatcher;

import java.util.Collection;
import java.util.LinkedHashMap;

public class CustomSecurityMetadataSource extends DefaultFilterInvocationSecurityMetadataSource {


    /**
     * Sets the internal request map from the supplied map. The key elements should be of type {@link org.springframework.security.web.util.RequestMatcher},
     * which. The path stored in the key will depend on
     * the type of the supplied UrlMatcher.
     *
     * @param requestMap order-preserving map of request definitions to attribute lists
     */
    public CustomSecurityMetadataSource(LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>> requestMap) {
        super(requestMap);
    }
}

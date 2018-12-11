package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

public class SwSecurityScheme implements SecurityScheme {

    private io.swagger.v3.oas.models.security.SecurityScheme _swSecurityScheme;

    public SwSecurityScheme() {
        _swSecurityScheme = new io.swagger.v3.oas.models.security.SecurityScheme();
    }

    public SwSecurityScheme(io.swagger.v3.oas.models.security.SecurityScheme _swSecurityScheme) {
        this._swSecurityScheme = _swSecurityScheme;
    }

    public io.swagger.v3.oas.models.security.SecurityScheme getSw() {
        return _swSecurityScheme;
    }

    @Override
    public String getRef() {
        return _swSecurityScheme.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swSecurityScheme.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swSecurityScheme.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swSecurityScheme.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public SecurityScheme addExtension(String key, Object object) {
        _swSecurityScheme.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swSecurityScheme.getExtensions().remove(key);
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type getType() {
        if (_swSecurityScheme.getType() == null) {
            return null;
        }
        switch (_swSecurityScheme.getType()) {
        case APIKEY:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type.APIKEY;
        case HTTP:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type.HTTP;
        case OAUTH2:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type.OAUTH2;
        case OPENIDCONNECT:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type.OPENIDCONNECT;
        default:
            throw new IllegalStateException("Unexpected enum value");
        }
    }

    @Override
    public void setType(org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type type) {
        io.swagger.v3.oas.models.security.SecurityScheme.TypeEnum value;
        if (style == null) {
            value = null;
        } else {
            switch (style) {
            case APIKEY:
                value = io.swagger.v3.oas.models.security.SecurityScheme.TypeEnum.APIKEY;
                break;
            case HTTP:
                value = io.swagger.v3.oas.models.security.SecurityScheme.TypeEnum.HTTP;
                break;
            case OAUTH2:
                value = io.swagger.v3.oas.models.security.SecurityScheme.TypeEnum.OAUTH2;
                break;
            case OPENIDCONNECT:
                value = io.swagger.v3.oas.models.security.SecurityScheme.TypeEnum.OPENIDCONNECT;
                break;
            default:
                throw new IllegalStateException("Unexpected enum value");
            }
        }
        _swSecurityScheme.setType(value);
    }

    @Override
    public String getDescription() {
        return _swSecurityScheme.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swSecurityScheme.setDescription(description);
    }

    @Override
    public String getName() {
        return _swSecurityScheme.getName();
    }

    @Override
    public void setName(String name) {
        _swSecurityScheme.setName(name);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.In getIn() {
        if (_swSecurityScheme.getIn() == null) {
            return null;
        }
        switch (_swSecurityScheme.getIn()) {
        case COOKIE:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.In.COOKIE;
        case HEADER:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.In.HEADER;
        case QUERY:
            return org.eclipse.microprofile.openapi.models.security.SecurityScheme.In.QUERY;
        default:
            throw new IllegalStateException("Unexpected enum value");
        }
    }

    @Override
    public void setIn(org.eclipse.microprofile.openapi.models.security.SecurityScheme.In in) {
        io.swagger.v3.oas.models.security.SecurityScheme.InEnum value;
        if (style == null) {
            value = null;
        } else {
            switch (style) {
            case COOKIE:
                value = io.swagger.v3.oas.models.security.SecurityScheme.InEnum.COOKIE;
                break;
            case HEADER:
                value = io.swagger.v3.oas.models.security.SecurityScheme.InEnum.HEADER;
                break;
            case QUERY:
                value = io.swagger.v3.oas.models.security.SecurityScheme.InEnum.QUERY;
                break;
            default:
                throw new IllegalStateException("Unexpected enum value");
            }
        }
        _swSecurityScheme.setIn(value);
    }

    @Override
    public String getScheme() {
        return _swSecurityScheme.getScheme();
    }

    @Override
    public void setScheme(String scheme) {
        _swSecurityScheme.setScheme(scheme);
    }

    @Override
    public String getBearerFormat() {
        return _swSecurityScheme.getBearerFormat();
    }

    @Override
    public void setBearerFormat(String bearerFormat) {
        _swSecurityScheme.setBearerFormat(bearerFormat);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows _flows;

    private void initFlows() {
        if (_swSecurityScheme.getFlows() == null) {
            _flows = null;
        } else {
            _flows = new fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows(_swSecurityScheme.getFlows());
        }
    }
    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlows getFlows() {
        initFlows();
        return _flows;
    }

    @Override
    public void setFlows(org.eclipse.microprofile.openapi.models.security.OAuthFlows flows) {
        if (flows != null) {
            if (!(flows instanceof fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows)) {
                throw new IllegalArgumentException("Unexpected type: " + flows);
            }
            _flows = (fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows) flows;
            _swSecurityScheme.setFlows(_flows.getSw());
        } else {
            _flows = null;
            _swSecurityScheme.setFlows(null);
        }
    }

    @Override
    public String getOpenIdConnectUrl() {
        return _swSecurityScheme.getOpenIdConnectUrl();
    }

    @Override
    public void setOpenIdConnectUrl(String openIdConnectUrl) {
        _swSecurityScheme.setOpenIdConnectUrl(openIdConnectUrl);
    }

}

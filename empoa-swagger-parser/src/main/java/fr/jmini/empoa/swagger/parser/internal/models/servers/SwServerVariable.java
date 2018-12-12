package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariable;

public class SwServerVariable implements ServerVariable {

    private io.swagger.v3.oas.models.servers.ServerVariable _swServerVariable;

    public SwServerVariable() {
        _swServerVariable = new io.swagger.v3.oas.models.servers.ServerVariable();
    }

    public SwServerVariable(io.swagger.v3.oas.models.servers.ServerVariable _swServerVariable) {
        this._swServerVariable = _swServerVariable;
    }

    public io.swagger.v3.oas.models.servers.ServerVariable getSw() {
        return _swServerVariable;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swServerVariable.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swServerVariable.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariable addExtension(String key, Object object) {
        _swServerVariable.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swServerVariable.getExtensions().remove(key);
        }
    }

    @Override
    public java.util.List<String> getEnumeration() {
        java.util.List<String> result = _swServerVariable.getEnum();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setEnumeration(java.util.List<String> enumeration) {
        _swServerVariable.setEnum(null);
        if (enumeration != null) {
            for (String e : enumeration) {
                this.addEnumeration(e);
            }
        }
    }

    @Override
    public ServerVariable addEnumeration(String string) {
        _swServerVariable.addEnumItem(string);
        return this;
    }

    @Override
    public void removeEnumeration(String string) {
        if (_swServerVariable.getEnum() != null) {
            _swServerVariable.getEnum().remove(string);
        }
    }

    @Override
    public String getDefaultValue() {
        return _swServerVariable.getDefault();
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        _swServerVariable.setDefault(defaultValue);
    }

    @Override
    public String getDescription() {
        return _swServerVariable.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swServerVariable.setDescription(description);
    }

}

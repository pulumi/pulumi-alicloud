// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetAscriptsAscriptExtAttribute;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAscriptsAscript {
    /**
     * @return Script identification.
     * 
     */
    private String ascriptId;
    /**
     * @return Script name.
     * 
     */
    private String ascriptName;
    /**
     * @return Whether scripts are enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Whether extension parameters are enabled.
     * 
     */
    private Boolean extAttributeEnabled;
    /**
     * @return Extended attribute list.
     * 
     */
    private List<GetAscriptsAscriptExtAttribute> extAttributes;
    private String id;
    /**
     * @return Listener ID of script attribution
     * 
     */
    private String listenerId;
    private String loadBalancerId;
    /**
     * @return Script execution location.
     * 
     */
    private String position;
    /**
     * @return Script content.
     * 
     */
    private String scriptContent;
    /**
     * @return Script status.
     * 
     */
    private String status;

    private GetAscriptsAscript() {}
    /**
     * @return Script identification.
     * 
     */
    public String ascriptId() {
        return this.ascriptId;
    }
    /**
     * @return Script name.
     * 
     */
    public String ascriptName() {
        return this.ascriptName;
    }
    /**
     * @return Whether scripts are enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Whether extension parameters are enabled.
     * 
     */
    public Boolean extAttributeEnabled() {
        return this.extAttributeEnabled;
    }
    /**
     * @return Extended attribute list.
     * 
     */
    public List<GetAscriptsAscriptExtAttribute> extAttributes() {
        return this.extAttributes;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Listener ID of script attribution
     * 
     */
    public String listenerId() {
        return this.listenerId;
    }
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * @return Script execution location.
     * 
     */
    public String position() {
        return this.position;
    }
    /**
     * @return Script content.
     * 
     */
    public String scriptContent() {
        return this.scriptContent;
    }
    /**
     * @return Script status.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAscriptsAscript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ascriptId;
        private String ascriptName;
        private Boolean enabled;
        private Boolean extAttributeEnabled;
        private List<GetAscriptsAscriptExtAttribute> extAttributes;
        private String id;
        private String listenerId;
        private String loadBalancerId;
        private String position;
        private String scriptContent;
        private String status;
        public Builder() {}
        public Builder(GetAscriptsAscript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ascriptId = defaults.ascriptId;
    	      this.ascriptName = defaults.ascriptName;
    	      this.enabled = defaults.enabled;
    	      this.extAttributeEnabled = defaults.extAttributeEnabled;
    	      this.extAttributes = defaults.extAttributes;
    	      this.id = defaults.id;
    	      this.listenerId = defaults.listenerId;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.position = defaults.position;
    	      this.scriptContent = defaults.scriptContent;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder ascriptId(String ascriptId) {
            if (ascriptId == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "ascriptId");
            }
            this.ascriptId = ascriptId;
            return this;
        }
        @CustomType.Setter
        public Builder ascriptName(String ascriptName) {
            if (ascriptName == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "ascriptName");
            }
            this.ascriptName = ascriptName;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder extAttributeEnabled(Boolean extAttributeEnabled) {
            if (extAttributeEnabled == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "extAttributeEnabled");
            }
            this.extAttributeEnabled = extAttributeEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder extAttributes(List<GetAscriptsAscriptExtAttribute> extAttributes) {
            if (extAttributes == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "extAttributes");
            }
            this.extAttributes = extAttributes;
            return this;
        }
        public Builder extAttributes(GetAscriptsAscriptExtAttribute... extAttributes) {
            return extAttributes(List.of(extAttributes));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder listenerId(String listenerId) {
            if (listenerId == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "listenerId");
            }
            this.listenerId = listenerId;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerId(String loadBalancerId) {
            if (loadBalancerId == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "loadBalancerId");
            }
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        @CustomType.Setter
        public Builder position(String position) {
            if (position == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "position");
            }
            this.position = position;
            return this;
        }
        @CustomType.Setter
        public Builder scriptContent(String scriptContent) {
            if (scriptContent == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "scriptContent");
            }
            this.scriptContent = scriptContent;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAscriptsAscript", "status");
            }
            this.status = status;
            return this;
        }
        public GetAscriptsAscript build() {
            final var _resultValue = new GetAscriptsAscript();
            _resultValue.ascriptId = ascriptId;
            _resultValue.ascriptName = ascriptName;
            _resultValue.enabled = enabled;
            _resultValue.extAttributeEnabled = extAttributeEnabled;
            _resultValue.extAttributes = extAttributes;
            _resultValue.id = id;
            _resultValue.listenerId = listenerId;
            _resultValue.loadBalancerId = loadBalancerId;
            _resultValue.position = position;
            _resultValue.scriptContent = scriptContent;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}

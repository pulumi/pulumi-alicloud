// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppsApp {
    /**
     * @return App code.
     * 
     */
    private String appCode;
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    private String createdTime;
    /**
     * @return App description.
     * 
     */
    private String description;
    /**
     * @return App ID, which is generated by the system and globally unique.
     * 
     */
    private Integer id;
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    private String modifiedTime;
    /**
     * @return App name.
     * 
     */
    private String name;

    private GetAppsApp() {}
    /**
     * @return App code.
     * 
     */
    public String appCode() {
        return this.appCode;
    }
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return App description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return App ID, which is generated by the system and globally unique.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return App name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appCode;
        private String createdTime;
        private String description;
        private Integer id;
        private String modifiedTime;
        private String name;
        public Builder() {}
        public Builder(GetAppsApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appCode = defaults.appCode;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder appCode(String appCode) {
            if (appCode == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "appCode");
            }
            this.appCode = appCode;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(String createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(String modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "name");
            }
            this.name = name;
            return this;
        }
        public GetAppsApp build() {
            final var _resultValue = new GetAppsApp();
            _resultValue.appCode = appCode;
            _resultValue.createdTime = createdTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertResourceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String lang;
    private @Nullable String project;
    private String type;

    private GetAlertResourceResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertResourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String lang;
        private @Nullable String project;
        private String type;
        public Builder() {}
        public Builder(GetAlertResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lang = defaults.lang;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlertResourceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lang(@Nullable String lang) {

            this.lang = lang;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetAlertResourceResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetAlertResourceResult build() {
            final var _resultValue = new GetAlertResourceResult();
            _resultValue.id = id;
            _resultValue.lang = lang;
            _resultValue.project = project;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

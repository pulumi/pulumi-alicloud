// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainTxtGuidResult {
    private String domainName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String lang;
    private @Nullable String outputFile;
    /**
     * @return Host record.
     * 
     */
    private String rr;
    private String type;
    /**
     * @return Record the value.
     * 
     */
    private String value;

    private GetDomainTxtGuidResult() {}
    public String domainName() {
        return this.domainName;
    }
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Host record.
     * 
     */
    public String rr() {
        return this.rr;
    }
    public String type() {
        return this.type;
    }
    /**
     * @return Record the value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainTxtGuidResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String id;
        private @Nullable String lang;
        private @Nullable String outputFile;
        private String rr;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetDomainTxtGuidResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.lang = defaults.lang;
    	      this.outputFile = defaults.outputFile;
    	      this.rr = defaults.rr;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder domainName(String domainName) {
            if (domainName == null) {
              throw new MissingRequiredPropertyException("GetDomainTxtGuidResult", "domainName");
            }
            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDomainTxtGuidResult", "id");
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
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder rr(String rr) {
            if (rr == null) {
              throw new MissingRequiredPropertyException("GetDomainTxtGuidResult", "rr");
            }
            this.rr = rr;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDomainTxtGuidResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetDomainTxtGuidResult", "value");
            }
            this.value = value;
            return this;
        }
        public GetDomainTxtGuidResult build() {
            final var _resultValue = new GetDomainTxtGuidResult();
            _resultValue.domainName = domainName;
            _resultValue.id = id;
            _resultValue.lang = lang;
            _resultValue.outputFile = outputFile;
            _resultValue.rr = rr;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vod.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainsDomainSource {
    private String sourceContent;
    private String sourcePort;
    private String sourcePriority;
    private String sourceType;

    private GetDomainsDomainSource() {}
    public String sourceContent() {
        return this.sourceContent;
    }
    public String sourcePort() {
        return this.sourcePort;
    }
    public String sourcePriority() {
        return this.sourcePriority;
    }
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsDomainSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sourceContent;
        private String sourcePort;
        private String sourcePriority;
        private String sourceType;
        public Builder() {}
        public Builder(GetDomainsDomainSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceContent = defaults.sourceContent;
    	      this.sourcePort = defaults.sourcePort;
    	      this.sourcePriority = defaults.sourcePriority;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder sourceContent(String sourceContent) {
            if (sourceContent == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainSource", "sourceContent");
            }
            this.sourceContent = sourceContent;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(String sourcePort) {
            if (sourcePort == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainSource", "sourcePort");
            }
            this.sourcePort = sourcePort;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePriority(String sourcePriority) {
            if (sourcePriority == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainSource", "sourcePriority");
            }
            this.sourcePriority = sourcePriority;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            if (sourceType == null) {
              throw new MissingRequiredPropertyException("GetDomainsDomainSource", "sourceType");
            }
            this.sourceType = sourceType;
            return this;
        }
        public GetDomainsDomainSource build() {
            final var _resultValue = new GetDomainsDomainSource();
            _resultValue.sourceContent = sourceContent;
            _resultValue.sourcePort = sourcePort;
            _resultValue.sourcePriority = sourcePriority;
            _resultValue.sourceType = sourceType;
            return _resultValue;
        }
    }
}
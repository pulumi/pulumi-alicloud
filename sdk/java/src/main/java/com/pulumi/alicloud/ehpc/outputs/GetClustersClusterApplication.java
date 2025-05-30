// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ehpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersClusterApplication {
    /**
     * @return Application Tags.
     * 
     */
    private String tag;

    private GetClustersClusterApplication() {}
    /**
     * @return Application Tags.
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersClusterApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tag;
        public Builder() {}
        public Builder(GetClustersClusterApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("GetClustersClusterApplication", "tag");
            }
            this.tag = tag;
            return this;
        }
        public GetClustersClusterApplication build() {
            final var _resultValue = new GetClustersClusterApplication();
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}

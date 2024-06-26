// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetKubernetesVersionMetadataRuntime;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubernetesVersionMetadata {
    /**
     * @return The list of supported runtime.
     * 
     */
    private List<GetKubernetesVersionMetadataRuntime> runtimes;
    /**
     * @return The runtime version.
     * 
     */
    private String version;

    private GetKubernetesVersionMetadata() {}
    /**
     * @return The list of supported runtime.
     * 
     */
    public List<GetKubernetesVersionMetadataRuntime> runtimes() {
        return this.runtimes;
    }
    /**
     * @return The runtime version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesVersionMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetKubernetesVersionMetadataRuntime> runtimes;
        private String version;
        public Builder() {}
        public Builder(GetKubernetesVersionMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runtimes = defaults.runtimes;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder runtimes(List<GetKubernetesVersionMetadataRuntime> runtimes) {
            if (runtimes == null) {
              throw new MissingRequiredPropertyException("GetKubernetesVersionMetadata", "runtimes");
            }
            this.runtimes = runtimes;
            return this;
        }
        public Builder runtimes(GetKubernetesVersionMetadataRuntime... runtimes) {
            return runtimes(List.of(runtimes));
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetKubernetesVersionMetadata", "version");
            }
            this.version = version;
            return this;
        }
        public GetKubernetesVersionMetadata build() {
            final var _resultValue = new GetKubernetesVersionMetadata();
            _resultValue.runtimes = runtimes;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}

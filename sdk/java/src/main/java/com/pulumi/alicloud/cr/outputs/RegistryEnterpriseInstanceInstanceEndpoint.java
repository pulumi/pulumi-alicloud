// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.RegistryEnterpriseInstanceInstanceEndpointDomain;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryEnterpriseInstanceInstanceEndpoint {
    /**
     * @return Domain List
     * 
     */
    private @Nullable List<RegistryEnterpriseInstanceInstanceEndpointDomain> domains;
    /**
     * @return enable
     * 
     */
    private @Nullable Boolean enable;
    /**
     * @return Network Access Endpoint Type
     * 
     */
    private @Nullable String endpointType;

    private RegistryEnterpriseInstanceInstanceEndpoint() {}
    /**
     * @return Domain List
     * 
     */
    public List<RegistryEnterpriseInstanceInstanceEndpointDomain> domains() {
        return this.domains == null ? List.of() : this.domains;
    }
    /**
     * @return enable
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return Network Access Endpoint Type
     * 
     */
    public Optional<String> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEnterpriseInstanceInstanceEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RegistryEnterpriseInstanceInstanceEndpointDomain> domains;
        private @Nullable Boolean enable;
        private @Nullable String endpointType;
        public Builder() {}
        public Builder(RegistryEnterpriseInstanceInstanceEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.enable = defaults.enable;
    	      this.endpointType = defaults.endpointType;
        }

        @CustomType.Setter
        public Builder domains(@Nullable List<RegistryEnterpriseInstanceInstanceEndpointDomain> domains) {

            this.domains = domains;
            return this;
        }
        public Builder domains(RegistryEnterpriseInstanceInstanceEndpointDomain... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder endpointType(@Nullable String endpointType) {

            this.endpointType = endpointType;
            return this;
        }
        public RegistryEnterpriseInstanceInstanceEndpoint build() {
            final var _resultValue = new RegistryEnterpriseInstanceInstanceEndpoint();
            _resultValue.domains = domains;
            _resultValue.enable = enable;
            _resultValue.endpointType = endpointType;
            return _resultValue;
        }
    }
}

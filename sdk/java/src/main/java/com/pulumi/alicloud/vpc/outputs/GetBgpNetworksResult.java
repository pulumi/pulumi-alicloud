// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetBgpNetworksNetwork;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBgpNetworksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private List<GetBgpNetworksNetwork> networks;
    private @Nullable String outputFile;
    private @Nullable String routerId;
    private @Nullable String status;

    private GetBgpNetworksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public List<GetBgpNetworksNetwork> networks() {
        return this.networks;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpNetworksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private List<GetBgpNetworksNetwork> networks;
        private @Nullable String outputFile;
        private @Nullable String routerId;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetBgpNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.networks = defaults.networks;
    	      this.outputFile = defaults.outputFile;
    	      this.routerId = defaults.routerId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBgpNetworksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetBgpNetworksResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder networks(List<GetBgpNetworksNetwork> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetBgpNetworksResult", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(GetBgpNetworksNetwork... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder routerId(@Nullable String routerId) {

            this.routerId = routerId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetBgpNetworksResult build() {
            final var _resultValue = new GetBgpNetworksResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.networks = networks;
            _resultValue.outputFile = outputFile;
            _resultValue.routerId = routerId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
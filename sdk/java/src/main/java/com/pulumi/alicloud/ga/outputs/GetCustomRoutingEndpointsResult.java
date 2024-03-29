// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetCustomRoutingEndpointsCustomRoutingEndpoint;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomRoutingEndpointsResult {
    /**
     * @return The ID of the GA instance with which the endpoint is associated.
     * 
     */
    private String acceleratorId;
    /**
     * @return A list of Custom Routing Endpoints. Each element contains the following attributes:
     * 
     */
    private List<GetCustomRoutingEndpointsCustomRoutingEndpoint> customRoutingEndpoints;
    /**
     * @return The ID of the Custom Routing Endpoint Group.
     * 
     */
    private @Nullable String endpointGroupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return The ID of the listener with which the endpoint is associated.
     * 
     */
    private @Nullable String listenerId;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;

    private GetCustomRoutingEndpointsResult() {}
    /**
     * @return The ID of the GA instance with which the endpoint is associated.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * @return A list of Custom Routing Endpoints. Each element contains the following attributes:
     * 
     */
    public List<GetCustomRoutingEndpointsCustomRoutingEndpoint> customRoutingEndpoints() {
        return this.customRoutingEndpoints;
    }
    /**
     * @return The ID of the Custom Routing Endpoint Group.
     * 
     */
    public Optional<String> endpointGroupId() {
        return Optional.ofNullable(this.endpointGroupId);
    }
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
    /**
     * @return The ID of the listener with which the endpoint is associated.
     * 
     */
    public Optional<String> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomRoutingEndpointsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceleratorId;
        private List<GetCustomRoutingEndpointsCustomRoutingEndpoint> customRoutingEndpoints;
        private @Nullable String endpointGroupId;
        private String id;
        private List<String> ids;
        private @Nullable String listenerId;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        public Builder() {}
        public Builder(GetCustomRoutingEndpointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorId = defaults.acceleratorId;
    	      this.customRoutingEndpoints = defaults.customRoutingEndpoints;
    	      this.endpointGroupId = defaults.endpointGroupId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.listenerId = defaults.listenerId;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
        }

        @CustomType.Setter
        public Builder acceleratorId(String acceleratorId) {
            if (acceleratorId == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointsResult", "acceleratorId");
            }
            this.acceleratorId = acceleratorId;
            return this;
        }
        @CustomType.Setter
        public Builder customRoutingEndpoints(List<GetCustomRoutingEndpointsCustomRoutingEndpoint> customRoutingEndpoints) {
            if (customRoutingEndpoints == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointsResult", "customRoutingEndpoints");
            }
            this.customRoutingEndpoints = customRoutingEndpoints;
            return this;
        }
        public Builder customRoutingEndpoints(GetCustomRoutingEndpointsCustomRoutingEndpoint... customRoutingEndpoints) {
            return customRoutingEndpoints(List.of(customRoutingEndpoints));
        }
        @CustomType.Setter
        public Builder endpointGroupId(@Nullable String endpointGroupId) {

            this.endpointGroupId = endpointGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder listenerId(@Nullable String listenerId) {

            this.listenerId = listenerId;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        public GetCustomRoutingEndpointsResult build() {
            final var _resultValue = new GetCustomRoutingEndpointsResult();
            _resultValue.acceleratorId = acceleratorId;
            _resultValue.customRoutingEndpoints = customRoutingEndpoints;
            _resultValue.endpointGroupId = endpointGroupId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.listenerId = listenerId;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            return _resultValue;
        }
    }
}

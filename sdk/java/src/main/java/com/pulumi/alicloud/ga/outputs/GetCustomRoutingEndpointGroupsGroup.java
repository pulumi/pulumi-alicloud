// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomRoutingEndpointGroupsGroup {
    /**
     * @return The ID of the GA instance.
     * 
     */
    private String acceleratorId;
    /**
     * @return The name of the endpoint group.
     * 
     */
    private String customRoutingEndpointGroupName;
    /**
     * @return The description of the endpoint group.
     * 
     */
    private String description;
    /**
     * @return The ID of the endpoint group.
     * 
     */
    private String endpointGroupId;
    /**
     * @return The list of endpoint group IP addresses.
     * 
     */
    private List<String> endpointGroupIpLists;
    /**
     * @return The ID of the region where the endpoint group is created.
     * 
     */
    private String endpointGroupRegion;
    /**
     * @return The endpoint group IP addresses to be confirmed after the GA instance is upgraded.
     * 
     */
    private List<String> endpointGroupUnconfirmedIpLists;
    /**
     * @return The id of the Custom Routing Endpoint Group.
     * 
     */
    private String id;
    /**
     * @return The ID of the custom routing listener.
     * 
     */
    private String listenerId;
    /**
     * @return The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
     * 
     */
    private String status;

    private GetCustomRoutingEndpointGroupsGroup() {}
    /**
     * @return The ID of the GA instance.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * @return The name of the endpoint group.
     * 
     */
    public String customRoutingEndpointGroupName() {
        return this.customRoutingEndpointGroupName;
    }
    /**
     * @return The description of the endpoint group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the endpoint group.
     * 
     */
    public String endpointGroupId() {
        return this.endpointGroupId;
    }
    /**
     * @return The list of endpoint group IP addresses.
     * 
     */
    public List<String> endpointGroupIpLists() {
        return this.endpointGroupIpLists;
    }
    /**
     * @return The ID of the region where the endpoint group is created.
     * 
     */
    public String endpointGroupRegion() {
        return this.endpointGroupRegion;
    }
    /**
     * @return The endpoint group IP addresses to be confirmed after the GA instance is upgraded.
     * 
     */
    public List<String> endpointGroupUnconfirmedIpLists() {
        return this.endpointGroupUnconfirmedIpLists;
    }
    /**
     * @return The id of the Custom Routing Endpoint Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the custom routing listener.
     * 
     */
    public String listenerId() {
        return this.listenerId;
    }
    /**
     * @return The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomRoutingEndpointGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceleratorId;
        private String customRoutingEndpointGroupName;
        private String description;
        private String endpointGroupId;
        private List<String> endpointGroupIpLists;
        private String endpointGroupRegion;
        private List<String> endpointGroupUnconfirmedIpLists;
        private String id;
        private String listenerId;
        private String status;
        public Builder() {}
        public Builder(GetCustomRoutingEndpointGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorId = defaults.acceleratorId;
    	      this.customRoutingEndpointGroupName = defaults.customRoutingEndpointGroupName;
    	      this.description = defaults.description;
    	      this.endpointGroupId = defaults.endpointGroupId;
    	      this.endpointGroupIpLists = defaults.endpointGroupIpLists;
    	      this.endpointGroupRegion = defaults.endpointGroupRegion;
    	      this.endpointGroupUnconfirmedIpLists = defaults.endpointGroupUnconfirmedIpLists;
    	      this.id = defaults.id;
    	      this.listenerId = defaults.listenerId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder acceleratorId(String acceleratorId) {
            if (acceleratorId == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "acceleratorId");
            }
            this.acceleratorId = acceleratorId;
            return this;
        }
        @CustomType.Setter
        public Builder customRoutingEndpointGroupName(String customRoutingEndpointGroupName) {
            if (customRoutingEndpointGroupName == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "customRoutingEndpointGroupName");
            }
            this.customRoutingEndpointGroupName = customRoutingEndpointGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder endpointGroupId(String endpointGroupId) {
            if (endpointGroupId == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "endpointGroupId");
            }
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder endpointGroupIpLists(List<String> endpointGroupIpLists) {
            if (endpointGroupIpLists == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "endpointGroupIpLists");
            }
            this.endpointGroupIpLists = endpointGroupIpLists;
            return this;
        }
        public Builder endpointGroupIpLists(String... endpointGroupIpLists) {
            return endpointGroupIpLists(List.of(endpointGroupIpLists));
        }
        @CustomType.Setter
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            if (endpointGroupRegion == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "endpointGroupRegion");
            }
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        @CustomType.Setter
        public Builder endpointGroupUnconfirmedIpLists(List<String> endpointGroupUnconfirmedIpLists) {
            if (endpointGroupUnconfirmedIpLists == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "endpointGroupUnconfirmedIpLists");
            }
            this.endpointGroupUnconfirmedIpLists = endpointGroupUnconfirmedIpLists;
            return this;
        }
        public Builder endpointGroupUnconfirmedIpLists(String... endpointGroupUnconfirmedIpLists) {
            return endpointGroupUnconfirmedIpLists(List.of(endpointGroupUnconfirmedIpLists));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder listenerId(String listenerId) {
            if (listenerId == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "listenerId");
            }
            this.listenerId = listenerId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCustomRoutingEndpointGroupsGroup", "status");
            }
            this.status = status;
            return this;
        }
        public GetCustomRoutingEndpointGroupsGroup build() {
            final var _resultValue = new GetCustomRoutingEndpointGroupsGroup();
            _resultValue.acceleratorId = acceleratorId;
            _resultValue.customRoutingEndpointGroupName = customRoutingEndpointGroupName;
            _resultValue.description = description;
            _resultValue.endpointGroupId = endpointGroupId;
            _resultValue.endpointGroupIpLists = endpointGroupIpLists;
            _resultValue.endpointGroupRegion = endpointGroupRegion;
            _resultValue.endpointGroupUnconfirmedIpLists = endpointGroupUnconfirmedIpLists;
            _resultValue.id = id;
            _resultValue.listenerId = listenerId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
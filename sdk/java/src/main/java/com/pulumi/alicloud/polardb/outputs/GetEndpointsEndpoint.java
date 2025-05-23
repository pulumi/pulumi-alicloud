// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.alicloud.polardb.outputs.GetEndpointsEndpointAddressItem;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEndpointsEndpoint {
    /**
     * @return A list of endpoint addresses. Each element contains the following attributes.
     * 
     */
    private List<GetEndpointsEndpointAddressItem> addressItems;
    /**
     * @return Whether the new node is automatically added to the default cluster address.Options are `Enable` and `Disable`.
     * 
     */
    private String autoAddNewNodes;
    /**
     * @return endpoint of the cluster.
     * 
     */
    private String dbEndpointId;
    /**
     * @return The Endpoint configuration. `ConsistLevel`: session consistency level, value:`0`: final consistency,`1`: session consistency;`LoadBalanceStrategy`: load balancing strategy. Based on the automatic scheduling of load, the value is: `load`.
     * 
     */
    private String endpointConfig;
    /**
     * @return Cluster address type.`Cluster`: the default address of the Cluster.`Primary`: Primary address.`Custom`: Custom cluster addresses.
     * 
     */
    private String endpointType;
    /**
     * @return A list of nodes that connect to the address configuration.
     * 
     */
    private String nodes;
    /**
     * @return Read-write mode:`ReadWrite`: readable and writable (automatic read-write separation).`ReadOnly`: ReadOnly.
     * 
     */
    private String readWriteMode;

    private GetEndpointsEndpoint() {}
    /**
     * @return A list of endpoint addresses. Each element contains the following attributes.
     * 
     */
    public List<GetEndpointsEndpointAddressItem> addressItems() {
        return this.addressItems;
    }
    /**
     * @return Whether the new node is automatically added to the default cluster address.Options are `Enable` and `Disable`.
     * 
     */
    public String autoAddNewNodes() {
        return this.autoAddNewNodes;
    }
    /**
     * @return endpoint of the cluster.
     * 
     */
    public String dbEndpointId() {
        return this.dbEndpointId;
    }
    /**
     * @return The Endpoint configuration. `ConsistLevel`: session consistency level, value:`0`: final consistency,`1`: session consistency;`LoadBalanceStrategy`: load balancing strategy. Based on the automatic scheduling of load, the value is: `load`.
     * 
     */
    public String endpointConfig() {
        return this.endpointConfig;
    }
    /**
     * @return Cluster address type.`Cluster`: the default address of the Cluster.`Primary`: Primary address.`Custom`: Custom cluster addresses.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return A list of nodes that connect to the address configuration.
     * 
     */
    public String nodes() {
        return this.nodes;
    }
    /**
     * @return Read-write mode:`ReadWrite`: readable and writable (automatic read-write separation).`ReadOnly`: ReadOnly.
     * 
     */
    public String readWriteMode() {
        return this.readWriteMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointsEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEndpointsEndpointAddressItem> addressItems;
        private String autoAddNewNodes;
        private String dbEndpointId;
        private String endpointConfig;
        private String endpointType;
        private String nodes;
        private String readWriteMode;
        public Builder() {}
        public Builder(GetEndpointsEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressItems = defaults.addressItems;
    	      this.autoAddNewNodes = defaults.autoAddNewNodes;
    	      this.dbEndpointId = defaults.dbEndpointId;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.endpointType = defaults.endpointType;
    	      this.nodes = defaults.nodes;
    	      this.readWriteMode = defaults.readWriteMode;
        }

        @CustomType.Setter
        public Builder addressItems(List<GetEndpointsEndpointAddressItem> addressItems) {
            if (addressItems == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "addressItems");
            }
            this.addressItems = addressItems;
            return this;
        }
        public Builder addressItems(GetEndpointsEndpointAddressItem... addressItems) {
            return addressItems(List.of(addressItems));
        }
        @CustomType.Setter
        public Builder autoAddNewNodes(String autoAddNewNodes) {
            if (autoAddNewNodes == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "autoAddNewNodes");
            }
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }
        @CustomType.Setter
        public Builder dbEndpointId(String dbEndpointId) {
            if (dbEndpointId == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "dbEndpointId");
            }
            this.dbEndpointId = dbEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder endpointConfig(String endpointConfig) {
            if (endpointConfig == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "endpointConfig");
            }
            this.endpointConfig = endpointConfig;
            return this;
        }
        @CustomType.Setter
        public Builder endpointType(String endpointType) {
            if (endpointType == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "endpointType");
            }
            this.endpointType = endpointType;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(String nodes) {
            if (nodes == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "nodes");
            }
            this.nodes = nodes;
            return this;
        }
        @CustomType.Setter
        public Builder readWriteMode(String readWriteMode) {
            if (readWriteMode == null) {
              throw new MissingRequiredPropertyException("GetEndpointsEndpoint", "readWriteMode");
            }
            this.readWriteMode = readWriteMode;
            return this;
        }
        public GetEndpointsEndpoint build() {
            final var _resultValue = new GetEndpointsEndpoint();
            _resultValue.addressItems = addressItems;
            _resultValue.autoAddNewNodes = autoAddNewNodes;
            _resultValue.dbEndpointId = dbEndpointId;
            _resultValue.endpointConfig = endpointConfig;
            _resultValue.endpointType = endpointType;
            _resultValue.nodes = nodes;
            _resultValue.readWriteMode = readWriteMode;
            return _resultValue;
        }
    }
}

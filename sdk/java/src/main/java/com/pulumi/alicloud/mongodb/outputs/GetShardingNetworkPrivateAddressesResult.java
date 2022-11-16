// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.outputs;

import com.pulumi.alicloud.mongodb.outputs.GetShardingNetworkPrivateAddressesAddress;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetShardingNetworkPrivateAddressesResult {
    private final List<GetShardingNetworkPrivateAddressesAddress> addresses;
    private final String dbInstanceId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String nodeId;
    private final @Nullable String outputFile;
    private final @Nullable String role;

    @CustomType.Constructor
    private GetShardingNetworkPrivateAddressesResult(
        @CustomType.Parameter("addresses") List<GetShardingNetworkPrivateAddressesAddress> addresses,
        @CustomType.Parameter("dbInstanceId") String dbInstanceId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nodeId") @Nullable String nodeId,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("role") @Nullable String role) {
        this.addresses = addresses;
        this.dbInstanceId = dbInstanceId;
        this.id = id;
        this.nodeId = nodeId;
        this.outputFile = outputFile;
        this.role = role;
    }

    public List<GetShardingNetworkPrivateAddressesAddress> addresses() {
        return this.addresses;
    }
    public String dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShardingNetworkPrivateAddressesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetShardingNetworkPrivateAddressesAddress> addresses;
        private String dbInstanceId;
        private String id;
        private @Nullable String nodeId;
        private @Nullable String outputFile;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(GetShardingNetworkPrivateAddressesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.id = defaults.id;
    	      this.nodeId = defaults.nodeId;
    	      this.outputFile = defaults.outputFile;
    	      this.role = defaults.role;
        }

        public Builder addresses(List<GetShardingNetworkPrivateAddressesAddress> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(GetShardingNetworkPrivateAddressesAddress... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = Objects.requireNonNull(dbInstanceId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }        public GetShardingNetworkPrivateAddressesResult build() {
            return new GetShardingNetworkPrivateAddressesResult(addresses, dbInstanceId, id, nodeId, outputFile, role);
        }
    }
}
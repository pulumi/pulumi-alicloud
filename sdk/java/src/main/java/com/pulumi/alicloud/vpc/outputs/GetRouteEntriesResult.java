// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetRouteEntriesEntry;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteEntriesResult {
    /**
     * @return The destination CIDR block of the route entry.
     * 
     */
    private final @Nullable String cidrBlock;
    /**
     * @return A list of Route Entries. Each element contains the following attributes:
     * 
     */
    private final List<GetRouteEntriesEntry> entries;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The instance ID of the next hop.
     * 
     */
    private final @Nullable String instanceId;
    private final @Nullable String outputFile;
    /**
     * @return The ID of the router table to which the route entry belongs.
     * 
     */
    private final String routeTableId;
    /**
     * @return The type of the route entry.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private GetRouteEntriesResult(
        @CustomType.Parameter("cidrBlock") @Nullable String cidrBlock,
        @CustomType.Parameter("entries") List<GetRouteEntriesEntry> entries,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") @Nullable String instanceId,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("routeTableId") String routeTableId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.cidrBlock = cidrBlock;
        this.entries = entries;
        this.id = id;
        this.instanceId = instanceId;
        this.outputFile = outputFile;
        this.routeTableId = routeTableId;
        this.type = type;
    }

    /**
     * @return The destination CIDR block of the route entry.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * @return A list of Route Entries. Each element contains the following attributes:
     * 
     */
    public List<GetRouteEntriesEntry> entries() {
        return this.entries;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The instance ID of the next hop.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The ID of the router table to which the route entry belongs.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return The type of the route entry.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteEntriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidrBlock;
        private List<GetRouteEntriesEntry> entries;
        private String id;
        private @Nullable String instanceId;
        private @Nullable String outputFile;
        private String routeTableId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteEntriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.entries = defaults.entries;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.outputFile = defaults.outputFile;
    	      this.routeTableId = defaults.routeTableId;
    	      this.type = defaults.type;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder entries(List<GetRouteEntriesEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(GetRouteEntriesEntry... entries) {
            return entries(List.of(entries));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public GetRouteEntriesResult build() {
            return new GetRouteEntriesResult(cidrBlock, entries, id, instanceId, outputFile, routeTableId, type);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpamIpamPoolAllocationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpamIpamPoolAllocationsPlainArgs Empty = new GetIpamIpamPoolAllocationsPlainArgs();

    /**
     * The allocated address segment.
     * 
     */
    @Import(name="cidr")
    private @Nullable String cidr;

    /**
     * @return The allocated address segment.
     * 
     */
    public Optional<String> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * A list of Ipam Pool Allocation IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Ipam Pool Allocation IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The instance ID of the ipam pool allocation.
     * 
     */
    @Import(name="ipamPoolAllocationId")
    private @Nullable String ipamPoolAllocationId;

    /**
     * @return The instance ID of the ipam pool allocation.
     * 
     */
    public Optional<String> ipamPoolAllocationId() {
        return Optional.ofNullable(this.ipamPoolAllocationId);
    }

    /**
     * The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    @Import(name="ipamPoolAllocationName")
    private @Nullable String ipamPoolAllocationName;

    /**
     * @return The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    public Optional<String> ipamPoolAllocationName() {
        return Optional.ofNullable(this.ipamPoolAllocationName);
    }

    /**
     * The ID of the IPAM Pool.
     * 
     */
    @Import(name="ipamPoolId", required=true)
    private String ipamPoolId;

    /**
     * @return The ID of the IPAM Pool.
     * 
     */
    public String ipamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetIpamIpamPoolAllocationsPlainArgs() {}

    private GetIpamIpamPoolAllocationsPlainArgs(GetIpamIpamPoolAllocationsPlainArgs $) {
        this.cidr = $.cidr;
        this.ids = $.ids;
        this.ipamPoolAllocationId = $.ipamPoolAllocationId;
        this.ipamPoolAllocationName = $.ipamPoolAllocationName;
        this.ipamPoolId = $.ipamPoolId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpamIpamPoolAllocationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpamIpamPoolAllocationsPlainArgs $;

        public Builder() {
            $ = new GetIpamIpamPoolAllocationsPlainArgs();
        }

        public Builder(GetIpamIpamPoolAllocationsPlainArgs defaults) {
            $ = new GetIpamIpamPoolAllocationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The allocated address segment.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable String cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param ids A list of Ipam Pool Allocation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ipam Pool Allocation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param ipamPoolAllocationId The instance ID of the ipam pool allocation.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolAllocationId(@Nullable String ipamPoolAllocationId) {
            $.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * @param ipamPoolAllocationName The name of the ipam pool allocation.It must be 1 to 128 characters in length and cannot start with &#39;http:// &#39;or &#39;https.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolAllocationName(@Nullable String ipamPoolAllocationName) {
            $.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * @param ipamPoolId The ID of the IPAM Pool.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolId(String ipamPoolId) {
            $.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetIpamIpamPoolAllocationsPlainArgs build() {
            if ($.ipamPoolId == null) {
                throw new MissingRequiredPropertyException("GetIpamIpamPoolAllocationsPlainArgs", "ipamPoolId");
            }
            return $;
        }
    }

}

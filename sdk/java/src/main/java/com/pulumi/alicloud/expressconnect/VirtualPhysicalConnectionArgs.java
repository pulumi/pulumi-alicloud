// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualPhysicalConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualPhysicalConnectionArgs Empty = new VirtualPhysicalConnectionArgs();

    /**
     * The description of the physical connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the physical connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    @Import(name="expectSpec")
    private @Nullable Output<String> expectSpec;

    /**
     * @return The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    public Optional<Output<String>> expectSpec() {
        return Optional.ofNullable(this.expectSpec);
    }

    /**
     * The payment method of shared dedicated line. Value:
     * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
     * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
     * 
     */
    @Import(name="orderMode", required=true)
    private Output<String> orderMode;

    /**
     * @return The payment method of shared dedicated line. Value:
     * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
     * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
     * 
     */
    public Output<String> orderMode() {
        return this.orderMode;
    }

    /**
     * The ID of the instance of the physical connection.
     * 
     */
    @Import(name="parentPhysicalConnectionId", required=true)
    private Output<String> parentPhysicalConnectionId;

    /**
     * @return The ID of the instance of the physical connection.
     * 
     */
    public Output<String> parentPhysicalConnectionId() {
        return this.parentPhysicalConnectionId;
    }

    /**
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    @Import(name="spec", required=true)
    private Output<String> spec;

    /**
     * @return The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    public Output<String> spec() {
        return this.spec;
    }

    /**
     * The name of the physical connection.
     * 
     */
    @Import(name="virtualPhysicalConnectionName")
    private @Nullable Output<String> virtualPhysicalConnectionName;

    /**
     * @return The name of the physical connection.
     * 
     */
    public Optional<Output<String>> virtualPhysicalConnectionName() {
        return Optional.ofNullable(this.virtualPhysicalConnectionName);
    }

    /**
     * The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
     * 
     */
    @Import(name="vlanId", required=true)
    private Output<Integer> vlanId;

    /**
     * @return The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    @Import(name="vpconnAliUid", required=true)
    private Output<String> vpconnAliUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    public Output<String> vpconnAliUid() {
        return this.vpconnAliUid;
    }

    private VirtualPhysicalConnectionArgs() {}

    private VirtualPhysicalConnectionArgs(VirtualPhysicalConnectionArgs $) {
        this.description = $.description;
        this.dryRun = $.dryRun;
        this.expectSpec = $.expectSpec;
        this.orderMode = $.orderMode;
        this.parentPhysicalConnectionId = $.parentPhysicalConnectionId;
        this.resourceGroupId = $.resourceGroupId;
        this.spec = $.spec;
        this.virtualPhysicalConnectionName = $.virtualPhysicalConnectionName;
        this.vlanId = $.vlanId;
        this.vpconnAliUid = $.vpconnAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualPhysicalConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualPhysicalConnectionArgs $;

        public Builder() {
            $ = new VirtualPhysicalConnectionArgs();
        }

        public Builder(VirtualPhysicalConnectionArgs defaults) {
            $ = new VirtualPhysicalConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dryRun Specifies whether to precheck the API request. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck the API request. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param expectSpec The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
         * 
         * @return builder
         * 
         */
        public Builder expectSpec(@Nullable Output<String> expectSpec) {
            $.expectSpec = expectSpec;
            return this;
        }

        /**
         * @param expectSpec The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
         * 
         * @return builder
         * 
         */
        public Builder expectSpec(String expectSpec) {
            return expectSpec(Output.of(expectSpec));
        }

        /**
         * @param orderMode The payment method of shared dedicated line. Value:
         * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
         * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
         * 
         * @return builder
         * 
         */
        public Builder orderMode(Output<String> orderMode) {
            $.orderMode = orderMode;
            return this;
        }

        /**
         * @param orderMode The payment method of shared dedicated line. Value:
         * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
         * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
         * 
         * @return builder
         * 
         */
        public Builder orderMode(String orderMode) {
            return orderMode(Output.of(orderMode));
        }

        /**
         * @param parentPhysicalConnectionId The ID of the instance of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder parentPhysicalConnectionId(Output<String> parentPhysicalConnectionId) {
            $.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }

        /**
         * @param parentPhysicalConnectionId The ID of the instance of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder parentPhysicalConnectionId(String parentPhysicalConnectionId) {
            return parentPhysicalConnectionId(Output.of(parentPhysicalConnectionId));
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param spec The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<String> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
         * 
         * @return builder
         * 
         */
        public Builder spec(String spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param virtualPhysicalConnectionName The name of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder virtualPhysicalConnectionName(@Nullable Output<String> virtualPhysicalConnectionName) {
            $.virtualPhysicalConnectionName = virtualPhysicalConnectionName;
            return this;
        }

        /**
         * @param virtualPhysicalConnectionName The name of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder virtualPhysicalConnectionName(String virtualPhysicalConnectionName) {
            return virtualPhysicalConnectionName(Output.of(virtualPhysicalConnectionName));
        }

        /**
         * @param vlanId The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        /**
         * @param vpconnAliUid The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
         * 
         * @return builder
         * 
         */
        public Builder vpconnAliUid(Output<String> vpconnAliUid) {
            $.vpconnAliUid = vpconnAliUid;
            return this;
        }

        /**
         * @param vpconnAliUid The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
         * 
         * @return builder
         * 
         */
        public Builder vpconnAliUid(String vpconnAliUid) {
            return vpconnAliUid(Output.of(vpconnAliUid));
        }

        public VirtualPhysicalConnectionArgs build() {
            if ($.orderMode == null) {
                throw new MissingRequiredPropertyException("VirtualPhysicalConnectionArgs", "orderMode");
            }
            if ($.parentPhysicalConnectionId == null) {
                throw new MissingRequiredPropertyException("VirtualPhysicalConnectionArgs", "parentPhysicalConnectionId");
            }
            if ($.spec == null) {
                throw new MissingRequiredPropertyException("VirtualPhysicalConnectionArgs", "spec");
            }
            if ($.vlanId == null) {
                throw new MissingRequiredPropertyException("VirtualPhysicalConnectionArgs", "vlanId");
            }
            if ($.vpconnAliUid == null) {
                throw new MissingRequiredPropertyException("VirtualPhysicalConnectionArgs", "vpconnAliUid");
            }
            return $;
        }
    }

}
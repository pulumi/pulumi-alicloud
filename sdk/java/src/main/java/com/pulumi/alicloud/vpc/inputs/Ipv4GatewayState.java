// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Ipv4GatewayState extends com.pulumi.resources.ResourceArgs {

    public static final Ipv4GatewayState Empty = new Ipv4GatewayState();

    /**
     * The creation time of the resource
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Whether the IPv4 gateway is active or not. Valid values are `true` and `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the IPv4 gateway is active or not. Valid values are `true` and `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The public network traffic mode of the VPC after the IPv4 Gateway is deleted:
     * 
     */
    @Import(name="internetMode")
    private @Nullable Output<String> internetMode;

    /**
     * @return The public network traffic mode of the VPC after the IPv4 Gateway is deleted:
     * 
     */
    public Optional<Output<String>> internetMode() {
        return Optional.ofNullable(this.internetMode);
    }

    /**
     * The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
     * 
     */
    @Import(name="ipv4GatewayDescription")
    private @Nullable Output<String> ipv4GatewayDescription;

    /**
     * @return The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
     * 
     */
    public Optional<Output<String>> ipv4GatewayDescription() {
        return Optional.ofNullable(this.ipv4GatewayDescription);
    }

    /**
     * Resource primary key field.
     * 
     */
    @Import(name="ipv4GatewayId")
    private @Nullable Output<String> ipv4GatewayId;

    /**
     * @return Resource primary key field.
     * 
     */
    public Optional<Output<String>> ipv4GatewayId() {
        return Optional.ofNullable(this.ipv4GatewayId);
    }

    /**
     * The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Import(name="ipv4GatewayName")
    private @Nullable Output<String> ipv4GatewayName;

    /**
     * @return The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Optional<Output<String>> ipv4GatewayName() {
        return Optional.ofNullable(this.ipv4GatewayName);
    }

    /**
     * ID of the route table associated with IPv4 Gateway
     * 
     */
    @Import(name="ipv4GatewayRouteTableId")
    private @Nullable Output<String> ipv4GatewayRouteTableId;

    /**
     * @return ID of the route table associated with IPv4 Gateway
     * 
     */
    public Optional<Output<String>> ipv4GatewayRouteTableId() {
        return Optional.ofNullable(this.ipv4GatewayRouteTableId);
    }

    /**
     * The ID of the resource group to which the instance belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the instance belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of the resource
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags of the current resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the current resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private Ipv4GatewayState() {}

    private Ipv4GatewayState(Ipv4GatewayState $) {
        this.createTime = $.createTime;
        this.dryRun = $.dryRun;
        this.enabled = $.enabled;
        this.internetMode = $.internetMode;
        this.ipv4GatewayDescription = $.ipv4GatewayDescription;
        this.ipv4GatewayId = $.ipv4GatewayId;
        this.ipv4GatewayName = $.ipv4GatewayName;
        this.ipv4GatewayRouteTableId = $.ipv4GatewayRouteTableId;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv4GatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv4GatewayState $;

        public Builder() {
            $ = new Ipv4GatewayState();
        }

        public Builder(Ipv4GatewayState defaults) {
            $ = new Ipv4GatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Value:-**true**: The check request is sent without creating an IPv4 Gateway. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.-**false** (default): Sends a normal request, returns an HTTP 2xx status code and directly creates an IPv4 Gateway.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param enabled Whether the IPv4 gateway is active or not. Valid values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the IPv4 gateway is active or not. Valid values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param internetMode The public network traffic mode of the VPC after the IPv4 Gateway is deleted:
         * 
         * @return builder
         * 
         */
        public Builder internetMode(@Nullable Output<String> internetMode) {
            $.internetMode = internetMode;
            return this;
        }

        /**
         * @param internetMode The public network traffic mode of the VPC after the IPv4 Gateway is deleted:
         * 
         * @return builder
         * 
         */
        public Builder internetMode(String internetMode) {
            return internetMode(Output.of(internetMode));
        }

        /**
         * @param ipv4GatewayDescription The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayDescription(@Nullable Output<String> ipv4GatewayDescription) {
            $.ipv4GatewayDescription = ipv4GatewayDescription;
            return this;
        }

        /**
         * @param ipv4GatewayDescription The description of the IPv4 gateway. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayDescription(String ipv4GatewayDescription) {
            return ipv4GatewayDescription(Output.of(ipv4GatewayDescription));
        }

        /**
         * @param ipv4GatewayId Resource primary key field.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayId(@Nullable Output<String> ipv4GatewayId) {
            $.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * @param ipv4GatewayId Resource primary key field.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            return ipv4GatewayId(Output.of(ipv4GatewayId));
        }

        /**
         * @param ipv4GatewayName The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayName(@Nullable Output<String> ipv4GatewayName) {
            $.ipv4GatewayName = ipv4GatewayName;
            return this;
        }

        /**
         * @param ipv4GatewayName The name of the IPv4 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayName(String ipv4GatewayName) {
            return ipv4GatewayName(Output.of(ipv4GatewayName));
        }

        /**
         * @param ipv4GatewayRouteTableId ID of the route table associated with IPv4 Gateway
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayRouteTableId(@Nullable Output<String> ipv4GatewayRouteTableId) {
            $.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
            return this;
        }

        /**
         * @param ipv4GatewayRouteTableId ID of the route table associated with IPv4 Gateway
         * 
         * @return builder
         * 
         */
        public Builder ipv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
            return ipv4GatewayRouteTableId(Output.of(ipv4GatewayRouteTableId));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags of the current resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the current resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) where you want to create the IPv4 gateway. You can create only one IPv4 gateway in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public Ipv4GatewayState build() {
            return $;
        }
    }

}

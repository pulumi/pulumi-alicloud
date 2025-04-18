// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.alicloud.cen.inputs.TransitRouterVpcAttachmentZoneMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterVpcAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterVpcAttachmentState Empty = new TransitRouterVpcAttachmentState();

    /**
     * Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to VPCs. Valid values:
     * - **false:** (default)
     * 
     */
    @Import(name="autoPublishRouteEnabled")
    private @Nullable Output<Boolean> autoPublishRouteEnabled;

    /**
     * @return Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to VPCs. Valid values:
     * - **false:** (default)
     * 
     */
    public Optional<Output<Boolean>> autoPublishRouteEnabled() {
        return Optional.ofNullable(this.autoPublishRouteEnabled);
    }

    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     * 
     */
    @Import(name="cenId")
    private @Nullable Output<String> cenId;

    /**
     * @return The ID of the Cloud Enterprise Network (CEN) instance.
     * 
     */
    public Optional<Output<String>> cenId() {
        return Optional.ofNullable(this.cenId);
    }

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
     * Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Whether to forcibly delete the VPC connection. The value is:
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    /**
     * @return Whether to forcibly delete the VPC connection. The value is:
     * 
     */
    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * The billing method. The default value is `PayAsYouGo`, which specifies the pay-as-you-go billing method.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The billing method. The default value is `PayAsYouGo`, which specifies the pay-as-you-go billing method.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
     * 
     * @deprecated
     * Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
     * 
     */
    @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
    @Import(name="routeTableAssociationEnabled")
    private @Nullable Output<Boolean> routeTableAssociationEnabled;

    /**
     * @return Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
     * 
     * @deprecated
     * Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
     * 
     */
    @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
    public Optional<Output<Boolean>> routeTableAssociationEnabled() {
        return Optional.ofNullable(this.routeTableAssociationEnabled);
    }

    /**
     * Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
     * 
     * @deprecated
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
     * 
     */
    @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
    @Import(name="routeTablePropagationEnabled")
    private @Nullable Output<Boolean> routeTablePropagationEnabled;

    /**
     * @return Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
     * 
     * @deprecated
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
     * 
     */
    @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
    public Optional<Output<Boolean>> routeTablePropagationEnabled() {
        return Optional.ofNullable(this.routeTablePropagationEnabled);
    }

    /**
     * Status
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The description of the VPC connection.
     * 
     * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="transitRouterAttachmentDescription")
    private @Nullable Output<String> transitRouterAttachmentDescription;

    /**
     * @return The description of the VPC connection.
     * 
     * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentDescription() {
        return Optional.ofNullable(this.transitRouterAttachmentDescription);
    }

    /**
     * The ID of the Transit Router Attachment.
     * 
     */
    @Import(name="transitRouterAttachmentId")
    private @Nullable Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the Transit Router Attachment.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }

    /**
     * . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;transit_router_attachment_name&#39; has been deprecated since provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'transit_router_attachment_name' has been deprecated since provider version 1.230.1. New field 'transit_router_vpc_attachment_name' instead. */
    @Import(name="transitRouterAttachmentName")
    private @Nullable Output<String> transitRouterAttachmentName;

    /**
     * @return . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;transit_router_attachment_name&#39; has been deprecated since provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'transit_router_attachment_name' has been deprecated since provider version 1.230.1. New field 'transit_router_vpc_attachment_name' instead. */
    public Optional<Output<String>> transitRouterAttachmentName() {
        return Optional.ofNullable(this.transitRouterAttachmentName);
    }

    /**
     * The ID of the Enterprise Edition transit router.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the Enterprise Edition transit router.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    /**
     * The name of the VPC connection.
     * 
     * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
     * 
     */
    @Import(name="transitRouterVpcAttachmentName")
    private @Nullable Output<String> transitRouterVpcAttachmentName;

    /**
     * @return The name of the VPC connection.
     * 
     * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
     * 
     */
    public Optional<Output<String>> transitRouterVpcAttachmentName() {
        return Optional.ofNullable(this.transitRouterVpcAttachmentName);
    }

    /**
     * TransitRouterVpcAttachmentOptions
     * 
     */
    @Import(name="transitRouterVpcAttachmentOptions")
    private @Nullable Output<Map<String,String>> transitRouterVpcAttachmentOptions;

    /**
     * @return TransitRouterVpcAttachmentOptions
     * 
     */
    public Optional<Output<Map<String,String>>> transitRouterVpcAttachmentOptions() {
        return Optional.ofNullable(this.transitRouterVpcAttachmentOptions);
    }

    /**
     * The VPC ID.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * VpcOwnerId
     * 
     */
    @Import(name="vpcOwnerId")
    private @Nullable Output<Integer> vpcOwnerId;

    /**
     * @return VpcOwnerId
     * 
     */
    public Optional<Output<Integer>> vpcOwnerId() {
        return Optional.ofNullable(this.vpcOwnerId);
    }

    /**
     * ZoneMappingss See `zone_mappings` below.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="zoneMappings")
    private @Nullable Output<List<TransitRouterVpcAttachmentZoneMappingArgs>> zoneMappings;

    /**
     * @return ZoneMappingss See `zone_mappings` below.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<List<TransitRouterVpcAttachmentZoneMappingArgs>>> zoneMappings() {
        return Optional.ofNullable(this.zoneMappings);
    }

    private TransitRouterVpcAttachmentState() {}

    private TransitRouterVpcAttachmentState(TransitRouterVpcAttachmentState $) {
        this.autoPublishRouteEnabled = $.autoPublishRouteEnabled;
        this.cenId = $.cenId;
        this.createTime = $.createTime;
        this.dryRun = $.dryRun;
        this.forceDelete = $.forceDelete;
        this.paymentType = $.paymentType;
        this.resourceType = $.resourceType;
        this.routeTableAssociationEnabled = $.routeTableAssociationEnabled;
        this.routeTablePropagationEnabled = $.routeTablePropagationEnabled;
        this.status = $.status;
        this.tags = $.tags;
        this.transitRouterAttachmentDescription = $.transitRouterAttachmentDescription;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterAttachmentName = $.transitRouterAttachmentName;
        this.transitRouterId = $.transitRouterId;
        this.transitRouterVpcAttachmentName = $.transitRouterVpcAttachmentName;
        this.transitRouterVpcAttachmentOptions = $.transitRouterVpcAttachmentOptions;
        this.vpcId = $.vpcId;
        this.vpcOwnerId = $.vpcOwnerId;
        this.zoneMappings = $.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterVpcAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterVpcAttachmentState $;

        public Builder() {
            $ = new TransitRouterVpcAttachmentState();
        }

        public Builder(TransitRouterVpcAttachmentState defaults) {
            $ = new TransitRouterVpcAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPublishRouteEnabled Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to VPCs. Valid values:
         * - **false:** (default)
         * 
         * @return builder
         * 
         */
        public Builder autoPublishRouteEnabled(@Nullable Output<Boolean> autoPublishRouteEnabled) {
            $.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }

        /**
         * @param autoPublishRouteEnabled Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to VPCs. Valid values:
         * - **false:** (default)
         * 
         * @return builder
         * 
         */
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            return autoPublishRouteEnabled(Output.of(autoPublishRouteEnabled));
        }

        /**
         * @param cenId The ID of the Cloud Enterprise Network (CEN) instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(@Nullable Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the Cloud Enterprise Network (CEN) instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
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
         * @param dryRun Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param forceDelete Whether to forcibly delete the VPC connection. The value is:
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete Whether to forcibly delete the VPC connection. The value is:
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param paymentType The billing method. The default value is `PayAsYouGo`, which specifies the pay-as-you-go billing method.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The billing method. The default value is `PayAsYouGo`, which specifies the pay-as-you-go billing method.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param resourceType The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
         * 
         */
        @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
        public Builder routeTableAssociationEnabled(@Nullable Output<Boolean> routeTableAssociationEnabled) {
            $.routeTableAssociationEnabled = routeTableAssociationEnabled;
            return this;
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
         * 
         */
        @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
        public Builder routeTableAssociationEnabled(Boolean routeTableAssociationEnabled) {
            return routeTableAssociationEnabled(Output.of(routeTableAssociationEnabled));
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
         * 
         */
        @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
        public Builder routeTablePropagationEnabled(@Nullable Output<Boolean> routeTablePropagationEnabled) {
            $.routeTablePropagationEnabled = routeTablePropagationEnabled;
            return this;
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
         * 
         */
        @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
        public Builder routeTablePropagationEnabled(Boolean routeTablePropagationEnabled) {
            return routeTablePropagationEnabled(Output.of(routeTablePropagationEnabled));
        }

        /**
         * @param status Status
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitRouterAttachmentDescription The description of the VPC connection.
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(@Nullable Output<String> transitRouterAttachmentDescription) {
            $.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * @param transitRouterAttachmentDescription The description of the VPC connection.
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            return transitRouterAttachmentDescription(Output.of(transitRouterAttachmentDescription));
        }

        /**
         * @param transitRouterAttachmentId The ID of the Transit Router Attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(@Nullable Output<String> transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterAttachmentId The ID of the Transit Router Attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            return transitRouterAttachmentId(Output.of(transitRouterAttachmentId));
        }

        /**
         * @param transitRouterAttachmentName . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;transit_router_attachment_name&#39; has been deprecated since provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'transit_router_attachment_name' has been deprecated since provider version 1.230.1. New field 'transit_router_vpc_attachment_name' instead. */
        public Builder transitRouterAttachmentName(@Nullable Output<String> transitRouterAttachmentName) {
            $.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        /**
         * @param transitRouterAttachmentName . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;transit_router_attachment_name&#39; has been deprecated since provider version 1.230.1. New field &#39;transit_router_vpc_attachment_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'transit_router_attachment_name' has been deprecated since provider version 1.230.1. New field 'transit_router_vpc_attachment_name' instead. */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            return transitRouterAttachmentName(Output.of(transitRouterAttachmentName));
        }

        /**
         * @param transitRouterId The ID of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        /**
         * @param transitRouterVpcAttachmentName The name of the VPC connection.
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterVpcAttachmentName(@Nullable Output<String> transitRouterVpcAttachmentName) {
            $.transitRouterVpcAttachmentName = transitRouterVpcAttachmentName;
            return this;
        }

        /**
         * @param transitRouterVpcAttachmentName The name of the VPC connection.
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterVpcAttachmentName(String transitRouterVpcAttachmentName) {
            return transitRouterVpcAttachmentName(Output.of(transitRouterVpcAttachmentName));
        }

        /**
         * @param transitRouterVpcAttachmentOptions TransitRouterVpcAttachmentOptions
         * 
         * @return builder
         * 
         */
        public Builder transitRouterVpcAttachmentOptions(@Nullable Output<Map<String,String>> transitRouterVpcAttachmentOptions) {
            $.transitRouterVpcAttachmentOptions = transitRouterVpcAttachmentOptions;
            return this;
        }

        /**
         * @param transitRouterVpcAttachmentOptions TransitRouterVpcAttachmentOptions
         * 
         * @return builder
         * 
         */
        public Builder transitRouterVpcAttachmentOptions(Map<String,String> transitRouterVpcAttachmentOptions) {
            return transitRouterVpcAttachmentOptions(Output.of(transitRouterVpcAttachmentOptions));
        }

        /**
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcOwnerId VpcOwnerId
         * 
         * @return builder
         * 
         */
        public Builder vpcOwnerId(@Nullable Output<Integer> vpcOwnerId) {
            $.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * @param vpcOwnerId VpcOwnerId
         * 
         * @return builder
         * 
         */
        public Builder vpcOwnerId(Integer vpcOwnerId) {
            return vpcOwnerId(Output.of(vpcOwnerId));
        }

        /**
         * @param zoneMappings ZoneMappingss See `zone_mappings` below.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(@Nullable Output<List<TransitRouterVpcAttachmentZoneMappingArgs>> zoneMappings) {
            $.zoneMappings = zoneMappings;
            return this;
        }

        /**
         * @param zoneMappings ZoneMappingss See `zone_mappings` below.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(List<TransitRouterVpcAttachmentZoneMappingArgs> zoneMappings) {
            return zoneMappings(Output.of(zoneMappings));
        }

        /**
         * @param zoneMappings ZoneMappingss See `zone_mappings` below.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder zoneMappings(TransitRouterVpcAttachmentZoneMappingArgs... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }

        public TransitRouterVpcAttachmentState build() {
            return $;
        }
    }

}

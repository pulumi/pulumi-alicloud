// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterVbrAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterVbrAttachmentArgs Empty = new TransitRouterVbrAttachmentArgs();

    /**
     * Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to the VBR. Default value: `false`. Valid values:
     * 
     */
    @Import(name="autoPublishRouteEnabled")
    private @Nullable Output<Boolean> autoPublishRouteEnabled;

    /**
     * @return Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to the VBR. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> autoPublishRouteEnabled() {
        return Optional.ofNullable(this.autoPublishRouteEnabled);
    }

    /**
     * The ID of the CEN.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The resource type of the transit router vbr attachment. Default value: `VBR`. Valid values: `VBR`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type of the transit router vbr attachment. Default value: `VBR`. Valid values: `VBR`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
     * 
     * @deprecated
     * Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
     * 
     */
    @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
    @Import(name="routeTableAssociationEnabled")
    private @Nullable Output<Boolean> routeTableAssociationEnabled;

    /**
     * @return Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
     * 
     * @deprecated
     * Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
     * 
     */
    @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
    public Optional<Output<Boolean>> routeTableAssociationEnabled() {
        return Optional.ofNullable(this.routeTableAssociationEnabled);
    }

    /**
     * Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
     * 
     * -&gt;**NOTE:** Ensure that the vbr is not used in Express Connect.
     * 
     * @deprecated
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
     * 
     */
    @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
    @Import(name="routeTablePropagationEnabled")
    private @Nullable Output<Boolean> routeTablePropagationEnabled;

    /**
     * @return Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
     * 
     * -&gt;**NOTE:** Ensure that the vbr is not used in Express Connect.
     * 
     * @deprecated
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
     * 
     */
    @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
    public Optional<Output<Boolean>> routeTablePropagationEnabled() {
        return Optional.ofNullable(this.routeTablePropagationEnabled);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The description of the transit router vbr attachment.
     * 
     */
    @Import(name="transitRouterAttachmentDescription")
    private @Nullable Output<String> transitRouterAttachmentDescription;

    /**
     * @return The description of the transit router vbr attachment.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentDescription() {
        return Optional.ofNullable(this.transitRouterAttachmentDescription);
    }

    /**
     * The name of the transit router vbr attachment.
     * 
     */
    @Import(name="transitRouterAttachmentName")
    private @Nullable Output<String> transitRouterAttachmentName;

    /**
     * @return The name of the transit router vbr attachment.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentName() {
        return Optional.ofNullable(this.transitRouterAttachmentName);
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    /**
     * The ID of the VBR.
     * 
     */
    @Import(name="vbrId", required=true)
    private Output<String> vbrId;

    /**
     * @return The ID of the VBR.
     * 
     */
    public Output<String> vbrId() {
        return this.vbrId;
    }

    /**
     * The owner id of the vbr.
     * 
     */
    @Import(name="vbrOwnerId")
    private @Nullable Output<String> vbrOwnerId;

    /**
     * @return The owner id of the vbr.
     * 
     */
    public Optional<Output<String>> vbrOwnerId() {
        return Optional.ofNullable(this.vbrOwnerId);
    }

    private TransitRouterVbrAttachmentArgs() {}

    private TransitRouterVbrAttachmentArgs(TransitRouterVbrAttachmentArgs $) {
        this.autoPublishRouteEnabled = $.autoPublishRouteEnabled;
        this.cenId = $.cenId;
        this.dryRun = $.dryRun;
        this.resourceType = $.resourceType;
        this.routeTableAssociationEnabled = $.routeTableAssociationEnabled;
        this.routeTablePropagationEnabled = $.routeTablePropagationEnabled;
        this.tags = $.tags;
        this.transitRouterAttachmentDescription = $.transitRouterAttachmentDescription;
        this.transitRouterAttachmentName = $.transitRouterAttachmentName;
        this.transitRouterId = $.transitRouterId;
        this.vbrId = $.vbrId;
        this.vbrOwnerId = $.vbrOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterVbrAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterVbrAttachmentArgs $;

        public Builder() {
            $ = new TransitRouterVbrAttachmentArgs();
        }

        public Builder(TransitRouterVbrAttachmentArgs defaults) {
            $ = new TransitRouterVbrAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPublishRouteEnabled Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to the VBR. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder autoPublishRouteEnabled(@Nullable Output<Boolean> autoPublishRouteEnabled) {
            $.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }

        /**
         * @param autoPublishRouteEnabled Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to the VBR. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            return autoPublishRouteEnabled(Output.of(autoPublishRouteEnabled));
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param dryRun Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param resourceType The resource type of the transit router vbr attachment. Default value: `VBR`. Valid values: `VBR`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type of the transit router vbr attachment. Default value: `VBR`. Valid values: `VBR`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
         * 
         */
        @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
        public Builder routeTableAssociationEnabled(@Nullable Output<Boolean> routeTableAssociationEnabled) {
            $.routeTableAssociationEnabled = routeTableAssociationEnabled;
            return this;
        }

        /**
         * @param routeTableAssociationEnabled Whether to enabled route table association. **NOTE:** &#34;Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association.&#34;
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead.
         * 
         */
        @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead. */
        public Builder routeTableAssociationEnabled(Boolean routeTableAssociationEnabled) {
            return routeTableAssociationEnabled(Output.of(routeTableAssociationEnabled));
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
         * 
         * -&gt;**NOTE:** Ensure that the vbr is not used in Express Connect.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
         * 
         */
        @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
        public Builder routeTablePropagationEnabled(@Nullable Output<Boolean> routeTablePropagationEnabled) {
            $.routeTablePropagationEnabled = routeTablePropagationEnabled;
            return this;
        }

        /**
         * @param routeTablePropagationEnabled Whether to enabled route table propagation. **NOTE:** &#34;Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation.&#34;
         * 
         * -&gt;**NOTE:** Ensure that the vbr is not used in Express Connect.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead.
         * 
         */
        @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.233.1. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead. */
        public Builder routeTablePropagationEnabled(Boolean routeTablePropagationEnabled) {
            return routeTablePropagationEnabled(Output.of(routeTablePropagationEnabled));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitRouterAttachmentDescription The description of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(@Nullable Output<String> transitRouterAttachmentDescription) {
            $.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * @param transitRouterAttachmentDescription The description of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            return transitRouterAttachmentDescription(Output.of(transitRouterAttachmentDescription));
        }

        /**
         * @param transitRouterAttachmentName The name of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentName(@Nullable Output<String> transitRouterAttachmentName) {
            $.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        /**
         * @param transitRouterAttachmentName The name of the transit router vbr attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            return transitRouterAttachmentName(Output.of(transitRouterAttachmentName));
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        /**
         * @param vbrId The ID of the VBR.
         * 
         * @return builder
         * 
         */
        public Builder vbrId(Output<String> vbrId) {
            $.vbrId = vbrId;
            return this;
        }

        /**
         * @param vbrId The ID of the VBR.
         * 
         * @return builder
         * 
         */
        public Builder vbrId(String vbrId) {
            return vbrId(Output.of(vbrId));
        }

        /**
         * @param vbrOwnerId The owner id of the vbr.
         * 
         * @return builder
         * 
         */
        public Builder vbrOwnerId(@Nullable Output<String> vbrOwnerId) {
            $.vbrOwnerId = vbrOwnerId;
            return this;
        }

        /**
         * @param vbrOwnerId The owner id of the vbr.
         * 
         * @return builder
         * 
         */
        public Builder vbrOwnerId(String vbrOwnerId) {
            return vbrOwnerId(Output.of(vbrOwnerId));
        }

        public TransitRouterVbrAttachmentArgs build() {
            if ($.cenId == null) {
                throw new MissingRequiredPropertyException("TransitRouterVbrAttachmentArgs", "cenId");
            }
            if ($.vbrId == null) {
                throw new MissingRequiredPropertyException("TransitRouterVbrAttachmentArgs", "vbrId");
            }
            return $;
        }
    }

}

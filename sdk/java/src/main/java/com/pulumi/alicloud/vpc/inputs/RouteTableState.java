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


public final class RouteTableState extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableState Empty = new RouteTableState();

    /**
     * The type of cloud resource that is bound to the routing table. Value:
     * - `VSwitch`: switch.
     * - `Gateway`:IPv4 Gateway.
     * 
     */
    @Import(name="associateType")
    private @Nullable Output<String> associateType;

    /**
     * @return The type of cloud resource that is bound to the routing table. Value:
     * - `VSwitch`: switch.
     * - `Gateway`:IPv4 Gateway.
     * 
     */
    public Optional<Output<String>> associateType() {
        return Optional.ofNullable(this.associateType);
    }

    /**
     * The creation time of the routing table
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the routing table
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the routing table.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the routing table.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.119.1. New field 'route_table_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.119.1. New field &#39;route_table_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.119.1. New field 'route_table_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Resource group ID.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return Resource group ID.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Route Table Receive Propagate Route State
     * 
     */
    @Import(name="routePropagationEnable")
    private @Nullable Output<Boolean> routePropagationEnable;

    /**
     * @return Route Table Receive Propagate Route State
     * 
     */
    public Optional<Output<Boolean>> routePropagationEnable() {
        return Optional.ofNullable(this.routePropagationEnable);
    }

    /**
     * The name of the routing table.
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    /**
     * @return The name of the routing table.
     * 
     */
    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

    /**
     * Routing table state
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Routing table state
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of VPC.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of VPC.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private RouteTableState() {}

    private RouteTableState(RouteTableState $) {
        this.associateType = $.associateType;
        this.createTime = $.createTime;
        this.description = $.description;
        this.name = $.name;
        this.resourceGroupId = $.resourceGroupId;
        this.routePropagationEnable = $.routePropagationEnable;
        this.routeTableName = $.routeTableName;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteTableState $;

        public Builder() {
            $ = new RouteTableState();
        }

        public Builder(RouteTableState defaults) {
            $ = new RouteTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param associateType The type of cloud resource that is bound to the routing table. Value:
         * - `VSwitch`: switch.
         * - `Gateway`:IPv4 Gateway.
         * 
         * @return builder
         * 
         */
        public Builder associateType(@Nullable Output<String> associateType) {
            $.associateType = associateType;
            return this;
        }

        /**
         * @param associateType The type of cloud resource that is bound to the routing table. Value:
         * - `VSwitch`: switch.
         * - `Gateway`:IPv4 Gateway.
         * 
         * @return builder
         * 
         */
        public Builder associateType(String associateType) {
            return associateType(Output.of(associateType));
        }

        /**
         * @param createTime The creation time of the routing table
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the routing table
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the routing table.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the routing table.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.119.1. New field 'route_table_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.119.1. New field &#39;route_table_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.119.1. New field 'route_table_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupId Resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId Resource group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param routePropagationEnable Route Table Receive Propagate Route State
         * 
         * @return builder
         * 
         */
        public Builder routePropagationEnable(@Nullable Output<Boolean> routePropagationEnable) {
            $.routePropagationEnable = routePropagationEnable;
            return this;
        }

        /**
         * @param routePropagationEnable Route Table Receive Propagate Route State
         * 
         * @return builder
         * 
         */
        public Builder routePropagationEnable(Boolean routePropagationEnable) {
            return routePropagationEnable(Output.of(routePropagationEnable));
        }

        /**
         * @param routeTableName The name of the routing table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        /**
         * @param routeTableName The name of the routing table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(String routeTableName) {
            return routeTableName(Output.of(routeTableName));
        }

        /**
         * @param status Routing table state
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Routing table state
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tag
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of VPC.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of VPC.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public RouteTableState build() {
            return $;
        }
    }

}

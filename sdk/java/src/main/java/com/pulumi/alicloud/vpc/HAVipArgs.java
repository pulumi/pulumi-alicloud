// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HAVipArgs extends com.pulumi.resources.ResourceArgs {

    public static final HAVipArgs Empty = new HAVipArgs();

    /**
     * The description of the HaVip instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the HaVip instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the HAVIP.
     * 
     */
    @Import(name="haVipName")
    private @Nullable Output<String> haVipName;

    /**
     * @return The name of the HAVIP.
     * 
     */
    public Optional<Output<String>> haVipName() {
        return Optional.ofNullable(this.haVipName);
    }

    /**
     * The name of the HaVip instance.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    @Import(name="havipName")
    private @Nullable Output<String> havipName;

    /**
     * @return The name of the HaVip instance.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    public Optional<Output<String>> havipName() {
        return Optional.ofNullable(this.havipName);
    }

    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The ID of the resource group to which the HAVIP belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the HAVIP belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The list of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The list of tags.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The vswitch_id of the HaVip, the field can&#39;t be changed.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The vswitch_id of the HaVip, the field can&#39;t be changed.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private HAVipArgs() {}

    private HAVipArgs(HAVipArgs $) {
        this.description = $.description;
        this.haVipName = $.haVipName;
        this.havipName = $.havipName;
        this.ipAddress = $.ipAddress;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HAVipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HAVipArgs $;

        public Builder() {
            $ = new HAVipArgs();
        }

        public Builder(HAVipArgs defaults) {
            $ = new HAVipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the HaVip instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the HaVip instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param haVipName The name of the HAVIP.
         * 
         * @return builder
         * 
         */
        public Builder haVipName(@Nullable Output<String> haVipName) {
            $.haVipName = haVipName;
            return this;
        }

        /**
         * @param haVipName The name of the HAVIP.
         * 
         * @return builder
         * 
         */
        public Builder haVipName(String haVipName) {
            return haVipName(Output.of(haVipName));
        }

        /**
         * @param havipName The name of the HaVip instance.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
        public Builder havipName(@Nullable Output<String> havipName) {
            $.havipName = havipName;
            return this;
        }

        /**
         * @param havipName The name of the HaVip instance.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
        public Builder havipName(String havipName) {
            return havipName(Output.of(havipName));
        }

        /**
         * @param ipAddress The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the HAVIP belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the HAVIP belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId The vswitch_id of the HaVip, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The vswitch_id of the HaVip, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public HAVipArgs build() {
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("HAVipArgs", "vswitchId");
            }
            return $;
        }
    }

}
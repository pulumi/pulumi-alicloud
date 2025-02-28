// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * Specifies whether to perform a dry run, without performing the actual request. Valid values:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform a dry run, without performing the actual request. Valid values:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The description of the listener.
     * 
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    @Import(name="listenerDescription")
    private @Nullable Output<String> listenerDescription;

    /**
     * @return The description of the listener.
     * 
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> listenerDescription() {
        return Optional.ofNullable(this.listenerDescription);
    }

    /**
     * The GWLB instance ID.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private Output<String> loadBalancerId;

    /**
     * @return The GWLB instance ID.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * The server group ID.
     * 
     */
    @Import(name="serverGroupId", required=true)
    private Output<String> serverGroupId;

    /**
     * @return The server group ID.
     * 
     */
    public Output<String> serverGroupId() {
        return this.serverGroupId;
    }

    /**
     * The tags. You can specify at most 20 tags in each call.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags. You can specify at most 20 tags in each call.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.dryRun = $.dryRun;
        this.listenerDescription = $.listenerDescription;
        this.loadBalancerId = $.loadBalancerId;
        this.serverGroupId = $.serverGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Specifies whether to perform a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param listenerDescription The description of the listener.
         * 
         * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder listenerDescription(@Nullable Output<String> listenerDescription) {
            $.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * @param listenerDescription The description of the listener.
         * 
         * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder listenerDescription(String listenerDescription) {
            return listenerDescription(Output.of(listenerDescription));
        }

        /**
         * @param loadBalancerId The GWLB instance ID.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The GWLB instance ID.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param serverGroupId The server group ID.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(Output<String> serverGroupId) {
            $.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * @param serverGroupId The server group ID.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(String serverGroupId) {
            return serverGroupId(Output.of(serverGroupId));
        }

        /**
         * @param tags The tags. You can specify at most 20 tags in each call.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags. You can specify at most 20 tags in each call.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ListenerArgs build() {
            if ($.loadBalancerId == null) {
                throw new MissingRequiredPropertyException("ListenerArgs", "loadBalancerId");
            }
            if ($.serverGroupId == null) {
                throw new MissingRequiredPropertyException("ListenerArgs", "serverGroupId");
            }
            return $;
        }
    }

}

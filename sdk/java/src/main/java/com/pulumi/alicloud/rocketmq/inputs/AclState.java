// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclState extends com.pulumi.resources.ResourceArgs {

    public static final AclState Empty = new AclState();

    /**
     * The type of operations that can be performed on the resource. Valid values:
     * - If `resource_type` is set to `Topic`. Valid values: `Pub`, `Sub`.
     * - If `resource_type` is set to `Group`. Valid values: `Sub`.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<String>> actions;

    /**
     * @return The type of operations that can be performed on the resource. Valid values:
     * - If `resource_type` is set to `Topic`. Valid values: `Pub`, `Sub`.
     * - If `resource_type` is set to `Group`. Valid values: `Sub`.
     * 
     */
    public Optional<Output<List<String>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * The decision result of the authorization. Valid values: `Deny`, `Allow`.
     * 
     */
    @Import(name="decision")
    private @Nullable Output<String> decision;

    /**
     * @return The decision result of the authorization. Valid values: `Deny`, `Allow`.
     * 
     */
    public Optional<Output<String>> decision() {
        return Optional.ofNullable(this.decision);
    }

    /**
     * The instance ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The instance ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The IP address whitelists.
     * 
     */
    @Import(name="ipWhitelists")
    private @Nullable Output<List<String>> ipWhitelists;

    /**
     * @return The IP address whitelists.
     * 
     */
    public Optional<Output<List<String>>> ipWhitelists() {
        return Optional.ofNullable(this.ipWhitelists);
    }

    /**
     * The name of the resource on which you want to grant permissions.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the resource on which you want to grant permissions.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * The type of the resource on which you want to grant permissions. Valid values: `Group`, `Topic`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of the resource on which you want to grant permissions. Valid values: `Group`, `Topic`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The username of the account.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username of the account.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private AclState() {}

    private AclState(AclState $) {
        this.actions = $.actions;
        this.decision = $.decision;
        this.instanceId = $.instanceId;
        this.ipWhitelists = $.ipWhitelists;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclState $;

        public Builder() {
            $ = new AclState();
        }

        public Builder(AclState defaults) {
            $ = new AclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The type of operations that can be performed on the resource. Valid values:
         * - If `resource_type` is set to `Topic`. Valid values: `Pub`, `Sub`.
         * - If `resource_type` is set to `Group`. Valid values: `Sub`.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The type of operations that can be performed on the resource. Valid values:
         * - If `resource_type` is set to `Topic`. Valid values: `Pub`, `Sub`.
         * - If `resource_type` is set to `Group`. Valid values: `Sub`.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The type of operations that can be performed on the resource. Valid values:
         * - If `resource_type` is set to `Topic`. Valid values: `Pub`, `Sub`.
         * - If `resource_type` is set to `Group`. Valid values: `Sub`.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param decision The decision result of the authorization. Valid values: `Deny`, `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder decision(@Nullable Output<String> decision) {
            $.decision = decision;
            return this;
        }

        /**
         * @param decision The decision result of the authorization. Valid values: `Deny`, `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder decision(String decision) {
            return decision(Output.of(decision));
        }

        /**
         * @param instanceId The instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param ipWhitelists The IP address whitelists.
         * 
         * @return builder
         * 
         */
        public Builder ipWhitelists(@Nullable Output<List<String>> ipWhitelists) {
            $.ipWhitelists = ipWhitelists;
            return this;
        }

        /**
         * @param ipWhitelists The IP address whitelists.
         * 
         * @return builder
         * 
         */
        public Builder ipWhitelists(List<String> ipWhitelists) {
            return ipWhitelists(Output.of(ipWhitelists));
        }

        /**
         * @param ipWhitelists The IP address whitelists.
         * 
         * @return builder
         * 
         */
        public Builder ipWhitelists(String... ipWhitelists) {
            return ipWhitelists(List.of(ipWhitelists));
        }

        /**
         * @param resourceName The name of the resource on which you want to grant permissions.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource on which you want to grant permissions.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType The type of the resource on which you want to grant permissions. Valid values: `Group`, `Topic`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the resource on which you want to grant permissions. Valid values: `Group`, `Topic`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param username The username of the account.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AclState build() {
            return $;
        }
    }

}

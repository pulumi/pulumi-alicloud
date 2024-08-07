// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseProxyState extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseProxyState Empty = new EnterpriseProxyState();

    /**
     * The ID of the database instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the database instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The password of the database account.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the database account.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the tenant.
     * 
     */
    @Import(name="tid")
    private @Nullable Output<String> tid;

    /**
     * @return The ID of the tenant.
     * 
     */
    public Optional<Output<String>> tid() {
        return Optional.ofNullable(this.tid);
    }

    /**
     * The username of the database account.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username of the database account.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private EnterpriseProxyState() {}

    private EnterpriseProxyState(EnterpriseProxyState $) {
        this.instanceId = $.instanceId;
        this.password = $.password;
        this.tid = $.tid;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseProxyState $;

        public Builder() {
            $ = new EnterpriseProxyState();
        }

        public Builder(EnterpriseProxyState defaults) {
            $ = new EnterpriseProxyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The ID of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param password The password of the database account.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the database account.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param tid The ID of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tid(@Nullable Output<String> tid) {
            $.tid = tid;
            return this;
        }

        /**
         * @param tid The ID of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tid(String tid) {
            return tid(Output.of(tid));
        }

        /**
         * @param username The username of the database account.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the database account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public EnterpriseProxyState build() {
            return $;
        }
    }

}

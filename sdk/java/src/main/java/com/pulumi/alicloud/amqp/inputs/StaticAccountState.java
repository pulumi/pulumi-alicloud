// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticAccountState extends com.pulumi.resources.ResourceArgs {

    public static final StaticAccountState Empty = new StaticAccountState();

    /**
     * Access key.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Access key.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * The timestamp that indicates when the pair of static username and password was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<Integer> createTime;

    /**
     * @return The timestamp that indicates when the pair of static username and password was created.
     * 
     */
    public Optional<Output<Integer>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Amqp instance ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Amqp instance ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The ID of the user&#39;s primary account.
     * 
     */
    @Import(name="masterUid")
    private @Nullable Output<String> masterUid;

    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    public Optional<Output<String>> masterUid() {
        return Optional.ofNullable(this.masterUid);
    }

    /**
     * The static password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The static password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Secret key.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Secret key.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * The static username.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The static username.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private StaticAccountState() {}

    private StaticAccountState(StaticAccountState $) {
        this.accessKey = $.accessKey;
        this.createTime = $.createTime;
        this.instanceId = $.instanceId;
        this.masterUid = $.masterUid;
        this.password = $.password;
        this.secretKey = $.secretKey;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticAccountState $;

        public Builder() {
            $ = new StaticAccountState();
        }

        public Builder(StaticAccountState defaults) {
            $ = new StaticAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param createTime The timestamp that indicates when the pair of static username and password was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<Integer> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp that indicates when the pair of static username and password was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(Integer createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param instanceId Amqp instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Amqp instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param masterUid The ID of the user&#39;s primary account.
         * 
         * @return builder
         * 
         */
        public Builder masterUid(@Nullable Output<String> masterUid) {
            $.masterUid = masterUid;
            return this;
        }

        /**
         * @param masterUid The ID of the user&#39;s primary account.
         * 
         * @return builder
         * 
         */
        public Builder masterUid(String masterUid) {
            return masterUid(Output.of(masterUid));
        }

        /**
         * @param password The static password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The static password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param secretKey Secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param userName The static username.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The static username.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public StaticAccountState build() {
            return $;
        }
    }

}

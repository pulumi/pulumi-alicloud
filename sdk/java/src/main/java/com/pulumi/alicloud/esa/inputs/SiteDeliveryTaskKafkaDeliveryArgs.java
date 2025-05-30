// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteDeliveryTaskKafkaDeliveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteDeliveryTaskKafkaDeliveryArgs Empty = new SiteDeliveryTaskKafkaDeliveryArgs();

    @Import(name="balancer")
    private @Nullable Output<String> balancer;

    public Optional<Output<String>> balancer() {
        return Optional.ofNullable(this.balancer);
    }

    @Import(name="brokers")
    private @Nullable Output<List<String>> brokers;

    public Optional<Output<List<String>>> brokers() {
        return Optional.ofNullable(this.brokers);
    }

    /**
     * The compression method. By default, data is not compressed.
     * 
     */
    @Import(name="compress")
    private @Nullable Output<String> compress;

    /**
     * @return The compression method. By default, data is not compressed.
     * 
     */
    public Optional<Output<String>> compress() {
        return Optional.ofNullable(this.compress);
    }

    @Import(name="machanismType")
    private @Nullable Output<String> machanismType;

    public Optional<Output<String>> machanismType() {
        return Optional.ofNullable(this.machanismType);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="topic")
    private @Nullable Output<String> topic;

    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    @Import(name="userAuth")
    private @Nullable Output<Boolean> userAuth;

    public Optional<Output<Boolean>> userAuth() {
        return Optional.ofNullable(this.userAuth);
    }

    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SiteDeliveryTaskKafkaDeliveryArgs() {}

    private SiteDeliveryTaskKafkaDeliveryArgs(SiteDeliveryTaskKafkaDeliveryArgs $) {
        this.balancer = $.balancer;
        this.brokers = $.brokers;
        this.compress = $.compress;
        this.machanismType = $.machanismType;
        this.password = $.password;
        this.topic = $.topic;
        this.userAuth = $.userAuth;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteDeliveryTaskKafkaDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteDeliveryTaskKafkaDeliveryArgs $;

        public Builder() {
            $ = new SiteDeliveryTaskKafkaDeliveryArgs();
        }

        public Builder(SiteDeliveryTaskKafkaDeliveryArgs defaults) {
            $ = new SiteDeliveryTaskKafkaDeliveryArgs(Objects.requireNonNull(defaults));
        }

        public Builder balancer(@Nullable Output<String> balancer) {
            $.balancer = balancer;
            return this;
        }

        public Builder balancer(String balancer) {
            return balancer(Output.of(balancer));
        }

        public Builder brokers(@Nullable Output<List<String>> brokers) {
            $.brokers = brokers;
            return this;
        }

        public Builder brokers(List<String> brokers) {
            return brokers(Output.of(brokers));
        }

        public Builder brokers(String... brokers) {
            return brokers(List.of(brokers));
        }

        /**
         * @param compress The compression method. By default, data is not compressed.
         * 
         * @return builder
         * 
         */
        public Builder compress(@Nullable Output<String> compress) {
            $.compress = compress;
            return this;
        }

        /**
         * @param compress The compression method. By default, data is not compressed.
         * 
         * @return builder
         * 
         */
        public Builder compress(String compress) {
            return compress(Output.of(compress));
        }

        public Builder machanismType(@Nullable Output<String> machanismType) {
            $.machanismType = machanismType;
            return this;
        }

        public Builder machanismType(String machanismType) {
            return machanismType(Output.of(machanismType));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public Builder userAuth(@Nullable Output<Boolean> userAuth) {
            $.userAuth = userAuth;
            return this;
        }

        public Builder userAuth(Boolean userAuth) {
            return userAuth(Output.of(userAuth));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public SiteDeliveryTaskKafkaDeliveryArgs build() {
            return $;
        }
    }

}

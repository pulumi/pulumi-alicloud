// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final TopicSubscriptionState Empty = new TopicSubscriptionState();

    /**
     * The endpoint has three format. Available values format:
     * - `HTTP Format`: http://xxx.com/xxx
     * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - `Email Format`: mail:directmail:{MailAddress}
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The endpoint has three format. Available values format:
     * - `HTTP Format`: http://xxx.com/xxx
     * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - `Email Format`: mail:directmail:{MailAddress}
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The length should be shorter than 16.
     * 
     */
    @Import(name="filterTag")
    private @Nullable Output<String> filterTag;

    /**
     * @return The length should be shorter than 16.
     * 
     */
    public Optional<Output<String>> filterTag() {
        return Optional.ofNullable(this.filterTag);
    }

    /**
     * Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. The valid values: `SIMPLIFIED`, `XML` and `JSON`. Default to `SIMPLIFIED`.
     * 
     */
    @Import(name="notifyContentFormat")
    private @Nullable Output<String> notifyContentFormat;

    /**
     * @return The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. The valid values: `SIMPLIFIED`, `XML` and `JSON`. Default to `SIMPLIFIED`.
     * 
     */
    public Optional<Output<String>> notifyContentFormat() {
        return Optional.ofNullable(this.notifyContentFormat);
    }

    /**
     * The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. The Valid values: `EXPONENTIAL_DECAY_RETRY` and `BACKOFF_RETRY`. Default value to `BACKOFF_RETRY` .
     * 
     */
    @Import(name="notifyStrategy")
    private @Nullable Output<String> notifyStrategy;

    /**
     * @return The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. The Valid values: `EXPONENTIAL_DECAY_RETRY` and `BACKOFF_RETRY`. Default value to `BACKOFF_RETRY` .
     * 
     */
    public Optional<Output<String>> notifyStrategy() {
        return Optional.ofNullable(this.notifyStrategy);
    }

    /**
     * The topic which The subscription belongs to was named with the name.A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    @Import(name="topicName")
    private @Nullable Output<String> topicName;

    /**
     * @return The topic which The subscription belongs to was named with the name.A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
     * 
     */
    public Optional<Output<String>> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private TopicSubscriptionState() {}

    private TopicSubscriptionState(TopicSubscriptionState $) {
        this.endpoint = $.endpoint;
        this.filterTag = $.filterTag;
        this.name = $.name;
        this.notifyContentFormat = $.notifyContentFormat;
        this.notifyStrategy = $.notifyStrategy;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicSubscriptionState $;

        public Builder() {
            $ = new TopicSubscriptionState();
        }

        public Builder(TopicSubscriptionState defaults) {
            $ = new TopicSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The endpoint has three format. Available values format:
         * - `HTTP Format`: http://xxx.com/xxx
         * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
         * - `Email Format`: mail:directmail:{MailAddress}
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The endpoint has three format. Available values format:
         * - `HTTP Format`: http://xxx.com/xxx
         * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
         * - `Email Format`: mail:directmail:{MailAddress}
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param filterTag The length should be shorter than 16.
         * 
         * @return builder
         * 
         */
        public Builder filterTag(@Nullable Output<String> filterTag) {
            $.filterTag = filterTag;
            return this;
        }

        /**
         * @param filterTag The length should be shorter than 16.
         * 
         * @return builder
         * 
         */
        public Builder filterTag(String filterTag) {
            return filterTag(Output.of(filterTag));
        }

        /**
         * @param name Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifyContentFormat The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. The valid values: `SIMPLIFIED`, `XML` and `JSON`. Default to `SIMPLIFIED`.
         * 
         * @return builder
         * 
         */
        public Builder notifyContentFormat(@Nullable Output<String> notifyContentFormat) {
            $.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * @param notifyContentFormat The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. The valid values: `SIMPLIFIED`, `XML` and `JSON`. Default to `SIMPLIFIED`.
         * 
         * @return builder
         * 
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            return notifyContentFormat(Output.of(notifyContentFormat));
        }

        /**
         * @param notifyStrategy The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. The Valid values: `EXPONENTIAL_DECAY_RETRY` and `BACKOFF_RETRY`. Default value to `BACKOFF_RETRY` .
         * 
         * @return builder
         * 
         */
        public Builder notifyStrategy(@Nullable Output<String> notifyStrategy) {
            $.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * @param notifyStrategy The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. The Valid values: `EXPONENTIAL_DECAY_RETRY` and `BACKOFF_RETRY`. Default value to `BACKOFF_RETRY` .
         * 
         * @return builder
         * 
         */
        public Builder notifyStrategy(String notifyStrategy) {
            return notifyStrategy(Output.of(notifyStrategy));
        }

        /**
         * @param topicName The topic which The subscription belongs to was named with the name.A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The topic which The subscription belongs to was named with the name.A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public TopicSubscriptionState build() {
            return $;
        }
    }

}

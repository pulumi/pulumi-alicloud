// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.aligreen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CallbackState extends com.pulumi.resources.ResourceArgs {

    public static final CallbackState Empty = new CallbackState();

    /**
     * The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
     * 
     */
    @Import(name="callbackName")
    private @Nullable Output<String> callbackName;

    /**
     * @return The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
     * 
     */
    public Optional<Output<String>> callbackName() {
        return Optional.ofNullable(this.callbackName);
    }

    /**
     * List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
     * 
     */
    @Import(name="callbackSuggestions")
    private @Nullable Output<List<String>> callbackSuggestions;

    /**
     * @return List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
     * 
     */
    public Optional<Output<List<String>>> callbackSuggestions() {
        return Optional.ofNullable(this.callbackSuggestions);
    }

    /**
     * A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
     * 
     */
    @Import(name="callbackTypes")
    private @Nullable Output<List<String>> callbackTypes;

    /**
     * @return A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
     * 
     */
    public Optional<Output<List<String>>> callbackTypes() {
        return Optional.ofNullable(this.callbackTypes);
    }

    /**
     * The detection result will be called back to the url.
     * 
     */
    @Import(name="callbackUrl")
    private @Nullable Output<String> callbackUrl;

    /**
     * @return The detection result will be called back to the url.
     * 
     */
    public Optional<Output<String>> callbackUrl() {
        return Optional.ofNullable(this.callbackUrl);
    }

    /**
     * The creation time of the Callback.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the Callback.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The encryption algorithm is used to verify that the callback request is sent by the Aliyun Green Service to your business service. Value: 0:SHA256,1: SM3.
     * 
     */
    @Import(name="cryptType")
    private @Nullable Output<Integer> cryptType;

    /**
     * @return The encryption algorithm is used to verify that the callback request is sent by the Aliyun Green Service to your business service. Value: 0:SHA256,1: SM3.
     * 
     */
    public Optional<Output<Integer>> cryptType() {
        return Optional.ofNullable(this.cryptType);
    }

    private CallbackState() {}

    private CallbackState(CallbackState $) {
        this.callbackName = $.callbackName;
        this.callbackSuggestions = $.callbackSuggestions;
        this.callbackTypes = $.callbackTypes;
        this.callbackUrl = $.callbackUrl;
        this.createTime = $.createTime;
        this.cryptType = $.cryptType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CallbackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallbackState $;

        public Builder() {
            $ = new CallbackState();
        }

        public Builder(CallbackState defaults) {
            $ = new CallbackState(Objects.requireNonNull(defaults));
        }

        /**
         * @param callbackName The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder callbackName(@Nullable Output<String> callbackName) {
            $.callbackName = callbackName;
            return this;
        }

        /**
         * @param callbackName The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder callbackName(String callbackName) {
            return callbackName(Output.of(callbackName));
        }

        /**
         * @param callbackSuggestions List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
         * 
         * @return builder
         * 
         */
        public Builder callbackSuggestions(@Nullable Output<List<String>> callbackSuggestions) {
            $.callbackSuggestions = callbackSuggestions;
            return this;
        }

        /**
         * @param callbackSuggestions List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
         * 
         * @return builder
         * 
         */
        public Builder callbackSuggestions(List<String> callbackSuggestions) {
            return callbackSuggestions(Output.of(callbackSuggestions));
        }

        /**
         * @param callbackSuggestions List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
         * 
         * @return builder
         * 
         */
        public Builder callbackSuggestions(String... callbackSuggestions) {
            return callbackSuggestions(List.of(callbackSuggestions));
        }

        /**
         * @param callbackTypes A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
         * 
         * @return builder
         * 
         */
        public Builder callbackTypes(@Nullable Output<List<String>> callbackTypes) {
            $.callbackTypes = callbackTypes;
            return this;
        }

        /**
         * @param callbackTypes A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
         * 
         * @return builder
         * 
         */
        public Builder callbackTypes(List<String> callbackTypes) {
            return callbackTypes(Output.of(callbackTypes));
        }

        /**
         * @param callbackTypes A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
         * 
         * @return builder
         * 
         */
        public Builder callbackTypes(String... callbackTypes) {
            return callbackTypes(List.of(callbackTypes));
        }

        /**
         * @param callbackUrl The detection result will be called back to the url.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(@Nullable Output<String> callbackUrl) {
            $.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * @param callbackUrl The detection result will be called back to the url.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(String callbackUrl) {
            return callbackUrl(Output.of(callbackUrl));
        }

        /**
         * @param createTime The creation time of the Callback.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the Callback.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param cryptType The encryption algorithm is used to verify that the callback request is sent by the Aliyun Green Service to your business service. Value: 0:SHA256,1: SM3.
         * 
         * @return builder
         * 
         */
        public Builder cryptType(@Nullable Output<Integer> cryptType) {
            $.cryptType = cryptType;
            return this;
        }

        /**
         * @param cryptType The encryption algorithm is used to verify that the callback request is sent by the Aliyun Green Service to your business service. Value: 0:SHA256,1: SM3.
         * 
         * @return builder
         * 
         */
        public Builder cryptType(Integer cryptType) {
            return cryptType(Output.of(cryptType));
        }

        public CallbackState build() {
            return $;
        }
    }

}
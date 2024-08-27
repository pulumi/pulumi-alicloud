// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.aligreen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CallbackArgs extends com.pulumi.resources.ResourceArgs {

    public static final CallbackArgs Empty = new CallbackArgs();

    /**
     * The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
     * 
     */
    @Import(name="callbackName", required=true)
    private Output<String> callbackName;

    /**
     * @return The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
     * 
     */
    public Output<String> callbackName() {
        return this.callbackName;
    }

    /**
     * List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
     * 
     */
    @Import(name="callbackSuggestions", required=true)
    private Output<List<String>> callbackSuggestions;

    /**
     * @return List of audit results supported by message notification. Value: block: confirmed violation, review: Suspected violation, review: normal.
     * 
     */
    public Output<List<String>> callbackSuggestions() {
        return this.callbackSuggestions;
    }

    /**
     * A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
     * 
     */
    @Import(name="callbackTypes", required=true)
    private Output<List<String>> callbackTypes;

    /**
     * @return A list of Callback types. Value: machineScan: Machine audit result notification, selfAudit: self-service audit notification.
     * 
     */
    public Output<List<String>> callbackTypes() {
        return this.callbackTypes;
    }

    /**
     * The detection result will be called back to the url.
     * 
     */
    @Import(name="callbackUrl", required=true)
    private Output<String> callbackUrl;

    /**
     * @return The detection result will be called back to the url.
     * 
     */
    public Output<String> callbackUrl() {
        return this.callbackUrl;
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

    private CallbackArgs() {}

    private CallbackArgs(CallbackArgs $) {
        this.callbackName = $.callbackName;
        this.callbackSuggestions = $.callbackSuggestions;
        this.callbackTypes = $.callbackTypes;
        this.callbackUrl = $.callbackUrl;
        this.cryptType = $.cryptType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CallbackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallbackArgs $;

        public Builder() {
            $ = new CallbackArgs();
        }

        public Builder(CallbackArgs defaults) {
            $ = new CallbackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param callbackName The Callback name defined by the customer. It can contain no more than 20 characters in Chinese, English, underscore (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder callbackName(Output<String> callbackName) {
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
        public Builder callbackSuggestions(Output<List<String>> callbackSuggestions) {
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
        public Builder callbackTypes(Output<List<String>> callbackTypes) {
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
        public Builder callbackUrl(Output<String> callbackUrl) {
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

        public CallbackArgs build() {
            if ($.callbackName == null) {
                throw new MissingRequiredPropertyException("CallbackArgs", "callbackName");
            }
            if ($.callbackSuggestions == null) {
                throw new MissingRequiredPropertyException("CallbackArgs", "callbackSuggestions");
            }
            if ($.callbackTypes == null) {
                throw new MissingRequiredPropertyException("CallbackArgs", "callbackTypes");
            }
            if ($.callbackUrl == null) {
                throw new MissingRequiredPropertyException("CallbackArgs", "callbackUrl");
            }
            return $;
        }
    }

}
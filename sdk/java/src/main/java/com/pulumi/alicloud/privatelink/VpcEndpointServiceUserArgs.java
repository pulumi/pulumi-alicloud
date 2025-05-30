// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceUserArgs Empty = new VpcEndpointServiceUserArgs();

    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The endpoint service ID.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The endpoint service ID.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * The whitelist in the format of ARN.
     * 
     */
    @Import(name="userArn")
    private @Nullable Output<String> userArn;

    /**
     * @return The whitelist in the format of ARN.
     * 
     */
    public Optional<Output<String>> userArn() {
        return Optional.ofNullable(this.userArn);
    }

    /**
     * The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private VpcEndpointServiceUserArgs() {}

    private VpcEndpointServiceUserArgs(VpcEndpointServiceUserArgs $) {
        this.dryRun = $.dryRun;
        this.serviceId = $.serviceId;
        this.userArn = $.userArn;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceUserArgs $;

        public Builder() {
            $ = new VpcEndpointServiceUserArgs();
        }

        public Builder(VpcEndpointServiceUserArgs defaults) {
            $ = new VpcEndpointServiceUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param userArn The whitelist in the format of ARN.
         * 
         * @return builder
         * 
         */
        public Builder userArn(@Nullable Output<String> userArn) {
            $.userArn = userArn;
            return this;
        }

        /**
         * @param userArn The whitelist in the format of ARN.
         * 
         * @return builder
         * 
         */
        public Builder userArn(String userArn) {
            return userArn(Output.of(userArn));
        }

        /**
         * @param userId The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public VpcEndpointServiceUserArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("VpcEndpointServiceUserArgs", "serviceId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("VpcEndpointServiceUserArgs", "userId");
            }
            return $;
        }
    }

}

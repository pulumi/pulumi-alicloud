// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.alicloud.oss.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import com.pulumi.alicloud.oss.inputs.AccessPointVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointState extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointState Empty = new AccessPointState();

    /**
     * The name of the access point
     * 
     */
    @Import(name="accessPointName")
    private @Nullable Output<String> accessPointName;

    /**
     * @return The name of the access point
     * 
     */
    public Optional<Output<String>> accessPointName() {
        return Optional.ofNullable(this.accessPointName);
    }

    /**
     * The Bucket to which the current access point belongs.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The Bucket to which the current access point belongs.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Access point network source. The valid values are as follows:
     * - vpc: only the specified VPC ID can be used to access the access point.
     * - internet: the access point can be accessed through both external and internal Endpoint.
     * 
     */
    @Import(name="networkOrigin")
    private @Nullable Output<String> networkOrigin;

    /**
     * @return Access point network source. The valid values are as follows:
     * - vpc: only the specified VPC ID can be used to access the access point.
     * - internet: the access point can be accessed through both external and internal Endpoint.
     * 
     */
    public Optional<Output<String>> networkOrigin() {
        return Optional.ofNullable(this.networkOrigin);
    }

    /**
     * Configuration of Access Point Blocking Public Access See `public_access_block_configuration` below.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
    private @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    /**
     * @return Configuration of Access Point Blocking Public Access See `public_access_block_configuration` below.
     * 
     */
    public Optional<Output<AccessPointPublicAccessBlockConfigurationArgs>> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }

    /**
     * The status of the resource
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * If the Network Origin is vpc, the VPC source information is saved here. See `vpc_configuration` below.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration;

    /**
     * @return If the Network Origin is vpc, the VPC source information is saved here. See `vpc_configuration` below.
     * 
     */
    public Optional<Output<AccessPointVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private AccessPointState() {}

    private AccessPointState(AccessPointState $) {
        this.accessPointName = $.accessPointName;
        this.bucket = $.bucket;
        this.networkOrigin = $.networkOrigin;
        this.publicAccessBlockConfiguration = $.publicAccessBlockConfiguration;
        this.status = $.status;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointState $;

        public Builder() {
            $ = new AccessPointState();
        }

        public Builder(AccessPointState defaults) {
            $ = new AccessPointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointName The name of the access point
         * 
         * @return builder
         * 
         */
        public Builder accessPointName(@Nullable Output<String> accessPointName) {
            $.accessPointName = accessPointName;
            return this;
        }

        /**
         * @param accessPointName The name of the access point
         * 
         * @return builder
         * 
         */
        public Builder accessPointName(String accessPointName) {
            return accessPointName(Output.of(accessPointName));
        }

        /**
         * @param bucket The Bucket to which the current access point belongs.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The Bucket to which the current access point belongs.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param networkOrigin Access point network source. The valid values are as follows:
         * - vpc: only the specified VPC ID can be used to access the access point.
         * - internet: the access point can be accessed through both external and internal Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder networkOrigin(@Nullable Output<String> networkOrigin) {
            $.networkOrigin = networkOrigin;
            return this;
        }

        /**
         * @param networkOrigin Access point network source. The valid values are as follows:
         * - vpc: only the specified VPC ID can be used to access the access point.
         * - internet: the access point can be accessed through both external and internal Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder networkOrigin(String networkOrigin) {
            return networkOrigin(Output.of(networkOrigin));
        }

        /**
         * @param publicAccessBlockConfiguration Configuration of Access Point Blocking Public Access See `public_access_block_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(@Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            $.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        /**
         * @param publicAccessBlockConfiguration Configuration of Access Point Blocking Public Access See `public_access_block_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(AccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            return publicAccessBlockConfiguration(Output.of(publicAccessBlockConfiguration));
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcConfiguration If the Network Origin is vpc, the VPC source information is saved here. See `vpc_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration If the Network Origin is vpc, the VPC source information is saved here. See `vpc_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(AccessPointVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public AccessPointState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.oss.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import com.pulumi.alicloud.oss.inputs.AccessPointVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * The name of the access point
     * 
     */
    @Import(name="accessPointName", required=true)
    private Output<String> accessPointName;

    /**
     * @return The name of the access point
     * 
     */
    public Output<String> accessPointName() {
        return this.accessPointName;
    }

    /**
     * The Bucket to which the current access point belongs.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The Bucket to which the current access point belongs.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Access point network source. The valid values are as follows:
     * - vpc: only the specified VPC ID can be used to access the access point.
     * - internet: the access point can be accessed through both external and internal Endpoint.
     * 
     */
    @Import(name="networkOrigin", required=true)
    private Output<String> networkOrigin;

    /**
     * @return Access point network source. The valid values are as follows:
     * - vpc: only the specified VPC ID can be used to access the access point.
     * - internet: the access point can be accessed through both external and internal Endpoint.
     * 
     */
    public Output<String> networkOrigin() {
        return this.networkOrigin;
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

    private AccessPointArgs() {}

    private AccessPointArgs(AccessPointArgs $) {
        this.accessPointName = $.accessPointName;
        this.bucket = $.bucket;
        this.networkOrigin = $.networkOrigin;
        this.publicAccessBlockConfiguration = $.publicAccessBlockConfiguration;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointArgs $;

        public Builder() {
            $ = new AccessPointArgs();
        }

        public Builder(AccessPointArgs defaults) {
            $ = new AccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointName The name of the access point
         * 
         * @return builder
         * 
         */
        public Builder accessPointName(Output<String> accessPointName) {
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
        public Builder bucket(Output<String> bucket) {
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
        public Builder networkOrigin(Output<String> networkOrigin) {
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

        public AccessPointArgs build() {
            if ($.accessPointName == null) {
                throw new MissingRequiredPropertyException("AccessPointArgs", "accessPointName");
            }
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("AccessPointArgs", "bucket");
            }
            if ($.networkOrigin == null) {
                throw new MissingRequiredPropertyException("AccessPointArgs", "networkOrigin");
            }
            return $;
        }
    }

}
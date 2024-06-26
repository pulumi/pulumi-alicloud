// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicIpAddressPoolCidrBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicIpAddressPoolCidrBlockArgs Empty = new PublicIpAddressPoolCidrBlockArgs();

    /**
     * The CIDR block.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The CIDR block.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * IP address and network segment mask. After you enter the mask, the system automatically allocates the IP address network segment. Value range: **24** to **28**.
     * &gt; **NOTE:**  **CidrBlock** and **CidrMask** cannot be configured at the same time. Select one of them to configure.
     * 
     */
    @Import(name="cidrMask")
    private @Nullable Output<Integer> cidrMask;

    /**
     * @return IP address and network segment mask. After you enter the mask, the system automatically allocates the IP address network segment. Value range: **24** to **28**.
     * &gt; **NOTE:**  **CidrBlock** and **CidrMask** cannot be configured at the same time. Select one of them to configure.
     * 
     */
    public Optional<Output<Integer>> cidrMask() {
        return Optional.ofNullable(this.cidrMask);
    }

    /**
     * The ID of the VPC Public IP address pool.
     * 
     */
    @Import(name="publicIpAddressPoolId", required=true)
    private Output<String> publicIpAddressPoolId;

    /**
     * @return The ID of the VPC Public IP address pool.
     * 
     */
    public Output<String> publicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    private PublicIpAddressPoolCidrBlockArgs() {}

    private PublicIpAddressPoolCidrBlockArgs(PublicIpAddressPoolCidrBlockArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.cidrMask = $.cidrMask;
        this.publicIpAddressPoolId = $.publicIpAddressPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIpAddressPoolCidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIpAddressPoolCidrBlockArgs $;

        public Builder() {
            $ = new PublicIpAddressPoolCidrBlockArgs();
        }

        public Builder(PublicIpAddressPoolCidrBlockArgs defaults) {
            $ = new PublicIpAddressPoolCidrBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock The CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param cidrMask IP address and network segment mask. After you enter the mask, the system automatically allocates the IP address network segment. Value range: **24** to **28**.
         * &gt; **NOTE:**  **CidrBlock** and **CidrMask** cannot be configured at the same time. Select one of them to configure.
         * 
         * @return builder
         * 
         */
        public Builder cidrMask(@Nullable Output<Integer> cidrMask) {
            $.cidrMask = cidrMask;
            return this;
        }

        /**
         * @param cidrMask IP address and network segment mask. After you enter the mask, the system automatically allocates the IP address network segment. Value range: **24** to **28**.
         * &gt; **NOTE:**  **CidrBlock** and **CidrMask** cannot be configured at the same time. Select one of them to configure.
         * 
         * @return builder
         * 
         */
        public Builder cidrMask(Integer cidrMask) {
            return cidrMask(Output.of(cidrMask));
        }

        /**
         * @param publicIpAddressPoolId The ID of the VPC Public IP address pool.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolId(Output<String> publicIpAddressPoolId) {
            $.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * @param publicIpAddressPoolId The ID of the VPC Public IP address pool.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            return publicIpAddressPoolId(Output.of(publicIpAddressPoolId));
        }

        public PublicIpAddressPoolCidrBlockArgs build() {
            if ($.publicIpAddressPoolId == null) {
                throw new MissingRequiredPropertyException("PublicIpAddressPoolCidrBlockArgs", "publicIpAddressPoolId");
            }
            return $;
        }
    }

}

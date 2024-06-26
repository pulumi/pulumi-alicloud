// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetPublicIpAddressPoolCidrBlocksBlock;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIpAddressPoolCidrBlocksResult {
    /**
     * @return A list of Vpc Public Ip Address Pool Cidr Blocks. Each element contains the following attributes:
     * 
     */
    private List<GetPublicIpAddressPoolCidrBlocksBlock> blocks;
    /**
     * @return The CIDR block.
     * 
     */
    private @Nullable String cidrBlock;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    /**
     * @return The ID of the Vpc Public IP address pool.
     * 
     */
    private String publicIpAddressPoolId;
    /**
     * @return The status of the CIDR block in the Vpc Public IP address pool.
     * 
     */
    private @Nullable String status;

    private GetPublicIpAddressPoolCidrBlocksResult() {}
    /**
     * @return A list of Vpc Public Ip Address Pool Cidr Blocks. Each element contains the following attributes:
     * 
     */
    public List<GetPublicIpAddressPoolCidrBlocksBlock> blocks() {
        return this.blocks;
    }
    /**
     * @return The CIDR block.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The ID of the Vpc Public IP address pool.
     * 
     */
    public String publicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }
    /**
     * @return The status of the CIDR block in the Vpc Public IP address pool.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIpAddressPoolCidrBlocksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPublicIpAddressPoolCidrBlocksBlock> blocks;
        private @Nullable String cidrBlock;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private String publicIpAddressPoolId;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetPublicIpAddressPoolCidrBlocksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blocks = defaults.blocks;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.publicIpAddressPoolId = defaults.publicIpAddressPoolId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder blocks(List<GetPublicIpAddressPoolCidrBlocksBlock> blocks) {
            if (blocks == null) {
              throw new MissingRequiredPropertyException("GetPublicIpAddressPoolCidrBlocksResult", "blocks");
            }
            this.blocks = blocks;
            return this;
        }
        public Builder blocks(GetPublicIpAddressPoolCidrBlocksBlock... blocks) {
            return blocks(List.of(blocks));
        }
        @CustomType.Setter
        public Builder cidrBlock(@Nullable String cidrBlock) {

            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPublicIpAddressPoolCidrBlocksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetPublicIpAddressPoolCidrBlocksResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            if (publicIpAddressPoolId == null) {
              throw new MissingRequiredPropertyException("GetPublicIpAddressPoolCidrBlocksResult", "publicIpAddressPoolId");
            }
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetPublicIpAddressPoolCidrBlocksResult build() {
            final var _resultValue = new GetPublicIpAddressPoolCidrBlocksResult();
            _resultValue.blocks = blocks;
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.publicIpAddressPoolId = publicIpAddressPoolId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}

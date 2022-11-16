// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AddressPoolAddress {
    /**
     * @return The address that you want to add to the address pool.
     * 
     */
    private final String address;
    /**
     * @return The source region of the address. expressed as a JSON string. The structure is as follows:
     * * `LineCodes`: List of home lineCodes.
     * * `lineCodeRectifyType`: The rectification type of the line code. Default value: `AUTO`. Valid values: `NO_NEED`: no need for rectification. `RECTIFIED`: rectified. `AUTO`: automatic rectification.
     * 
     */
    private final String attributeInfo;
    /**
     * @return The weight of the address. **NOTE:** The attribute is valid when the attribute `lba_strategy` is `RATIO`.
     * 
     */
    private final @Nullable Integer lbaWeight;
    /**
     * @return The type of the address. Valid values:`SMART`, `ONLINE` and `OFFLINE`.
     * 
     */
    private final String mode;
    /**
     * @return The description of the address.
     * 
     */
    private final @Nullable String remark;

    @CustomType.Constructor
    private AddressPoolAddress(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("attributeInfo") String attributeInfo,
        @CustomType.Parameter("lbaWeight") @Nullable Integer lbaWeight,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("remark") @Nullable String remark) {
        this.address = address;
        this.attributeInfo = attributeInfo;
        this.lbaWeight = lbaWeight;
        this.mode = mode;
        this.remark = remark;
    }

    /**
     * @return The address that you want to add to the address pool.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The source region of the address. expressed as a JSON string. The structure is as follows:
     * * `LineCodes`: List of home lineCodes.
     * * `lineCodeRectifyType`: The rectification type of the line code. Default value: `AUTO`. Valid values: `NO_NEED`: no need for rectification. `RECTIFIED`: rectified. `AUTO`: automatic rectification.
     * 
     */
    public String attributeInfo() {
        return this.attributeInfo;
    }
    /**
     * @return The weight of the address. **NOTE:** The attribute is valid when the attribute `lba_strategy` is `RATIO`.
     * 
     */
    public Optional<Integer> lbaWeight() {
        return Optional.ofNullable(this.lbaWeight);
    }
    /**
     * @return The type of the address. Valid values:`SMART`, `ONLINE` and `OFFLINE`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The description of the address.
     * 
     */
    public Optional<String> remark() {
        return Optional.ofNullable(this.remark);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressPoolAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String attributeInfo;
        private @Nullable Integer lbaWeight;
        private String mode;
        private @Nullable String remark;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressPoolAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.attributeInfo = defaults.attributeInfo;
    	      this.lbaWeight = defaults.lbaWeight;
    	      this.mode = defaults.mode;
    	      this.remark = defaults.remark;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder attributeInfo(String attributeInfo) {
            this.attributeInfo = Objects.requireNonNull(attributeInfo);
            return this;
        }
        public Builder lbaWeight(@Nullable Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder remark(@Nullable String remark) {
            this.remark = remark;
            return this;
        }        public AddressPoolAddress build() {
            return new AddressPoolAddress(address, attributeInfo, lbaWeight, mode, remark);
        }
    }
}